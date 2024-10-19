
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2024/9/19 -- 22:12:7
// Seed: {1726,776726,339800}
//
//////////////////////////////////////////////////////////////////////

package aed.almacen;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({ "unused" })
public class TesterLab1 {

    @BeforeAll
    public static void init() {
        TestUtils.reportPid();
        TestData.setIndividualTimeout(10);
        TestData.setGlobalTimeout(60);
        ResultsHandler.init();
        ResultsHandler.setNumTestsRemaining(30, TestData.getGlobalTimeout());
        TestData.setTesterType(true);
    }

    @AfterAll
    public static void reportResults() {
        ResultsHandler.report_results();
    }

    @Test
    public void test_almacen_01() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_01");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_01"));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_01"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_02() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_02");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_02"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_02"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_03() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_03");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_03"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("julio"), new String("movil"), 3).doCall().checkResult(false);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_03"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_04() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_04");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_04"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 1).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_04"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_05() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_05");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_05"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 2).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_05"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_06() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_06");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_06"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 3));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_06"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_07() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_07");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_07"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 3).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_07"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_08() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_08");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_08"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, 111111).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 2).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("ana"), new String("champu"), 2).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_08"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_09() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_09");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_09"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("juan"), new String("champu"), 2).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("champu"), 2) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_09"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_10() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_10");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_10"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("julio"), new String("libro"), 3).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_10"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_11() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_11");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_11"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 4));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 2).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("jorge"), new String("libro"), 2).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_11"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_12() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_12");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_12"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("julio"), new String("t-shirt"), 4).doCall()
                            .checkResult(false);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("movil"), 1), new Producto(new String("t-shirt"), 4) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_12"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_13() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_13");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_13"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, 222222).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, 333333).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_13"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_14() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_14");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_14"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, 111111).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("susana"), new String("t-shirt"), 4).doCall()
                            .checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new Producto(new String("t-shirt"), 3));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 4).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_14"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_15() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_15");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_15"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("julio"), new String("helado"), 4).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("susana"), new String("t-shirt"), 4).doCall()
                            .checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 2));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_15"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_16() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_16");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_16"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 3).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("ana"), new String("t-shirt"), 1).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new Producto(new String("t-shirt"), 5));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("ana"), new String("t-shirt"), 1) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_16"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_17() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_17");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_17"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 4).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("ana"), new String("libro"), 1).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("ana"), new String("libro"), 1));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("ana"), new String("libro"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("ana"), new String("libro"), 1));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 3));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_17"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_18() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_18");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_18"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 4).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("julio"), new String("movil"), 4).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("movil"), 4));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("movil"), 4));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("movil")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("movil"), 4) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 4));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("movil"), 4));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_18"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_19() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_19");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_19"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(new Compra[] {}));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("paloma"), new String("libro"), 1).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 2).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("juan"), new String("t-shirt"), 2).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new Producto(new String("t-shirt"), 1));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("t-shirt"), 2));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("t-shirt"), 2));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_19"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_20() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_20");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_20"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("julio"), new String("champu"), 4).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 0));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("champu"), 0), new Producto(new String("movil"), 1) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("champu")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("champu"), 4) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("champu"), 4));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("champu")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("champu"), 4) }));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("champu"), 4) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_20"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_21() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_21");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_21"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 4));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 3).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("ana"), new String("champu"), 1).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("champu"), 8), new Producto(new String("libro"), 5) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("champu")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("ana"), new String("champu"), 1) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_21"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_22() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_22");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_22"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("libro"), 3), new Producto(new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, 222222).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("susana"), new String("libro"), 4).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("movil")).doCall()
                            .checkResult(new Producto(new String("movil"), 3));
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("ana"), new String("movil"), 2).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("movil")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("ana"), new String("movil"), 2) }));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("ana")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("ana"), new String("movil"), 2) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_22"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_23() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_23");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_23"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 2).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("jorge"), new String("libro"), 1).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("libro")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("libro"), 1) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 2));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("jorge"), new String("libro"), 1));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("libro")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("libro"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 2));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("libro"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 2), new Producto(new String("libro"), 3),
                                    new Producto(new String("t-shirt"), 7) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_23"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_24() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TestResult<Integer, Boolean> v_4 = null;
                Integer v_5 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_24");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_24"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 1).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("juan"), new String("champu"), 1).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("champu"), 0), new Producto(new String("movil"), 4) }));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("juan")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("champu"), 1) }));
                if (ok_sofar) {
                    v_4 = new Pedir(v_1, new String("julio"), new String("movil"), 2).doCall();
                    ok_sofar = v_4.checkResult(true);
                }
                if (ok_sofar)
                    v_5 = v_4.getValue();
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("ana"), new String("champu"), 3).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("champu"), 1));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("champu"), 0), new Producto(new String("movil"), 2) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("champu"), 1),
                                            new Compra(v_5, new String("julio"), new String("movil"), 2) }));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_5, new String("julio"), new String("movil"), 2) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("champu")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 0));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("susana"), new String("champu"), 2).doCall()
                            .checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 0));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("champu"), 1));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("julio"), new String("movil"), 2));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_24"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_25() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TestResult<Integer, Boolean> v_4 = null;
                Integer v_5 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_25");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_25"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 1).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("jorge"), new String("champu"), 1).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("jorge")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 0));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 0));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 1));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("jorge")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 1));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("champu")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("champu")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("champu")).doCall()
                            .checkResult(new Producto(new String("champu"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("champu")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("champu"), 3), new Producto(new String("helado"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("champu"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("jorge"), new String("champu"), 1));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("champu"), 3), new Producto(new String("helado"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("jorge"), new String("champu"), 1));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("jorge"), new String("champu"), 4).doCall().checkResult(false);
                if (ok_sofar) {
                    v_4 = new Pedir(v_1, new String("susana"), new String("champu"), 2).doCall();
                    ok_sofar = v_4.checkResult(true);
                }
                if (ok_sofar)
                    v_5 = v_4.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 3).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_25"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_26() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TestResult<Integer, Boolean> v_4 = null;
                Integer v_5 = null;
                TestResult<Integer, Boolean> v_6 = null;
                Integer v_7 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_26");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_26"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("paloma"), new String("helado"), 2).doCall()
                            .checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 1));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("paloma"), new String("helado"), 2).doCall()
                            .checkResult(false);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("jorge"), new String("t-shirt"), 4).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("jorge"), new String("t-shirt"), 4));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("jorge"), new String("t-shirt"), 4));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("jorge"), new String("t-shirt"), 4));
                if (ok_sofar) {
                    v_4 = new Pedir(v_1, new String("ana"), new String("t-shirt"), 1).doCall();
                    ok_sofar = v_4.checkResult(true);
                }
                if (ok_sofar)
                    v_5 = v_4.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new Producto(new String("t-shirt"), 3));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("ana"), new String("t-shirt"), 1));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, 111111).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 1));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("ana")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_5, new String("ana"), new String("t-shirt"), 1) }));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("ana"), new String("helado"), 2).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("ana"), new String("t-shirt"), 1));
                if (ok_sofar) {
                    v_6 = new Pedir(v_1, new String("susana"), new String("t-shirt"), 2).doCall();
                    ok_sofar = v_6.checkResult(true);
                }
                if (ok_sofar)
                    v_7 = v_6.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 1), new Producto(new String("t-shirt"), 4) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new Producto(new String("t-shirt"), 4));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("jorge"), new String("t-shirt"), 4));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 1), new Producto(new String("t-shirt"), 4) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("jorge"), new String("t-shirt"), 4),
                                            new Compra(v_5, new String("ana"), new String("t-shirt"), 1),
                                            new Compra(v_7, new String("susana"), new String("t-shirt"), 2) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("ana"), new String("t-shirt"), 1));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_26"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_27() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TestResult<Integer, Boolean> v_4 = null;
                Integer v_5 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_27");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_27"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(
                                    new Producto[] { new Producto(new String("libro"), 4) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 3).doCall().checkResult(null);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("juan"), new String("helado"), 3).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("helado")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 0), new Producto(new String("libro"), 4) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 2), new Producto(new String("libro"), 4) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 4));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 2));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("paloma"), new String("helado"), 3).doCall()
                            .checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 2), new Producto(new String("libro"), 4) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("helado")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 4));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("juan")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("juan"), new String("helado"), 3));
                if (ok_sofar) {
                    v_4 = new Pedir(v_1, new String("paloma"), new String("libro"), 3).doCall();
                    ok_sofar = v_4.checkResult(true);
                }
                if (ok_sofar)
                    v_5 = v_4.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("helado"), 3),
                                            new Compra(v_5, new String("paloma"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("paloma"), new String("libro"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("helado")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("juan"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, 333333).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("juan"), new String("helado"), 4).doCall().checkResult(false);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_27"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_28() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TestResult<Integer, Boolean> v_4 = null;
                Integer v_5 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_28");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_28"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("jorge"), new String("movil"), 3).doCall().checkResult(false);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("paloma"), new String("libro"), 2).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("paloma"), new String("libro"), 2) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("libro"), 1), new Producto(new String("movil"), 2) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("paloma"), new String("libro"), 2) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 1));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("movil")).doCall()
                            .checkResult(new Producto(new String("movil"), 2));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar) {
                    v_4 = new Pedir(v_1, new String("julio"), new String("libro"), 1).doCall();
                    ok_sofar = v_4.checkResult(true);
                }
                if (ok_sofar)
                    v_5 = v_4.getValue();
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("susana"), new String("libro"), 3).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 0));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("juan"), new String("libro"), 4).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 0));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("julio"), new String("libro"), 1));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("t-shirt")).doCall()
                            .checkResult(new Producto(new String("t-shirt"), 1));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("libro")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("paloma"), new String("libro"), 2),
                                            new Compra(v_5, new String("julio"), new String("libro"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("paloma"), new String("libro"), 2));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("jorge"), new String("movil"), 4).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("libro"), 0), new Producto(new String("movil"), 2),
                                    new Producto(new String("t-shirt"), 1) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 0));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("julio"), new String("libro"), 1));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("libro"), 0), new Producto(new String("movil"), 2),
                                    new Producto(new String("t-shirt"), 1) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_28"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_29() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TestResult<Integer, Boolean> v_4 = null;
                Integer v_5 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_29");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_29"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("juan"), new String("helado"), 4).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 3));
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("julio"), new String("helado"), 3).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 4));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 4));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 4));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("movil"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("helado")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("helado")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("helado")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 0), new Producto(new String("libro"), 4),
                                    new Producto(new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 0));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 0));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 0), new Producto(new String("libro"), 4),
                                    new Producto(new String("movil"), 3) }));
                if (ok_sofar) {
                    v_4 = new Pedir(v_1, new String("julio"), new String("movil"), 3).doCall();
                    ok_sofar = v_4.checkResult(true);
                }
                if (ok_sofar)
                    v_5 = v_4.getValue();
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3),
                                            new Compra(v_5, new String("julio"), new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("movil")).doCall()
                            .checkResult(new Producto(new String("movil"), 0));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3),
                                            new Compra(v_5, new String("julio"), new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 0));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3),
                                            new Compra(v_5, new String("julio"), new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("t-shirt"), 3).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("julio"), new String("movil"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("movil")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_5, new String("julio"), new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("helado")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("movil")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_5, new String("julio"), new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 4));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3),
                                            new Compra(v_5, new String("julio"), new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("helado"), 3),
                                            new Compra(v_5, new String("julio"), new String("movil"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("julio"), new String("movil"), 3));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("champu"), 2), new Producto(new String("helado"), 4),
                                    new Producto(new String("libro"), 4), new Producto(new String("movil"), 0),
                                    new Producto(new String("t-shirt"), 3) }));
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_29"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    @Test
    public void test_almacen_30() {
        if (ResultsHandler.isTimedout()) {
            Assertions.assertTrue(false, new String("Testing stopped due to global timeout -- too slow execution"));
        }
        boolean resultIs = true;
        try {
            resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), () -> {
                TestResult<Almacen, Void> v_0 = null;
                Almacen v_1 = null;
                TestResult<Integer, Boolean> v_2 = null;
                Integer v_3 = null;
                TestResult<Integer, Boolean> v_4 = null;
                Integer v_5 = null;
                TestResult<Integer, Boolean> v_6 = null;
                Integer v_7 = null;
                TestResult<Integer, Boolean> v_8 = null;
                Integer v_9 = null;
                TesterCode.resetPrinter();
                TestData.initTrace();
                TestData.testName = new String("test_almacen_30");
                boolean ok_sofar = true;
                ResultsHandler.startTest(new String("test_almacen_30"));
                if (ok_sofar) {
                    v_0 = new Constructor().doCall();
                    ok_sofar = v_0.checkResult(null);
                }
                if (ok_sofar)
                    v_1 = v_0.getValue();
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 1).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("libro"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("julio"), new String("helado"), 4).doCall().checkResult(false);
                if (ok_sofar) {
                    v_2 = new Pedir(v_1, new String("julio"), new String("libro"), 3).doCall();
                    ok_sofar = v_2.checkResult(true);
                }
                if (ok_sofar)
                    v_3 = v_2.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 0));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 0));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("libro"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("helado"), 4).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("libro")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("juan"), new String("libro"), 2).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("libro"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("libro")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("ana"), new String("libro"), 2).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("julio")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar) {
                    v_4 = new Pedir(v_1, new String("jorge"), new String("helado"), 2).doCall();
                    ok_sofar = v_4.checkResult(true);
                }
                if (ok_sofar)
                    v_5 = v_4.getValue();
                if (ok_sofar) {
                    v_6 = new Pedir(v_1, new String("ana"), new String("helado"), 3).doCall();
                    ok_sofar = v_6.checkResult(true);
                }
                if (ok_sofar)
                    v_7 = v_6.getValue();
                if (ok_sofar)
                    ok_sofar = new GetCompras(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3),
                                            new Compra(v_5, new String("jorge"), new String("helado"), 2),
                                            new Compra(v_7, new String("ana"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_7).doCall()
                            .checkResult(new Compra(v_7, new String("ana"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 3));
                if (ok_sofar) {
                    v_8 = new Pedir(v_1, new String("susana"), new String("helado"), 3).doCall();
                    ok_sofar = v_8.checkResult(true);
                }
                if (ok_sofar)
                    v_9 = v_8.getValue();
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 0), new Producto(new String("libro"), 0) }));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 0), new Producto(new String("libro"), 0) }));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("libro")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("susana")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_9, new String("susana"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProductos(v_1).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Producto>(new Producto[] {
                                    new Producto(new String("helado"), 0), new Producto(new String("libro"), 0) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("helado")).doCall()
                            .checkResult(new Producto(new String("helado"), 0));
                if (ok_sofar)
                    ok_sofar = new ComprasProducto(v_1, new String("libro")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_3, new String("julio"), new String("libro"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_7).doCall()
                            .checkResult(new Compra(v_7, new String("ana"), new String("helado"), 3));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("libro"), 3));
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_3).doCall()
                            .checkResult(new Compra(v_3, new String("julio"), new String("libro"), 3));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("ana")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_7, new String("ana"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new Pedir(v_1, new String("ana"), new String("libro"), 4).doCall().checkResult(false);
                if (ok_sofar)
                    ok_sofar = new GetCompra(v_1, v_5).doCall()
                            .checkResult(new Compra(v_5, new String("jorge"), new String("helado"), 2));
                if (ok_sofar)
                    ok_sofar = new ReabastecerProducto(v_1, new String("champu"), 2).doCall().checkResult(null);
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("susana")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_9, new String("susana"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("libro")).doCall()
                            .checkResult(new Producto(new String("libro"), 0));
                if (ok_sofar)
                    ok_sofar = new ComprasCliente(v_1, new String("ana")).doCall()
                            .checkResult(new es.upm.aedlib.indexedlist.ArrayIndexedList<Compra>(
                                    new Compra[] { new Compra(v_7, new String("ana"), new String("helado"), 3) }));
                if (ok_sofar)
                    ok_sofar = new GetProducto(v_1, new String("movil")).doCall().checkResult(null);
                return ok_sofar;
            });
        } catch (org.opentest4j.AssertionFailedError exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.DURING,
                    new String("*** TIMEOUT! *** Very slow or non-terminating execution"), exc);
            resultIs = false;
        } catch (Throwable exc) {
            TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,
                    new String("Internal testing error; please report this to teachers"), exc);
            resultIs = false;
        }
        String messages = TestData.getMessages();
        ResultsHandler.stopTest(new String("test_almacen_30"));
        ResultsHandler.add_result(new String("almacen"), resultIs);
        if (messages.length() > 0)
            System.out.println(messages);
        if (!resultIs)
            Assertions.assertTrue(resultIs, messages);
    }

    static class Tests {
        static String tester = "TesterLab1";
    }

    static class AlmacenUtils {
        public static void resetPrinter() {
        }

        public static String printer(Object obj) {
            if (obj instanceof Almacen) {
                return "a";
            } else
                return TestUtils.printer(obj, x -> printer(x));
        }

        public static boolean checkProductos(GetProductos call,
                TestResult<IndexedList<Producto>, IndexedList<Producto>> result,
                IndexedList<Producto> expected) {
            call.nonNull();
            IndexedList<Producto> valueResult = result.getValue();
            Pair<IndexedList<Producto>, IndexedList<Compra>> pair = m(call.x_1);
            if (pair != null && valueResult == pair.getLeft()) {
                TestUtils.printError(TestUtils.ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a list which is identical (using ==) to the list productos " +
                                "in Almacen.java; a new list should have been returned");
                return false;
            }
            return true;
        }

        public static boolean checkCompras(GetCompras call,
                TestResult<IndexedList<Compra>, IndexedList<Compra>> result,
                IndexedList<Compra> expected) {
            call.nonNull();
            IndexedList<Compra> valueResult = result.getValue();
            Pair<IndexedList<Producto>, IndexedList<Compra>> pair = m(call.x_1);
            if (pair != null && valueResult == pair.getRight()) {
                TestUtils.printError(TestUtils.ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a list which is identical (using ==) to the list compras " +
                                "in Almacen.java; a new list should have been returned");
                return false;
            }
            return true;
        }

        @SuppressWarnings("unchecked")
        public static Pair<IndexedList<Producto>, IndexedList<Compra>> m(Almacen a) {
            try {
                Field productosField = a.getClass().getDeclaredField("productos");
                Field comprasField = a.getClass().getDeclaredField("compras");
                productosField.setAccessible(true);
                comprasField.setAccessible(true);
                IndexedList<Producto> productos = (IndexedList<Producto>) productosField.get(a);
                IndexedList<Compra> compra = (IndexedList<Compra>) comprasField.get(a);
                return new Pair<>(productos, compra);
            } catch (Throwable exc) {
                TestUtils.printWarning(TestUtils.ExecutionTime.LAST,
                        "cannot access the fields productos y/o compras: " + exc);
                return null;
            }
        }
    }

    static class TestUtils {
        enum ExecutionTime {
            AFTER, LAST, DURING, UNRELATED
        }

        static String print(Object obj) {
            return TesterCode.printer(obj);
        }

        static String standardPrinter(Object obj) {
            return printer(obj, x -> standardPrinter(x));
        }

        static String printer(Object obj, Function<Object, String> print) {
            if (obj == null)
                return "null";

            if (obj instanceof String) {
                return ("\"" + obj.toString() + "\"");
            } else if (obj instanceof Position<?>) {
                return obj.toString();
            } else if (obj instanceof Pair<?, ?>) {
                Pair<?, ?> p = (Pair<?, ?>) obj;
                return "Pair(" + print.apply(p.getLeft()) + "," + print.apply(p.getRight()) + ")";
            } else if (obj instanceof java.util.Set<?>) {
                Iterable<?> l = (Iterable<?>) obj;
                StringBuffer buf = new StringBuffer();
                buf.append("{");
                boolean first = true;
                for (Object lobj : l) {
                    if (first)
                        first = false;
                    else
                        buf.append(",");
                    buf.append(print.apply(lobj));
                }
                buf.append("}");
                return buf.toString();
            } else if (obj instanceof Iterable<?>) {
                Iterable<?> l = (Iterable<?>) obj;
                StringBuffer buf = new StringBuffer();
                buf.append("[");
                boolean first = true;
                for (Object lobj : l) {
                    if (first)
                        first = false;
                    else
                        buf.append(",");
                    buf.append(print.apply(lobj));
                }
                buf.append("]");
                return buf.toString();
            } else if (obj instanceof Map<?, ?>) {
                Map<?, ?> m = (Map<?, ?>) obj;
                StringBuffer buf = new StringBuffer();
                buf.append("[");
                boolean first = true;
                for (Entry<?, ?> lobj : m.entries()) {
                    if (first)
                        first = false;
                    else
                        buf.append(",");
                    buf.append("(" + print.apply(lobj.getKey()) + "," + print.apply(lobj.getValue()) + ")");
                }
                buf.append("]");
                return buf.toString();
            } else if (obj instanceof Object[]) {
                Object[] arr = (Object[]) obj;
                StringBuffer buf = new StringBuffer();
                buf.append("[");
                boolean first = true;
                for (int i = 0; i < arr.length; i++) {
                    Object aobj = arr[i];
                    if (first)
                        first = false;
                    else
                        buf.append(",");
                    buf.append(print.apply(aobj));
                }
                buf.append("]");
                return buf.toString();
            } else if (obj instanceof int[]) {
                int[] arr = (int[]) obj;
                StringBuffer buf = new StringBuffer();
                buf.append("[");
                boolean first = true;
                for (int i = 0; i < arr.length; i++) {
                    int aobj = arr[i];
                    if (first)
                        first = false;
                    else
                        buf.append(",");
                    buf.append(print.apply(aobj));
                }
                buf.append("]");
                return buf.toString();
            } else
                return obj.toString();
        }

        static void printWarning(String TestName) {
            TestData.message("\n*** Warning in " + (TestName == null ? "" : TestName) + ":");
        }

        static void printError(String TestName) {
            TestData.message("\n\n***********************************************");
            TestData.message("*** Error in " + (TestName == null ? "" : TestName) + ":");
        }

        static void terminateErrorPrint() {
            TestData.message("\n***********************************************\n\n");
        }

        static boolean compare(Object o1, Object o2) {
            if (o1 == null)
                return o2 == null;
            else
                return o1.equals(o2);
        }

        static void printCallException(ExecutionTime time, String msg, Throwable exc) {
            printError(TestData.testName);

            int traceLength = TestData.numCommands();

            if (traceLength > 0) {
                TestData.message("\n" + callSeqString(traceLength, time) + "\n");
                TestData.message(TestData.getTrace());
            }

            switch (time) {
                case AFTER:
                    TestData.message("the call to " + msg + " raised the exception " + exc +
                            " although it should not have");
                    break;
                default:
                    TestData.message(" -- the exception " + exc + " was raised although it " +
                            "should not have been\n" + msg);
                    break;
            }
            TestData.message(getStackTrace(exc));
            terminateErrorPrint();
        }

        static String getStackTrace(Throwable throwable) {
            filterStackTrace(throwable);
            StringWriter errors = new StringWriter();
            throwable.printStackTrace(new PrintWriter(errors));
            return errors.toString();
        }

        static void filterStackTrace(Throwable throwable) {
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
            for (int i = 0; i < stackTrace.length; i++) {
                String className = stackTrace[i].getClassName();
                if (className.startsWith("jdk.internal")
                        || className.startsWith("org.junit"))
                    break;
                l.add(stackTrace[i]);
            }
            StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
            throwable.setStackTrace(l.toArray(cutStackTrace));
        }

        static void printCallException(String msg, Throwable exc) {
            printCallException(ExecutionTime.AFTER, msg, exc);
        }

        static void printCallException(Throwable exc) {
            printCallException(ExecutionTime.LAST, "", exc);
        }

        static void printCallException(Throwable exc, Supplier<String> msg) {
            printCallException(ExecutionTime.LAST, msg.get(), exc);
        }

        static void printWarning(ExecutionTime time, String msg) {
            TestData.message("\n\n***********************************************");
            if (TestData.testName != "") {
                TestData.message("\n*** Warning for " + TestData.testName + ": ");
            } else
                TestData.message("\n*** Warning:");

            if (time != TestUtils.ExecutionTime.UNRELATED) {
                int traceLength = TestData.numCommands();

                if (traceLength > 0) {
                    TestData.message(callSeqString(traceLength, time));
                    TestData.message(TestData.getTrace());
                }
            }
            TestData.message(msg);
            terminateErrorPrint();
        }

        static void printError(ExecutionTime time, String msg) {
            printError(TestData.testName);

            if (time != TestUtils.ExecutionTime.UNRELATED) {
                int traceLength = TestData.numCommands();

                if (traceLength > 0) {
                    TestData.message("\n" + callSeqString(traceLength, time));
                    TestData.message(TestData.getTrace());
                }
            }

            TestData.message(msg);
            terminateErrorPrint();
        }

        static String callSeqString(int traceLength, ExecutionTime time) {
            if (traceLength < 2)
                return "while executing the call ";
            else {
                switch (time) {
                    case AFTER:
                        return "after executing the call sequence ";
                    case LAST:
                        return "while executing the last statement of call sequence ";
                    case DURING:
                        return "while executing the call sequence ";
                    case UNRELATED:
                        return "";
                }
                return "";
            }
        }

        static <E> boolean checkNull(TestCall<E, Boolean> call,
                TestResult<E, Boolean> result,
                Boolean expected) {
            if (expected)
                return call.nonNull();
            else
                return call.isNull();
        }

        // Checks that results, which may not be an exception nor null
        // (needs prior checks), which are iterables, return the same
        // set of elements.
        // *********************************************
        // WARNING: this relies on a sane definition of
        // hashCode and equals which does not fail upon finding
        // null values...
        static <E extends Iterable<?>, F extends Iterable<?>> boolean sameSet(TestCall<E, F> call,
                TestResult<E, F> result,
                F expected) {
            return sameSet(call, result.getValue(), expected);
        }

        // *********************************************
        // WARNING: this relies on a sane definition of
        // hashCode and equals which does not fail upon finding
        // null values...
        static <E extends Iterable<?>, F extends Iterable<?>> boolean sameSet(TestCall<?, ?> call, E value,
                F expected) {

            HashSet<Object> s1 = new HashSet<Object>();
            HashSet<Object> s2 = new HashSet<Object>();
            for (Object e : value)
                s1.add(e);
            for (Object f : expected)
                s2.add(f);
            if (!s1.equals(s2)) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a value which contained the elements\n  " + TestUtils.print(s1) +
                                "\nwhich differs from the expected elements\n  " + TestUtils.print(s2));
                return false;
            }
            return true;
        }

        // Checks that results, which are basic arrays, are equal
        static <E, F> boolean eqArrays(TestCall<int[], int[]> call,
                TestResult<int[], int[]> result,
                int[] expected) {
            if (!call.noException())
                return false;
            if (!call.nonNull())
                return false;

            return eqArrays(call, result.getValue(), expected);
        }

        static boolean eqArrays(TestCall<int[], int[]> call, int[] value, int[] expected) {
            boolean ok_sofar = value.length == expected.length;

            if (ok_sofar) {
                for (int i = 0; i < value.length && ok_sofar; i++) {
                    ok_sofar = ok_sofar && (value[i] == expected[i]);
                }
            }

            if (!ok_sofar) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned an array " + printArray(value) +
                                " which differs from the expected array " + printArray(expected));
            }
            return ok_sofar;
        }

        // Checks that the result is a member of the iterable
        static <E, F> boolean memberElements(TestCall<E, F> call,
                TestResult<E, F> result,
                F expected) {
            if (!call.noException())
                return false;
            if (!call.nonNull())
                return false;

            boolean checkResult = memberElements(call, result.getValue(), expected);
            if (!checkResult)
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a value " + TestUtils.print(result.getValue()) +
                                "\nwhich was not included among the expected values\n" +
                                TestUtils.print(expected));
            return checkResult;
        }

        static <E, F> boolean memberElements(TestCall<E, F> call,
                E value,
                F expected) {

            if (!memberElements(value, expected)) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a value\n  " + TestUtils.print(value) +
                                "\nwhich is not included among the expected elements\n  " + TestUtils.print(expected));
                return false;
            }
            return true;
        }

        // *********************************************
        // WARNING: this relies on a sane definition of
        // hashCode and equals which does not fail upon finding
        // null values...
        public static <E, F> boolean memberElements(E value, F expectedP) {
            if (expectedP instanceof Iterable<?>) {
                Iterable<?> expected = (Iterable<?>) expectedP;

                HashSet<Object> s = new HashSet<Object>();
                for (Object e : expected) {
                    s.add(e);
                }
                return s.contains(value);
            } else {
                System.out.println(
                        "*** Error: expected of type " + expectedP.getClass() + " does not implement Iterable");
                throw new RuntimeException();
            }
        }

        // Checks that results, which are iterables, return the same
        // elements, regardless of the order.
        static <E, F> boolean sameElements(TestCall<E, F> call,
                TestResult<E, F> result,
                F expected) {
            if (!call.noException())
                return false;
            if (!call.nonNull())
                return false;

            return sameElements(call, result.getValue(), expected);
        }

        // *********************************************
        // WARNING: this relies on a sane definition of
        // hashCode and equals which does not fail upon finding
        // null values...

        static <E, F> boolean sameElements(TestCall<E, F> call,
                E value,
                F expected) {

            if (!sameElements(value, expected)) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a value which contained the elements\n  " + TestUtils.print(value) +
                                "\nwhich differs from the expected elements\n  " + TestUtils.print(expected));
                return false;
            }
            return true;
        }

        // *********************************************
        // WARNING: this relies on a sane definition of
        // hashCode and equals which does not fail upon finding
        // null values...
        static <E, F> boolean sameElements(E valueP, F expectedP) {
            if ((valueP instanceof Iterable<?>) &&
                    (expectedP instanceof Iterable<?>)) {
                Iterable<?> value = (Iterable<?>) valueP;
                Iterable<?> expected = (Iterable<?>) expectedP;

                HashMap<Object, Integer> s1 = new HashMap<Object, Integer>();
                HashMap<Object, Integer> s2 = new HashMap<Object, Integer>();
                for (Object e : value) {
                    Integer si = s1.get(e);
                    if (si == null)
                        si = 0;
                    s1.put(e, si + 1);
                }
                for (Object f : expected) {
                    Integer si = s2.get(f);
                    if (si == null)
                        si = 0;
                    s2.put(f, si + 1);
                }
                if (!s1.equals(s2))
                    return false;
                else
                    return true;
            } else {
                if (!(valueP instanceof Iterable<?>))
                    System.out
                            .println("*** Error: result of type " + valueP.getClass() + " does not implement Iterable");
                if (!(expectedP instanceof Iterable<?>))
                    System.out.println(
                            "*** Error: expected of type " + expectedP.getClass() + " does not implement Iterable");
                throw new RuntimeException();
            }
        }

        // Checks that results, which are iterables, return the same
        // elements, preserving the order.
        static <E, F> boolean sameElementsInOrder(TestCall<E, F> call,
                TestResult<E, F> result,
                F expected) {
            if (!call.noException())
                return false;
            if (!call.nonNull())
                return false;

            return sameElementsInOrder(call, result.getValue(), expected);
        }

        // *********************************************
        // WARNING: this relies on a sane definition of
        // hashCode and equals which does not fail upon finding
        // null values...

        static <E, F> boolean sameElementsInOrder(TestCall<E, F> call,
                E value,
                F expected) {

            if (!sameElementsInOrder(value, expected)) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a value which contained the elements\n  " + TestUtils.print(value) +
                                "\nwhich differs from the expected elements\n  " + TestUtils.print(expected));
                return false;
            }
            return true;
        }

        // *********************************************
        // WARNING: this relies on a sane definition of
        // hashCode and equals which does not fail upon finding
        // null values...
        static <E, F> boolean sameElementsInOrder(E valueP, F expectedP) {
            if ((valueP instanceof Iterable<?>) &&
                    (expectedP instanceof Iterable<?>)) {
                Iterable<?> value = (Iterable<?>) valueP;
                Iterable<?> expected = (Iterable<?>) expectedP;

                Iterator<?> it1 = value.iterator();
                Iterator<?> it2 = expected.iterator();

                if (it1 == null)
                    return false;

                while (it1.hasNext() && it2.hasNext()) {
                    Object e2 = it2.next();
                    Object e1 = null;
                    try {
                        e1 = it1.next();
                    } catch (Throwable exc) {
                        return false;
                    }
                    if (e2 == null && e1 != null)
                        return false;
                    if (!e2.equals(e1))
                        return false;
                }

                if (it1.hasNext() != it2.hasNext())
                    return false;
                return true;

            } else {
                if (!(valueP instanceof Iterable<?>))
                    System.out
                            .println("*** Error: result of type " + valueP.getClass() + " does not implement Iterable");
                if (!(expectedP instanceof Iterable<?>))
                    System.out.println(
                            "*** Error: expected of type " + expectedP.getClass() + " does not implement Iterable");
                throw new RuntimeException();
            }
        }

        // *********************************************
        // WARNING: this relies on a sane definition of
        // equals which does not fail upon finding
        // null values...
        static <E> boolean wellSorted(TestCall<?, ?> call,
                IndexedList<E> value,
                ArrayIndexedList<ArrayIndexedList<E>> expected) {

            int i = 0;
            IndexedList<E> eqClass = null;
            for (E e : value) {
                if (eqClass == null) {
                    if (i < expected.size())
                        eqClass = new ArrayIndexedList<E>(expected.get(i));
                    else {
                        printError(ExecutionTime.DURING,
                                "the call " + call.toString() +
                                        " returned a list: " + value +
                                        " which isn't sorted correctly. The correct sort order is " + expected);
                        return false;
                    }
                }
                if (!eqClass.remove(e)) {
                    printError(ExecutionTime.DURING,
                            "the call " + call.toString() +
                                    " returned a list: " + value +
                                    " which isn't sorted correctly. The correct sort order is " + expected);
                    return false;
                }
                if (eqClass.size() == 0) {
                    eqClass = null;
                    i++;
                }
            }
            if (eqClass != null || i < expected.size()) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a list: " + value +
                                " which isn't sorted correctly. The correct sort order is " + expected);
                return false;
            }
            return true;
        }

        static <E> boolean wellSorted(TestCall<?, ?> call,
                PositionList<E> value,
                PositionList<E> expected,
                Function<Pair<E, E>, Boolean> isSame) {

            PositionList<E> expectedCopy = new NodePositionList<E>(expected);

            if (value.size() != expected.size()) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned a list:\n  " + value +
                                "\nwhich contains the wrong number of elements.\n" +
                                "The correct list (modulo order of equal elements) is\n  " +
                                expectedCopy);
                return false;
            }

            Position<E> valuePos = value.first();

            while (valuePos != null) {
                E valueE = valuePos.element();

                if (valueE == null) {
                    if (value.size() != expected.size()) {
                        printError(ExecutionTime.DURING,
                                "the call " + call.toString() +
                                        " returned a list:\n  " + value +
                                        "\nwhich contains a null element.\n" +
                                        "The correct list (modulo order of equal elements) is\n  " +
                                        expectedCopy);
                        return false;
                    }
                }

                Position<E> expectedPos = expected.first();
                boolean found = false;
                boolean equals = true;

                while (expectedPos != null && !found && equals) {
                    E expectedE = expectedPos.element();
                    if (valueE.equals(expectedE)) {
                        found = true;
                        expected.remove(expectedPos);
                    } else if (!isSame.apply(new Pair<E, E>(valueE, expectedE)))
                        equals = false;

                    if (!found && equals) {
                        expectedPos = expected.next(expectedPos);
                    }
                }

                if (!found) {
                    printError(ExecutionTime.DURING,
                            "the call " + call.toString() +
                                    " returned a list:\n  " + value +
                                    "\nwhich contains elements either incorrect elements or elements in the wrong order."
                                    +
                                    "\nThe correct list (modulo order of equal elements) is\n  " +
                                    expectedCopy);
                    return false;
                }

                valuePos = value.next(valuePos);
            }
            return true;
        }

        static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
            if (i == null) {
                printError(ExecutionTime.DURING,
                        "the call " + callString +
                                " returned an null iterable");
                return null;
            }

            PositionList<E> l = null;

            try {
                java.util.Iterator<E> it = i.iterator();
                l = extractElementsFromIterator(it);
            } catch (Throwable exc) {
                printError(ExecutionTime.DURING,
                        "the call " + callString +
                                " returned an iterable which when used raised the exception " +
                                exc + "\n" + getStackTrace(exc));
                return null;
            }
            return l;
        }

        static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
            PositionList<E> l = new NodePositionList<E>();
            while (it.hasNext()) {
                l.addLast(it.next());
            }
            return l;
        }

        static <E, F> boolean unorderedIterableCorrect(TestCall<Iterable<E>, F[]> call,
                TestResult<Iterable<E>, F[]> result,
                F[] expected) {
            java.util.Iterator<E> it = null;

            try {
                it = result.getValue().iterator();
                if (it == null) {
                    printError(ExecutionTime.DURING,
                            "the call " + call.toString() +
                                    " returned an iterable which returned a null iterator");
                    return false;
                } else
                    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
            } catch (Throwable exc) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned an iterable which when used raised the exception " +
                                exc + "\n" + getStackTrace(exc));
                return false;
            }
        }

        static <E, F> boolean unorderedIteratorCorrect(TestCall<java.util.Iterator<E>, F[]> call,
                TestResult<java.util.Iterator<E>, F[]> result,
                F[] expected) {
            java.util.Iterator<E> it = result.getValue();
            return unorderedIteratorCorrect(() -> call.toString(), it, expected);
        }

        static <E, F> boolean unorderedIteratorCorrect(Supplier<String> callString,
                java.util.Iterator<E> it,
                F[] expected) {

            PositionList<E> l = null;

            try {
                l = extractElementsFromIterator(it);
            } catch (Throwable exc) {
                TestUtils.printCallException(exc);
                return false;
            }

            if (l == null)
                return false;

            boolean correct = (expected.length == l.size());

            if (correct) {
                PositionList<F> expectedList = new NodePositionList<F>();
                for (int j = 0; j < expected.length; j++) {
                    expectedList.addLast(expected[j]);
                }
                HashSet<Object> s1 = new HashSet<Object>();
                HashSet<Object> s2 = new HashSet<Object>();
                for (Object e : l)
                    s1.add(e);
                for (Object f : expectedList)
                    s2.add(f);
                if (!s1.equals(s2)) {
                    printError(ExecutionTime.DURING,
                            "the call " + callString.get() +
                                    " returned an iterator which returned the elements " + TestUtils.print(s1) +
                                    " which differs from the expected elements " + TestUtils.print(s2));
                    return false;
                }
            }

            if (!correct) {
                printError(ExecutionTime.DURING,
                        "the call " + callString.get() +
                                " returned an iterator with the elements " + TestUtils.print(l) +
                                " but should have returned the elements " + TestUtils.print(expected));
                return false;
            } else
                return true;
        }

        static <E, F> boolean iterableCorrect(TestCall<Iterable<E>, F[]> call,
                TestResult<Iterable<E>, F[]> result,
                F[] expected) {
            java.util.Iterator<E> it = null;

            try {
                it = result.getValue().iterator();
                if (it == null) {
                    printError(ExecutionTime.DURING,
                            "the call " + call.toString() +
                                    " returned an iterable which returned a null iterator");
                    return false;
                } else
                    return iterableCorrect(call.toString(), expected, result.getValue());
            } catch (Throwable exc) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned an iterable which when used raised the exception " +
                                exc + "\n" + getStackTrace(exc));
                return false;
            }
        }

        static <E, F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
            PositionList<E> l = extractElementsFromIterable(callString, i);
            if (l == null)
                return false;

            boolean correct = (original.length == l.size());

            if (correct) {
                Position<E> cursor = l.first();
                for (int j = 0; j < original.length; j++) {
                    if (original[j] == null) {
                        correct = correct && (cursor.element() == null);
                    }
                    correct = correct && original[j].equals(cursor.element());
                    if (!correct)
                        break;
                    cursor = l.next(cursor);
                }
            }

            if (!correct) {
                printError(ExecutionTime.DURING,
                        "the call " + callString +
                                " returned an iterable with the elements " + TestUtils.print(l) +
                                " but should have returned the elements " + TestUtils.print(original));
                return false;
            } else
                return true;
        }

        static <E, F> boolean iterableCorrect(TestCall<Iterable<E>, PositionList<F>> call,
                TestResult<Iterable<E>, PositionList<F>> result,
                Iterable<F> expected) {
            java.util.Iterator<E> it = null;
            java.util.Iterator<F> exp = expected.iterator();

            try {
                it = result.getValue().iterator();
                if (it == null) {
                    printError(ExecutionTime.DURING,
                            "the call " + call.toString() +
                                    " returned an iterable which returned a null iterator");
                    return false;
                } else
                    return iterableCorrect(call.toString(), expected, result.getValue());
            } catch (Throwable exc) {
                printError(ExecutionTime.DURING,
                        "the call " + call.toString() +
                                " returned an iterable which when used raised the exception " +
                                exc + "\n" + getStackTrace(exc));
                return false;
            }
        }

        static <E, F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
            PositionList<E> l = extractElementsFromIterable(callString, i);
            PositionList<F> e = extractElementsFromIterable(callString, original);
            if (l == null)
                return false;

            boolean correct = (e.size() == l.size());

            if (correct) {
                Position<E> cursor = l.first();
                Position<F> cursorE = e.first();
                for (int j = 0; j < e.size(); j++) {
                    if (cursorE.element() == null) {
                        correct = correct && (cursor.element() == null);
                    }
                    correct = correct && cursorE.element().equals(cursor.element());
                    if (!correct)
                        break;
                    cursor = l.next(cursor);
                    cursorE = e.next(cursorE);
                }
            }

            if (!correct) {
                printError(ExecutionTime.DURING,
                        "the call " + callString +
                                " returned an iterable with the elements " + TestUtils.print(l) +
                                " but should have returned the elements " + TestUtils.print(e));
                return false;
            } else
                return true;
        }

        static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
            boolean ok_sofar = true;

            if (l.size() != original.length) {
                ok_sofar = false;
            }

            Position<E> lPos = l.first();
            int i = 0;
            while (ok_sofar && lPos != null) {
                E elem = lPos.element();

                if (elem == null)
                    ok_sofar = (original[i] == null);
                else
                    ok_sofar = elem.equals(original[i]);

                lPos = l.next(lPos);
                ++i;
            }

            if (!ok_sofar) {
                printError(ExecutionTime.DURING,
                        "the call " + callString +
                                " has modified the input list " + TestUtils.print(original) +
                                "; it has now the elements " + TestUtils.print(l));
                return ok_sofar;
            }
            return ok_sofar;
        }

        static <E> boolean unchanged(String callString, E[] original, E[] newer) {
            boolean ok_sofar = true;

            if (newer.length != original.length) {
                ok_sofar = false;
            }

            for (int i = 0; i < newer.length; i++) {
                if (newer[i] == null)
                    ok_sofar = (original[i] == null);
                else
                    ok_sofar = newer[i].equals(original[i]);
            }

            if (!ok_sofar) {
                printError(ExecutionTime.DURING,
                        "the call " + callString +
                                " has modified the input array " + TestUtils.print(original) +
                                "; it has now the elements " + TestUtils.print(newer));
                return ok_sofar;
            }
            return ok_sofar;
        }

        static String printArray(Object[] arr) {
            if (arr == null)
                return "null";
            else {
                StringBuilder arrString = new StringBuilder("[");

                for (int i = 0; i < arr.length; i++) {
                    arrString.append(arr[i]);
                    if (i < arr.length - 1)
                        arrString.append(", ");
                }
                arrString.append("]");
                return arrString.toString();
            }
        }

        static String printArray(int[] arr) {
            if (arr == null)
                return "null";
            else {
                StringBuilder arrString = new StringBuilder("[");

                for (int i = 0; i < arr.length; i++) {
                    arrString.append(arr[i]);
                    if (i < arr.length - 1)
                        arrString.append(", ");
                }
                arrString.append("]");
                return arrString.toString();
            }
        }

        static String printArray(char[] arr) {
            if (arr == null)
                return "null";
            else {
                StringBuilder arrString = new StringBuilder("[");

                for (int i = 0; i < arr.length; i++) {
                    arrString.append(arr[i]);
                    if (i < arr.length - 1)
                        arrString.append(", ");
                }
                arrString.append("]");
                return arrString.toString();
            }
        }

        public static <T> PositionList<T> toPositionList(T[] arr) {
            NodePositionList<T> l = new NodePositionList<T>();
            for (int i = 0; i < arr.length; i++)
                l.addLast(arr[i]);
            return l;
        }

        public static <T> IndexedList<T> toIndexedList(T[] arr) {
            ArrayIndexedList<T> l = new ArrayIndexedList<T>();
            for (int i = 0; i < arr.length; i++)
                l.add(0, arr[i]);
            return l;
        }

        public static Object accessAttribute(String fieldName, Object obj) {
            try {
                Field field;
                field = obj.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                return field.get(obj);
            } catch (Throwable exc) {
                TestUtils.printCallException(TestUtils.ExecutionTime.LAST,
                        "cannot access the field " + fieldName + ": ",
                        exc);
                return null;
            }
        }

        public static void reportPid() {
            try {
                String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
                BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
                bw.write(ids[0]);
                bw.close();
            } catch (Exception e) {
                System.out.println("Avisa al profesor de fallo sacando el PID");
            }
        }

        @SafeVarargs
        @SuppressWarnings("varargs")
        public static <T> T[] toGenericArray(T... elems) {
            return elems;
        }

        public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
            boolean isOk = true;
            int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;

            try {
                Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
                Method majorMethod = aedlibVersion.getDeclaredMethod("major");
                Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
                Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

                aedlibMajor = (Integer) majorMethod.invoke(null);
                aedlibMinor = (Integer) minorMethod.invoke(null);
                aedlibPatchlevel = (Integer) patchlevelMethod.invoke(null);

                isOk = ((aedlibMajor > major)
                        || ((aedlibMajor == major) &&
                                ((aedlibMinor > minor)
                                        || ((aedlibMinor == minor) &&
                                                (aedlibPatchlevel >= patchlevel)))));
            } catch (Throwable exc) {
                System.out.println("*** WARNING: cannot check aedlib version number due to " + exc);
                exc.printStackTrace();
            }

            if (!isOk) {
                String errorMessage = "*** ERROR: aedlib is too old. Minimum version needed is " +
                        major + "." + minor + "." + patchlevel + "; your version is " +
                        aedlibMajor + "." + aedlibMinor + "." + aedlibPatchlevel +
                        ". Please download a new version of aedlib from moodle\n";
                System.out.println(errorMessage);
                throw new RuntimeException(errorMessage);
            } else
                return true;
        }

        @SuppressWarnings("unchecked")
        public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>, Integer> es_upm_aedlib_map_Entry_refl_cnstr(
                Object... params) {
            return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>, Integer>) reflectionNew(
                    "es.upm.aedlib.map.HashEntry", params);
        }

        public static Object reflectionNew(String className, Object... params) {
            try {
                Class<?> cl = Class.forName(className);
                for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
                    Class<?>[] parameterTypes = cnstr.getParameterTypes();
                    if (parameterTypes.length == params.length) {
                        boolean equals = true;
                        for (int i = 0; i < parameterTypes.length && equals; i++) {
                            if (!parameterTypes[i].isInstance(params[i]))
                                equals = false;
                        }
                        if (equals) {
                            cnstr.setAccessible(true);
                            return cnstr.newInstance(params);
                        }
                    }
                }
            } catch (ClassNotFoundException exc) {
                System.out.println("*** Warning: could not access class " + className);
                throw new RuntimeException();
            } catch (InstantiationException exc) {
                System.out.println("*** Warning: could not instantiate " + className);
                throw new RuntimeException();
            } catch (IllegalAccessException exc) {
                System.out.println("*** Warning: could not access " + className);
                throw new RuntimeException();
            } catch (InvocationTargetException exc) {
                System.out.println("*** Warning: constructor " + className + " raised an exception");
                throw new RuntimeException();
            }
            throw new RuntimeException();
        }
    }

    interface TestResult<E, F> {
        boolean isException();

        Throwable getException();

        E getValue();

        boolean checkResult(F expected);
    }

    static class Result<E, F> implements TestResult<E, F> {
        private boolean isException;
        private Throwable exception;
        private E value;
        Call<E, F> call;

        public static <E, F> Result<E, F> result(E e, Call<E, F> call) {
            Result<E, F> result = new Result<E, F>();
            result.isException = false;
            result.value = e;
            result.call = call;
            return result;
        }

        public static <E, F> Result<E, F> exception(Throwable exception, Call<E, F> call) {
            Result<E, F> result = new Result<E, F>();
            result.isException = true;
            result.exception = exception;
            result.call = call;
            return result;
        }

        public boolean isException() {
            return isException;
        }

        public Throwable getException() {
            if (!isException()) {
                TestData.message("*** Internal model error: calling getException() without exception");
                throw new RuntimeException();
            }
            return exception;
        }

        public E getValue() {
            if (isException())
                throw new RuntimeException();
            return value;
        }

        Call<E, F> getCall() {
            return call;
        }

        public boolean checkResult(F expected) {
            try {
                return getCall().checkResult(expected);
            } catch (Throwable exc) {
                System.out.println(
                        "\n\n\n*** Internal testing error: checkResult(" + expected + ") raised exception " + exc);
                exc.printStackTrace();
                TestData.message(
                        "\n\n\n*** Internal testing error: checkResult(" + expected + ") raised exception " + exc);
                TestUtils.printCallException(exc);
                TestData.message("\n");
                throw new RuntimeException();
            }
        }

        public String toString() {
            String callString = getCall().toString();
            if (!callString.equals("")) {
                if (isException())
                    return callString + "  =>  " + getException();
                else {
                    String valueString = TesterCode.printer(getValue());
                    return callString + "  =>  " + format_value(valueString);
                }
            } else
                return callString;
        }

        private String format_value(String msg) {
            String[] lines = msg.split("\\r?\\n");
            if (lines.length == 1)
                return msg;
            else {
                StringBuffer resultString = new StringBuffer();
                for (String line : lines) {
                    resultString.append("\n    ");
                    resultString.append(line);
                }
                return resultString.toString();
            }
        }
    }

    interface Call<E, F> {
        TestResult<E, F> doCall();

        String toString();

        boolean checkResult(F expected);
    }

    static abstract class TestCall<E, F> implements Call<E, F> {
        TestResult<E, F> result;
        boolean hasCalled;
        boolean voidReturn = false;

        public TestResult<E, F> doCall() {
            if (hasCalled())
                throw new RuntimeException();

            hasCalled = true;
            TestData.addCallToTrace(this.toString());

            try {
                E e = call();
                result = Result.result(e, this);
            } catch (Throwable exception) {
                result = Result.exception(exception, this);
            }

            if (result.isException() || !voidReturn)
                TestData.modifyLastCallInTrace(TesterCode.printer(result));

            return result;
        }

        abstract E call() throws Exception;

        boolean hasCalled() {
            return hasCalled;
        }

        boolean noException() {
            if (result.isException()) {
                Throwable throwable = result.getException();
                TestUtils.printCallException(throwable);
                return false;
            }
            return true;
        }

        boolean noException(Supplier<String> msg) {
            if (result.isException()) {
                Throwable throwable = result.getException();
                TestUtils.printCallException(throwable, msg);
                return false;
            }
            return true;
        }

        boolean throwsException(String expectedName) {
            if (!result.isException()) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this + " should have thrown an exception " + expectedName +
                                " but did not.");
                return false;
            }

            Throwable exception = result.getException();
            if (!expectedName.equals(exception.getClass().getCanonicalName())) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this + " should have thrown the exception " +
                                expectedName +
                                ", but throwed the exception " + exception + "\n" +
                                TestUtils.getStackTrace(exception));
                return false;
            }

            return true;
        }

        boolean nonNull() {
            if (!noException())
                return false;
            if (result.getValue() == null) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this +
                                " returned null but it should not have\n");
                return false;
            } else
                return true;
        }

        boolean nonNull(Supplier<String> msg) {
            if (!noException())
                return false;
            if (result.getValue() == null) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this +
                                " returned null but it should not have\n" +
                                msg.get());
                return false;
            } else
                return true;
        }

        boolean isNull() {
            if (!noException())
                return false;
            if (result.getValue() != null) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this +
                                " should have returned null but did not\n");
                return false;
            } else
                return true;
        }

        boolean isNull(Supplier<String> msg) {
            if (!noException())
                return false;
            if (result.getValue() != null) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this +
                                " should have returned null but did not\n" +
                                msg.get());
                return false;
            } else
                return true;
        }

        boolean fresh(Object obj) {
            return fresh(result.getValue(), obj);
        }

        boolean fresh(Object obj1, Object obj2) {
            if (obj1 != null && obj1 == obj2) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this +
                                " returned an object\n  " + TestUtils.print(obj1) +
                                "\nwhich is the same REFERENCE as an argument object; " +
                                "a NEW object should have been returned\n");
                return false;
            } else
                return true;
        }

        boolean unchanged(Object obj1, Object obj2) {
            return report_unchanged(obj1.equals(obj2), obj1, obj2);
        }

        boolean report_unchanged(boolean result, Object obj1, Object obj2) {
            if (!result) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this +
                                "\nchanged a method parameter into\n  " + TestUtils.print(obj1) +
                                "\nwhich used to be\n  " + TestUtils.print(obj2)
                                + ".\nIt should not have been changed.\n");
            }
            return result;
        }

        boolean unchanged_array(Object[] original, Object[] newer) {
            boolean ok_sofar = true;

            if (newer.length != original.length) {
                ok_sofar = false;
            }

            for (int i = 0; i < newer.length; i++) {
                if (newer[i] == null)
                    ok_sofar = (original[i] == null);
                else
                    ok_sofar = newer[i].equals(original[i]);
            }

            if (!ok_sofar) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "the call to " + this +
                                " has modified the input array " + TestUtils.printArray(original) +
                                "; it has now the elements " + TestUtils.printArray(newer));
                return ok_sofar;
            }
            return ok_sofar;
        }

        boolean unchanged_array(int[] original, int[] newer) {
            boolean ok_sofar = true;

            if (newer.length != original.length) {
                ok_sofar = false;
            }

            for (int i = 0; i < newer.length; i++) {
                ok_sofar = newer[i] == original[i];
            }

            if (!ok_sofar) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "the call to " + this +
                                " has modified the input array " + TestUtils.printArray(original) +
                                "; it has now the elements " + TestUtils.printArray(newer));
                return ok_sofar;
            }
            return ok_sofar;
        }

        boolean unchanged_array(char[] original, char[] newer) {
            boolean ok_sofar = true;

            if (newer.length != original.length) {
                ok_sofar = false;
            }

            for (int i = 0; i < newer.length; i++) {
                ok_sofar = newer[i] == original[i];
            }

            if (!ok_sofar) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "the call to " + this +
                                " has modified the input array " + TestUtils.printArray(original) +
                                "; it has now the elements " + TestUtils.printArray(newer));
                return ok_sofar;
            }
            return ok_sofar;
        }

        boolean setsMatch(Object expected) {
            if (!noException())
                return false;

            if (!(expected instanceof Iterable<?>)) {
                TestData.message("Cannot iterate over expected value " + TestUtils.print(expected));
                throw new RuntimeException();
            }
            Iterable<?> ev = (Iterable<?>) expected;

            E value = result.getValue();
            if (!(value instanceof Iterable<?>)) {
                TestData.message("Cannot iterate over result value " + TestUtils.print(value));
                throw new RuntimeException();
            }
            Iterable<?> iv = (Iterable<?>) value;

            HashSet<Object> ts1 = new HashSet<Object>();
            HashSet<Object> ts2 = new HashSet<Object>();

            for (Object s1 : iv)
                ts1.add(s1);
            for (Object s2 : ev)
                ts2.add(s2);

            if (!ts1.equals(ts2)) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this +
                                " returned a value\n" + TestUtils.print(value) +
                                "\nwhich does not contain the same elements as the expected answer" +
                                "\n" + expected);
                return false;
            }

            return true;
        }

        // For use in invariant checking code only -- does not report failure
        boolean silentCheckTrueResult() {
            if (result.isException()) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
                Throwable throwable = result.getException();
                TestUtils.printCallException(throwable);
                return false;
            }

            E value = result.getValue();

            if (value == null) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
                return false;
            }

            return value.equals(true);
        }

        boolean equalsExpected(Object value, Object expected) {
            if (value == null) {
                if (expected != null) {
                    TestUtils.printError(TestUtils.ExecutionTime.LAST,
                            "\nthe call to " + this + " returned null, " +
                                    "but should have returned " + TestUtils.print(expected));
                    return false;
                } else
                    return true;
            }

            if (!equalsWithArrays(expected, value)) {
                TestUtils.printError(TestUtils.ExecutionTime.LAST,
                        "\nthe call to " + this + " returned\n  " + TestUtils.print(value) +
                                "\n\nbut should have returned\n  " + TestUtils.print(expected));
                return false;
            } else
                return true;
        }

        boolean valuesMatch(Object expected) {
            if (result.isException()) {
                noException();
                return false;
            } else {
                E value = result.getValue();
                return equalsExpected(value, expected);
            }
        }

        private static boolean equalsWithArrays(Object expected, Object value) {
            if (expected == null)
                return value == null;
            if (value == null)
                return expected == null;
            if (expected.equals(value))
                return true;
            if (expected instanceof Object[] && value instanceof Object[]) {
                Object[] obj_expected = (Object[]) expected;
                Object[] obj_value = (Object[]) value;
                return Arrays.deepEquals(obj_expected, obj_value);
            } else if (expected instanceof int[] && value instanceof int[]) {
                int[] obj_expected = (int[]) expected;
                int[] obj_value = (int[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else if (expected instanceof char[] && value instanceof char[]) {
                char[] obj_expected = (char[]) expected;
                char[] obj_value = (char[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else if (expected instanceof long[] && value instanceof long[]) {
                long[] obj_expected = (long[]) expected;
                long[] obj_value = (long[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else if (expected instanceof float[] && value instanceof float[]) {
                float[] obj_expected = (float[]) expected;
                float[] obj_value = (float[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else if (expected instanceof double[] && value instanceof double[]) {
                double[] obj_expected = (double[]) expected;
                double[] obj_value = (double[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else if (expected instanceof byte[] && value instanceof byte[]) {
                byte[] obj_expected = (byte[]) expected;
                byte[] obj_value = (byte[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else if (expected instanceof short[] && value instanceof short[]) {
                short[] obj_expected = (short[]) expected;
                short[] obj_value = (short[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else if (expected instanceof boolean[] && value instanceof boolean[]) {
                boolean[] obj_expected = (boolean[]) expected;
                boolean[] obj_value = (boolean[]) value;
                return Arrays.equals(obj_expected, obj_value);
            } else
                return false;
        }

        public boolean checkResult(F expected) {
            if (!hasCalled())
                throw new RuntimeException();

            return valuesMatch(expected);
        }
    }

    static class GetCompra extends TestCall<Compra, Compra> {
        Almacen x_1;
        Integer x_2;

        public GetCompra(Almacen x_1, Integer x_2) {
            this.x_1 = x_1;
            this.x_2 = x_2;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".getCompra"));
            output.append(new String("("));
            output.append(TesterCode.printer(x_2));
            output.append(new String(")"));
            return output.toString();
        }

        public Compra call() {
            return x_1.getCompra(x_2);
        }

        public boolean checkResult(Compra expected) {
            if (!noException())
                return false;
            if (!valuesMatch(expected))
                return false;
            return true;
        }

    }

    static class Constructor extends TestCall<Almacen, Void> {

        public Constructor() {
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(new String("new Almacen"));
            output.append(new String("("));
            output.append(new String(")"));
            return output.toString();
        }

        public Almacen call() {
            return new Almacen();
        }

        public boolean checkResult(Void expected) {
            if (!noException())
                return false;
            return true;
        }

    }

    static class Pedir extends TestCall<Integer, Boolean> {
        Almacen x_1;
        String x_2;
        String x_3;
        int x_4;

        public Pedir(Almacen x_1, String x_2, String x_3, int x_4) {
            this.x_1 = x_1;
            this.x_2 = x_2;
            this.x_3 = x_3;
            this.x_4 = x_4;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".pedir"));
            output.append(new String("("));
            output.append(TesterCode.printer(x_2));
            output.append(new String(", "));
            output.append(TesterCode.printer(x_3));
            output.append(new String(", "));
            output.append(TesterCode.printer(x_4));
            output.append(new String(")"));
            return output.toString();
        }

        public Integer call() {
            return x_1.pedir(x_2, x_3, x_4);
        }

        public boolean checkResult(Boolean expected) {
            if (!noException())
                return false;
            if (!TestUtils.checkNull(this, result, expected))
                return false;
            return true;
        }

    }

    static class GetCompras extends
            TestCall<es.upm.aedlib.indexedlist.IndexedList<Compra>, es.upm.aedlib.indexedlist.IndexedList<Compra>> {
        Almacen x_1;

        public GetCompras(Almacen x_1) {
            this.x_1 = x_1;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".getCompras"));
            output.append(new String("("));
            output.append(new String(")"));
            return output.toString();
        }

        public es.upm.aedlib.indexedlist.IndexedList<Compra> call() {
            return x_1.getCompras();
        }

        public boolean checkResult(es.upm.aedlib.indexedlist.IndexedList<Compra> expected) {
            if (!noException())
                return false;
            if (!nonNull())
                return false;
            if (!TestUtils.sameSet(this, result, expected))
                return false;
            if (!AlmacenUtils.checkCompras(this, result, expected))
                return false;
            return true;
        }

    }

    static class GetProductos extends
            TestCall<es.upm.aedlib.indexedlist.IndexedList<Producto>, es.upm.aedlib.indexedlist.IndexedList<Producto>> {
        Almacen x_1;

        public GetProductos(Almacen x_1) {
            this.x_1 = x_1;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".getProductos"));
            output.append(new String("("));
            output.append(new String(")"));
            return output.toString();
        }

        public es.upm.aedlib.indexedlist.IndexedList<Producto> call() {
            return x_1.getProductos();
        }

        public boolean checkResult(es.upm.aedlib.indexedlist.IndexedList<Producto> expected) {
            if (!noException())
                return false;
            if (!nonNull())
                return false;
            if (!AlmacenUtils.checkProductos(this, result, expected))
                return false;
            if (!valuesMatch(expected))
                return false;
            return true;
        }

    }

    static class ComprasCliente extends
            TestCall<es.upm.aedlib.indexedlist.IndexedList<Compra>, es.upm.aedlib.indexedlist.IndexedList<Compra>> {
        Almacen x_1;
        String x_2;

        public ComprasCliente(Almacen x_1, String x_2) {
            this.x_1 = x_1;
            this.x_2 = x_2;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".comprasCliente"));
            output.append(new String("("));
            output.append(TesterCode.printer(x_2));
            output.append(new String(")"));
            return output.toString();
        }

        public es.upm.aedlib.indexedlist.IndexedList<Compra> call() {
            return x_1.comprasCliente(x_2);
        }

        public boolean checkResult(es.upm.aedlib.indexedlist.IndexedList<Compra> expected) {
            if (!noException())
                return false;
            if (!nonNull())
                return false;
            if (!TestUtils.sameSet(this, result, expected))
                return false;
            return true;
        }

    }

    static class ReabastecerProducto extends TestCall<Void, Void> {
        Almacen x_1;
        String x_2;
        int x_3;

        public ReabastecerProducto(Almacen x_1, String x_2, int x_3) {
            voidReturn = true;
            this.x_1 = x_1;
            this.x_2 = x_2;
            this.x_3 = x_3;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".reabastecerProducto"));
            output.append(new String("("));
            output.append(TesterCode.printer(x_2));
            output.append(new String(", "));
            output.append(TesterCode.printer(x_3));
            output.append(new String(")"));
            return output.toString();
        }

        public Void call() {
            x_1.reabastecerProducto(x_2, x_3);
            return null;
        }

        public boolean checkResult(Void expected) {
            if (!noException())
                return false;
            return true;
        }

    }

    static class GetProducto extends TestCall<Producto, Producto> {
        Almacen x_1;
        String x_2;

        public GetProducto(Almacen x_1, String x_2) {
            this.x_1 = x_1;
            this.x_2 = x_2;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".getProducto"));
            output.append(new String("("));
            output.append(TesterCode.printer(x_2));
            output.append(new String(")"));
            return output.toString();
        }

        public Producto call() {
            return x_1.getProducto(x_2);
        }

        public boolean checkResult(Producto expected) {
            if (!noException())
                return false;
            if (!valuesMatch(expected))
                return false;
            return true;
        }

    }

    static class ComprasProducto extends
            TestCall<es.upm.aedlib.indexedlist.IndexedList<Compra>, es.upm.aedlib.indexedlist.IndexedList<Compra>> {
        Almacen x_1;
        String x_2;

        public ComprasProducto(Almacen x_1, String x_2) {
            this.x_1 = x_1;
            this.x_2 = x_2;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();
            output.append(TesterCode.printer(x_1));
            output.append(new String(".comprasProducto"));
            output.append(new String("("));
            output.append(TesterCode.printer(x_2));
            output.append(new String(")"));
            return output.toString();
        }

        public es.upm.aedlib.indexedlist.IndexedList<Compra> call() {
            return x_1.comprasProducto(x_2);
        }

        public boolean checkResult(es.upm.aedlib.indexedlist.IndexedList<Compra> expected) {
            if (!noException())
                return false;
            if (!nonNull())
                return false;
            if (!TestUtils.sameSet(this, result, expected))
                return false;
            return true;
        }

    }

    static class TestData {
        static String testName = "";
        static ArrayList<String> trace;
        static ArrayList<String> messages;
        static boolean isJunitTester;
        static int individualTimeout = 10;
        static int globalTimeout = 60;

        public static void initTrace() {
            trace = new ArrayList<String>();
            messages = new ArrayList<String>();
        }

        public static void setTesterType(boolean junitTesting) {
            isJunitTester = junitTesting;
        }

        public static boolean isJunitTester() {
            return isJunitTester;
        }

        public static int getIndividualTimeout() {
            return individualTimeout;
        }

        public static void setIndividualTimeout(int timeout) {
            individualTimeout = timeout;
        }

        public static int getGlobalTimeout() {
            return globalTimeout;
        }

        public static void setGlobalTimeout(int timeout) {
            globalTimeout = timeout;
        }

        public static void addCallToTrace(String callString) {
            if (!callString.equals(""))
                trace.add("  " + callString);
            else
                trace.add(callString);
        }

        public static void modifyLastCallInTrace(String callString) {
            if (trace.size() > 0) {
                trace.remove(trace.size() - 1);
                if (!callString.equals(""))
                    trace.add("  " + callString);
                else
                    trace.add(callString);
            }
        }

        public static void message(String message) {
            messages.add(message);
        }

        public static int numCommands() {
            return trace.size();
        }

        private static String arrayToString(ArrayList<String> arr) {
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < arr.size(); i++) {
                String item = arr.get(i);
                if (!item.equals("")) {
                    sb.append(item + "\n");
                }
            }
            return sb.toString();
        }

        public static String getTrace() {
            return arrayToString(trace);
        }

        public static String getMessages() {
            return arrayToString(messages);
        }

        public static String getTestName() {
            return testName;
        }

        public static ArrayList<String> getRawTrace() {
            return trace;
        }

        public static void setTrace(ArrayList<String> setTrace) {
            trace = setTrace;
        }

        public static void setTestName(String setTestName) {
            testName = setTestName;
        }

        public static void setContext(String setTestName, ArrayList<String> setTrace) {
            setTestName(setTestName);
            setTrace(setTrace);
        }
    }

    static class ResultsHandler {
        public static volatile CountDownLatch waitForThreads = null;
        static LinkedHashMap<String, Boolean> results_sofar;
        static HashSet<String> runningTests;
        static int numTestsRemaining = 1000;
        static long endTime = 0;

        static void init() {
            if (results_sofar == null)
                results_sofar = new LinkedHashMap<String, Boolean>();
            if (runningTests == null)
                runningTests = new HashSet<String>();
        }

        static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
            numTestsRemaining = numTestsToRun;
            endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds * 1000;
        }

        static boolean isTimedout() {
            return System.currentTimeMillis() > endTime;
        }

        static void startTest(String testName) {
            runningTests.add(testName);
        }

        static void stopTest(String testName) {
            runningTests.remove(testName);
            --numTestsRemaining;
        }

        static boolean results_ok_sofar() {
            for (String key : results_sofar.keySet())
                if (!results_sofar.get(key))
                    return false;
            return true;
        }

        static boolean local_results_ok_sofar(String test_type) {
            Boolean result = results_sofar.get(test_type);
            return (result == null) || result;
        }

        static void add_result(String test_type, boolean result) {
            Boolean old_result = results_sofar.get(test_type);
            if ((old_result == null) || old_result)
                results_sofar.put(test_type, result);
        }

        static boolean results_ok() {
            if (results_sofar.size() == 0) {
                System.out.println("\n*** Error: no tests were run");
                return false;
            }

            if (runningTests.size() > 0) {
                System.out.println("\n*** Error: some tests " + runningTests + " are still running\n");
                return false;
            }

            for (String key : results_sofar.keySet())
                if (!results_sofar.get(key))
                    return false;

            if (numTestsRemaining > 0) {
                System.out.println("\n*** Error: some tests (" + numTestsRemaining + ") did not run\n");
                return false;
            }

            return true;
        }

        static int get_nota() {
            if (results_ok())
                return 10;
            else
                return 0;
        }

        static void report_results() {
            System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

            for (String testName : results_sofar.keySet()) {
                System.out.print("Testing results for " + testName + ": ");
                if (results_sofar.get(testName)) {
                    System.out.println("succeeded");
                } else {
                    System.out.println("failed");
                }
            }

            System.out.println("\n------------------------------------------");
            if (results_ok()) {
                System.out.println("\n" + Tests.tester + ": Test finalizado correctamente.\n");
                System.out.println(readFile("aed_success_message.txt"));
            } else {
                System.out.println("\n" + Tests.tester + ": errores detectados.\n\n");
            }
        }

        private static String readFile(String filePath) {
            StringBuilder sb = new StringBuilder();
            Path path = Paths.get(filePath);

            if (Files.isReadable(path)) {
                try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {
                    stream.forEach(s -> sb.append(s).append("\n"));
                } catch (IOException e) {
                }
                ;
            }

            return sb.toString();
        }

    }

    static class TesterCode {

        public static void resetPrinter() {
            AlmacenUtils.resetPrinter();
        }

        public static String printer(Object obj) {
            return AlmacenUtils.printer(obj);
        }

    }

}
