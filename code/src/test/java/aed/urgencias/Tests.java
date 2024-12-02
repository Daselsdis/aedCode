package aed.urgencias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testAdmitir() throws PacienteExisteException {
        Urgencias u = new UrgenciasAED();
        u.admitirPaciente("111", 5, 1);
        Paciente p = u.atenderPaciente(10);

        // Check expected DNI ("111") == observed DNI (p.getDNI())
        assertEquals("111", p.getDNI());
    }

    @Test
    public void test_urgencias_personal_1() throws PacienteExisteException {
        Urgencias u = new UrgenciasAED();

        u.admitirPaciente("111", 1, 0);
        u.admitirPaciente("222", 1, 1);

        Paciente p = u.atenderPaciente(10);

        assertEquals("111", p.getDNI());
    }

    @Test
    public void test_urgencias_personal_2() throws PacienteExisteException {
        Urgencias u = new UrgenciasAED();

        u.admitirPaciente("111", 1, 0);
        u.admitirPaciente("222", 1, 1);

        Paciente p1 = u.atenderPaciente(10);
        Paciente p2 = u.atenderPaciente(10);

        assertEquals("111", p1.getDNI());
        assertEquals("222", p2.getDNI());
    }

    @Test
    public void test_urgencias_personal_3() throws PacienteExisteException {
        Urgencias u = new UrgenciasAED();

        u.admitirPaciente("111", 5, 0);
        u.admitirPaciente("222", 1, 1);

        Paciente p2 = u.atenderPaciente(10);

        assertEquals("222", p2.getDNI());
    }

    @Test
    public void test_urgencias_personal_4() throws PacienteExisteException, PacienteNoExisteException {
        Urgencias u = new UrgenciasAED();

        u.admitirPaciente("111", 1, 0);
        u.admitirPaciente("222", 1, 1);

        u.salirPaciente("111", 5);

        Paciente p2 = u.atenderPaciente(10);

        assertEquals("222", p2.getDNI());
    }

    @Test
    public void test_urgencias_personal_5() throws PacienteExisteException, PacienteNoExisteException {
        Urgencias u = new UrgenciasAED();

        u.admitirPaciente("111", 5, 0);
        u.admitirPaciente("222", 5, 1);

        u.cambiarPrioridad("222", 1,2);

        Paciente p2 = u.atenderPaciente(10);

        assertEquals("222", p2.getDNI());
    }
}
