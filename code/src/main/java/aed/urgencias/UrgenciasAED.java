package aed.urgencias;

import java.util.Iterator;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.priorityqueue.SortedListPriorityQueue;

public class UrgenciasAED implements Urgencias {
    HashTableMap<String, Paciente> list = new HashTableMap<>();
    PriorityQueue<Paciente, Paciente> listaOrdenada = new SortedListPriorityQueue<>();
    Pair<Integer, Integer> infoEsp = new Pair<Integer, Integer>(0, 0);

    @Override
    public Paciente admitirPaciente(String DNI, int prioridad, int hora) throws PacienteExisteException {
        if (list.containsKey(DNI))
            throw new PacienteExisteException();
        Paciente pac = new Paciente(DNI, prioridad, hora, hora);
        list.put(DNI, pac);
        listaOrdenada.enqueue(pac, pac);
        return pac;
    }

    @Override
    public Paciente salirPaciente(String DNI, int hora) throws PacienteNoExisteException {
        if (!list.containsKey(DNI))
            throw new PacienteNoExisteException();
        Paciente pac = list.remove(DNI);
        Entry<Paciente, Paciente> e = findEntry(DNI);
        listaOrdenada.remove(e);
        return pac;
    }

    private Entry<Paciente, Paciente> findEntry(String DNI) {
        Iterator<Entry<Paciente, Paciente>> i = listaOrdenada.iterator();
        boolean done = false;
        Entry<Paciente, Paciente> e = null;
        while (i.hasNext() && !done) {
            e = i.next();
            done = e.getKey().getDNI().equals(DNI);
        }
        return e;
    }

    @Override
    public Paciente cambiarPrioridad(String DNI, int nuevaPrioridad, int hora) throws PacienteNoExisteException {
        if (!list.containsKey(DNI))
            throw new PacienteNoExisteException();
        Paciente pac = list.get(DNI);
        if (pac.getPrioridad() != nuevaPrioridad) {
            listaOrdenada.remove(findEntry(DNI));
            pac.setPrioridad(nuevaPrioridad);
            pac.setTiempoAdmisionEnPrioridad(hora);
            listaOrdenada.enqueue(pac, pac);
            list.put(DNI, pac);
        }
        return pac;
    }

    @Override
    public Paciente atenderPaciente(int hora) {
        Paciente pac = null;
        if (!list.isEmpty()) {
            pac = list.remove(listaOrdenada.first().getKey().getDNI());
            listaOrdenada.remove(findEntry(pac.getDNI()));
            infoEsp.setLeft(infoEsp.getLeft() + (hora - pac.getTiempoAdmision()));
            infoEsp.setRight(infoEsp.getRight() + 1);
        }
        return pac;
    }

    @Override
    public void aumentaPrioridad(int maxTiempoEspera, int hora) {
        Iterator<Entry<String, Paciente>> i = list.iterator();
        Paciente pac;
        while (i.hasNext()) {
            pac = i.next().getValue();
            if ((hora - pac.getTiempoAdmisionEnPrioridad()) > maxTiempoEspera) {
                if (pac.getPrioridad() > 0) {
                    try {
                        cambiarPrioridad(pac.getDNI(), pac.getPrioridad() - 1, hora);
                    } catch (PacienteNoExisteException e) {
                        // unreachable state
                        e.printStackTrace();
                    }
                    // TODO: maybe do this stuff locally without error handling?
                    // listaOrdenada.remove(findEntry(pac.getDNI()));
                    // pac.setPrioridad(pac.getPrioridad() - 1);
                    // pac.setTiempoAdmisionEnPrioridad(hora);
                    // list.put(pac.getDNI(), pac);
                }
            }
        }
    }

    @Override
    public Iterable<Paciente> pacientesEsperando() {
        Iterator<Entry<Paciente, Paciente>> i = listaOrdenada.iterator();
        PositionList<Paciente> colaOrd = new NodePositionList<Paciente>();
        while (i.hasNext()) {
            colaOrd.addLast(i.next().getKey());
        }
        return colaOrd;
    }

    @Override
    public Paciente getPaciente(String DNI) {
        return list.get(DNI);
    }

    @Override
    public Pair<Integer, Integer> informacionEspera() {
        return infoEsp;
    }

}
