package aed.urgencias;

import java.util.Iterator;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class UrgenciasAED implements Urgencias {
    
    PositionList<Paciente> list = new NodePositionList<>();

    @Override
    public Paciente admitirPaciente(String DNI, int prioridad, int hora) throws PacienteExisteException {
        if (doesPacientExist(DNI))
            throw new PacienteExisteException();
        Paciente pac = new Paciente(DNI, prioridad, hora, hora);
        list.addLast(pac);
        return pac;
    }

    private boolean doesPacientExist(String DNI) {
        Iterator<Paciente> I = list.iterator();
        boolean done = false;
        while (I.hasNext() && !done) {
            done = I.next().getDNI() == DNI;
        }
        return done;
    }

    @Override
    public Paciente salirPaciente(String DNI, int hora) throws PacienteNoExisteException {
        if (!doesPacientExist(DNI))
            throw new PacienteNoExisteException();
        return list.remove(getPosPaciente(DNI));
    }

    private Position<Paciente> getPosPaciente(String DNI) {
        Position<Paciente> cursor = list.first();
        boolean done = false;
        if (cursor.element().getDNI() == DNI)
            return cursor;
        while (cursor != null && !done) {
            cursor = list.next(cursor);
            done = cursor.element().getDNI() == DNI;
        }
        return cursor;
    }

    @Override
    public Paciente cambiarPrioridad(String DNI, int nuevaPrioridad, int hora) throws PacienteNoExisteException {
        if (!doesPacientExist(DNI))
            throw new PacienteNoExisteException();
        Position<Paciente> pos = getPosPaciente(DNI);
        Paciente pac = list.remove(pos);
        pac.setPrioridad(nuevaPrioridad);
        pac.setTiempoAdmisionEnPrioridad(hora);
        list.set(pos, pac);
        return pac;
    }

    @Override
    public Paciente atenderPaciente(int hora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atenderPaciente'");
    }

    @Override
    public void aumentaPrioridad(int maxTiempoEspera, int hora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aumentaPrioridad'");
    }

    @Override
    public Iterable<Paciente> pacientesEsperando() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pacientesEsperando'");
    }

    @Override
    public Paciente getPaciente(String DNI) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPaciente'");
    }

    @Override
    public Pair<Integer, Integer> informacionEspera() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'informacionEspera'");
    }

}
