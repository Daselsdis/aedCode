package aed.urgencias;

import java.util.Iterator;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.lifo.LIFO;
import es.upm.aedlib.lifo.LIFOArray;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class UrgenciasAED implements Urgencias {
    HashTableMap<String, Paciente> list = new HashTableMap<>();
    Pair<Integer, Integer> infoEsp = new Pair<Integer, Integer>(0, 0);

    @Override
    public Paciente admitirPaciente(String DNI, int prioridad, int hora) throws PacienteExisteException {
        if (doesPacientExist(DNI))
            throw new PacienteExisteException();
        Paciente pac = new Paciente(DNI, prioridad, hora, hora);
        list.put(DNI, pac);
        return pac;
    }

    private boolean doesPacientExist(String DNI) {
        return list.containsKey(DNI);
    }

    @Override
    public Paciente salirPaciente(String DNI, int hora) throws PacienteNoExisteException {
        if (!doesPacientExist(DNI))
            throw new PacienteNoExisteException();
        return list.remove(DNI);
    }

    @Override
    public Paciente cambiarPrioridad(String DNI, int nuevaPrioridad, int hora) throws PacienteNoExisteException {
        if (!doesPacientExist(DNI))
            throw new PacienteNoExisteException();
        Paciente pac = list.get(DNI);
        if (pac.getPrioridad() != nuevaPrioridad) {
            pac.setPrioridad(nuevaPrioridad);
            pac.setTiempoAdmisionEnPrioridad(hora);
            list.put(DNI, pac);
        }
        return pac;
    }

    @Override
    public Paciente atenderPaciente(int hora) {
        Paciente pac = null;
        if (!list.isEmpty()) {
            pac = list.remove(topUrgencia(list));
            infoEsp.setLeft(infoEsp.getLeft() + (hora - pac.getTiempoAdmision()));
            infoEsp.setRight(infoEsp.getRight() + 1);
        }
        return pac;
    }

    private String topUrgencia(HashTableMap<String, Paciente> list) {
        Iterator<Entry<String, Paciente>> i = list.iterator();
        Entry<String, Paciente> current = i.next();
        Entry<String, Paciente> temp;
        String DNImaxImport = current.getKey();
        while (i.hasNext()) {
            temp = i.next();
            if (temp.getValue().compareTo(current.getValue()) < 0) {
                DNImaxImport = temp.getKey();
            }
            current = temp;
        }
        return DNImaxImport;

    }

    @Override
    public void aumentaPrioridad(int maxTiempoEspera, int hora) {
        Iterator<Entry<String, Paciente>> i = list.iterator();
        Paciente pac;
        while (i.hasNext()) {
            pac = i.next().getValue();
            if ((hora - pac.getTiempoAdmisionEnPrioridad()) > maxTiempoEspera) {
                if (pac.getPrioridad() > 0) {
                    pac.setPrioridad(pac.getPrioridad() - 1);
                    pac.setTiempoAdmisionEnPrioridad(hora);
                    list.put(pac.getDNI(), pac);
                }
            }
        }
    }

    @Override
    public Iterable<Paciente> pacientesEsperando() {
        HashTableMap<String, Paciente> temp = new HashTableMap<>(list);
        PositionList<Paciente> colaOrd = new NodePositionList<Paciente>();
        String top;
        Paciente pac;
        while (!temp.isEmpty()) {
            top = topUrgencia(temp);
            pac = temp.remove(top);
            colaOrd.addLast(pac);
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

    public static void main(String[] args) {
        UrgenciasAED urgencias = new UrgenciasAED();

        try {
            urgencias.admitirPaciente("86117476T", 8, 7);
            urgencias.admitirPaciente("42385993N", 5, 9);
            urgencias.aumentaPrioridad(51, 15);
            urgencias.admitirPaciente("66327369B", 6, 25);
            urgencias.atenderPaciente(26);
            urgencias.salirPaciente("86117476T", 27);
            urgencias.admitirPaciente("38154317Y", 2, 31);
            urgencias.admitirPaciente("63647893T", 0, 40);
            urgencias.admitirPaciente("36168393K", 4, 44);
            urgencias.salirPaciente("63647893T", 48);
            urgencias.atenderPaciente(54);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
