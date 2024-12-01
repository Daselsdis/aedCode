
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
// File generated at: 2023/11/29 -- 22:32:45
// Seed: {1701,293564,95882}
//
//////////////////////////////////////////////////////////////////////



package aed.urgencias;

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
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.priorityqueue.SortedListPriorityQueue;
import es.upm.aedlib.set.*;
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
@SuppressWarnings({"unused","deprecation"})
public class TesterLab6 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(79,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,10,0) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_urgencias_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_01")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_02")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18745519T"),6,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18745519T"),6,5,5)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_03")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("46615747J"),5,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46615747J"),5,8,8)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_04")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51969627F"),0,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51969627F"),0,6,6)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_05")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64134438A"),7,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64134438A"),7,4,4)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_06")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_07")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,3,3).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_08")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("74365288G")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99571152Q"),2,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99571152Q"),2,5,5)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_09")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,9).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77278727I"),6,10).doCall().checkResult(new PacienteNoExisteException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_10")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("54595399M"),6,0).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96653327K"),5,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96653327K"),5,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87593922F"),3,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87593922F"),3,19,19)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_11")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81877123Q"),5,4).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89732824T"),10,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89732824T"),10,11,11)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_12")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17769772A"),2,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17769772A"),2,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51635447B"),0,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51635447B"),0,5,5)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_13")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29235483I"),5,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29235483I"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29235483I"),5,5,5) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_14")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),2,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),2,0,0)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),1,10,10)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),1,0,5)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_15")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),4,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),4,1,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),4,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,0,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),4,1,1)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_16")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),5,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_17")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("111"),2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,5,5)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_18")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),6,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),6,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),4,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,0,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,0,2)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_19")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97851177F"),8,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97851177F"),8,4,4)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("97851177F"),10,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97851177F"),10,4,10)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("97851177F")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97851177F"),10,4,10)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97851177F"),10,4,10)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_20")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),0,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),0,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),1,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),1,1,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("333"),2,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("333"),2,2,2)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),0,0,0)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_21")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("222"),2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(10,1)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_22")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28327689M"),7,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28327689M"),7,9,9)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,53,14).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("28327689M"),8,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28327689M"),8,9,17)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28327689M"),8,9,17)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(17,1)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_23")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31482972R"),2,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31482972R"),2,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94852257T"),0,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94852257T"),0,2,2)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("31482972R"),6,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31482972R"),6,0,3)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("31482972R"),0,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31482972R"),0,0,13)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94852257T"),0,2,2)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_24")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35778878Z"),8,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35778878Z"),8,4,4)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35778878Z"),8,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52484826E"),0,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52484826E"),0,12,12)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("52484826E")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52484826E"),0,12,12)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52484826E"),0,12,12) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_25")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39113316F"),8,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39113316F"),8,3,3)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39113316F"),8,3,3)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97939113B"),10,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97939113B"),10,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33772593B"),6,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33772593B"),6,18,18)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33772593B"),6,18,18)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_26")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43339224U"),0,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43339224U"),0,7,7)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43339224U"),5,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43339224U"),5,7,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59169537B"),8,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59169537B"),8,18,18)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("59564216A"),9,20).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14479114L"),1,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14479114L"),1,29,29)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_27")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81776941M"),0,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81776941M"),0,7,7)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("81776941M")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81776941M"),0,7,7)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81776941M"),0,7,7)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66675314R"),4,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66675314R"),4,19,19)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_28")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82252876Q"),8,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82252876Q"),8,4,4)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,29,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82252876Q"),10,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82252876Q"),10,4,12)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("65481784B"),6,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65481784B"),6,20,20)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_29")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38854765C"),3,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38854765C"),3,0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("38854765C"),4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38854765C"),3,0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,10).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42743134R"),9,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42743134R"),9,16,16)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42743134R"),6,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42743134R"),6,16,24)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42743134R"),6,16,24) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_30")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95895725G"),9,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95895725G"),9,6,6)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95895725G"),9,6,6) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95895725G"),9,6,6)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(2,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34761381U"),3,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34761381U"),3,12,12)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47894122K"),4,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47894122K"),4,14,14)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_31")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("36335983G"),2,8).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34456463G"),1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34456463G"),1,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31543326P"),9,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31543326P"),9,14,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67848314V"),0,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67848314V"),0,20,20)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,17,30).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96334233V"),5,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96334233V"),5,32,32)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_32")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,41,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83786953Y"),8,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83786953Y"),8,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28971996Y"),5,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28971996Y"),5,9,9)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28971996Y"),5,9,9),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83786953Y"),8,7,7) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_33")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),7,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),7,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("333"),8,100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("333"),8,100,100)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,1500,2000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3000).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,1,2000)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,4000).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),6,2,2000)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,5000).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("333"),7,100,2000)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_34")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38474512A"),10,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38474512A"),10,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42152987Z"),8,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42152987Z"),8,11,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96749498E"),4,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96749498E"),4,15,15)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42152987Z"),10,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42152987Z"),10,11,22)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96749498E"),4,15,15)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38474512A"),10,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24619211R"),6,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24619211R"),6,38,38)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_35")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82446612Q"),8,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82446612Q"),8,8,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77461136U"),9,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77461136U"),9,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98964411M"),2,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98964411M"),2,19,19)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33391593S"),9,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33391593S"),9,24,24)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("98964411M"),7,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98964411M"),7,19,29)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82446612Q"),5,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82446612Q"),5,8,33)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_36")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89679877N"),4,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89679877N"),4,8,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86244828O"),3,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86244828O"),3,11,11)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86244828O"),3,11,11),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89679877N"),4,8,8) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("89679877N"),4,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89679877N"),4,8,8)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,23,20).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86244828O"),3,11,11),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89679877N"),4,8,8) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86244828O"),3,11,11)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_37")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("57835112W")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56849694H"),8,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56849694H"),8,9,9)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56849694H"),8,9,9)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,23,28).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78236933S"),1,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78236933S"),1,34,34)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43264184Q"),5,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43264184Q"),5,43,43)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_38")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83169877P"),3,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83169877P"),3,1,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43371591C"),3,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43371591C"),3,11,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43127173G"),1,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43127173G"),1,13,13)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("83169877P"),7,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83169877P"),7,1,16)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,92,25).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("83169877P"),0,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83169877P"),0,1,33)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("83169877P"),6,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83169877P"),6,1,38)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43127173G"),1,13,13)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_39")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49122721B"),0,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49122721B"),0,9,9)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("49122721B"),18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49122721B"),0,9,9)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,23).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59715841Y"),8,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59715841Y"),8,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59715841Y"),8,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44927534T"),6,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44927534T"),6,32,32)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77956834L"),0,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77956834L"),0,35,35)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44927534T"),4,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44927534T"),4,32,38)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44927534T"),5,48).doCall().checkResult(new PacienteExisteException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_40")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23716149B"),2,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23716149B"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48778641I"),5,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48778641I"),5,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84742486W"),9,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84742486W"),9,16,16)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("23716149B"),21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23716149B"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48778641I"),5,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21381642X"),7,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21381642X"),7,32,32)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("21381642X"),2,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21381642X"),2,32,38)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("84742486W"),4,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84742486W"),4,16,41)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_41")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("58731174M"),3,6).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("57794866L")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45219142X"),3,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45219142X"),3,16,16)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45219142X"),3,16,16) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26659573G"),9,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26659573G"),9,19,19)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45219142X"),3,16,16)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("26659573G"),2,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26659573G"),2,19,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64855997P"),10,37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64855997P"),10,37,37)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_42")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("73375692U"),4,0).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27762927T"),10,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27762927T"),10,2,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27762927T"),10,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59518654L"),9,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59518654L"),9,14,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49537343F"),8,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49537343F"),8,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49537343F"),6,20).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("49537343F"),8,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49537343F"),8,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23185187Y"),1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23185187Y"),1,27,27)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77936455U"),9,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77936455U"),9,28,28)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_43")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("86769299D"),0,9).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33573496V"),9,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33573496V"),9,19,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56825714B"),3,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56825714B"),3,29,29)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("33573496V"),9,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33573496V"),9,19,19)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56825714B"),3,29,29)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("33573496V"),47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33573496V"),9,19,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28686612S"),0,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28686612S"),0,48,48)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48878954G"),2,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48878954G"),2,57,57)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64135682U"),7,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64135682U"),7,65,65)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_44")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89112959V"),10,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89112959V"),10,7,7)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("89112959V"),4,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89112959V"),4,7,11)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89112959V"),4,7,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17453546M"),4,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17453546M"),4,25,25)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17453546M"),4,25,25)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("45776111B"),35).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("47824388W")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61992918C"),5,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61992918C"),5,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21981778Z"),10,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21981778Z"),10,45,45)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("61992918C")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61992918C"),5,41,41)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_45")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,4,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52251969H"),6,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52251969H"),6,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32618858Q"),1,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32618858Q"),1,23,23)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("52251969H"),24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52251969H"),6,13,13)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32618858Q"),1,23,23) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82521984U"),6,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82521984U"),6,27,27)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("32618858Q"),35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32618858Q"),1,23,23)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43575346V"),0,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43575346V"),0,42,42)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43575346V"),10,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43575346V"),10,42,47)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("43575346V"),56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43575346V"),10,42,47)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82521984U"),4,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82521984U"),4,27,58)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_46")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43555125H"),3,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43555125H"),3,1,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13946442M"),0,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13946442M"),0,2,2)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43555125H"),0,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43555125H"),0,1,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82295167G"),8,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82295167G"),8,20,20)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("82295167G")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82295167G"),8,20,20)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13946442M"),0,2,2)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43555125H"),7,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43555125H"),7,1,31)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("82295167G"),39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82295167G"),8,20,20)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84284216C"),1,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84284216C"),1,40,40)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75862392A"),0,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75862392A"),0,47,47)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("75862392A"),2,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75862392A"),2,47,54)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(19,1)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_47")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67661889Q"),2,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67661889Q"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92251684M"),2,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92251684M"),2,17,17)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67661889Q"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92251684M"),2,17,17)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62156239L"),7,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62156239L"),7,30,30)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62156239L"),7,30,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43562263R"),6,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43562263R"),6,39,39)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,56,40).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43562263R"),2,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43562263R"),2,39,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43562263R"),2,39,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,61).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_48")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("39821122Z")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77511516O"),3,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77511516O"),3,4,4)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77511516O"),3,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16958928C"),10,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16958928C"),10,18,18)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16958928C"),10,18,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42424322K"),10,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42424322K"),10,27,27)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28644254R"),4,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28644254R"),4,32,32)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22376945W"),0,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22376945W"),0,38,38)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71951611F"),6,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71951611F"),6,40,40)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22376945W"),0,38,38),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28644254R"),4,32,32),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71951611F"),6,40,40),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42424322K"),10,27,27) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_49")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,1).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("111")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("111"),4).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),2,5).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,100,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,20,20)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,20,20)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_50")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_51")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43571983Y"),9,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43571983Y"),9,1,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43571983Y"),10,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43571983Y"),10,1,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47755537R"),3,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47755537R"),3,13,13)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43571983Y"),10,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43571983Y"),10,1,6)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47755537R"),3,13,13)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43571983Y"),10,1,6) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43571983Y"),6,37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43571983Y"),6,1,37)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(16,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17862297M"),2,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17862297M"),2,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99228582X"),10,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99228582X"),10,42,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17862297M"),2,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56738967Y"),10,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56738967Y"),10,58,58)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95942771I"),6,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95942771I"),6,64,64)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_51")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_52")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51394486Q"),6,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51394486Q"),6,0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51394486Q"),6,0,0) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("51394486Q"),6,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51394486Q"),6,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99158782T"),6,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99158782T"),6,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27163276N"),9,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27163276N"),9,13,13)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51394486Q"),6,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("69691557Z"),2,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69691557Z"),2,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69691557Z"),2,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99158782T"),6,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("41153676J"),10,44).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41153676J"),10,44,44)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48643886Z"),7,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48643886Z"),7,45,45)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("41153676J"),0,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41153676J"),0,44,51)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,87,58).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_52")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_53")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68224532J"),4,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68224532J"),4,3,3)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68224532J"),4,3,3)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88785246C"),10,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88785246C"),10,10,10)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88785246C"),10,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13299185L"),10,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13299185L"),10,21,21)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67785174V"),10,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67785174V"),10,30,30)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13299185L"),10,21,21)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67785174V"),10,30,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82669653R"),4,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82669653R"),4,39,39)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("82669653R"),41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82669653R"),4,39,39)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92279554Y"),7,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92279554Y"),7,45,45)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("92279554Y"),8,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92279554Y"),8,45,46)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,8,49).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_53")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_54 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_54")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,92,4).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36252718F"),5,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36252718F"),5,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66733135K"),9,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66733135K"),9,8,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26923979J"),0,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26923979J"),0,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29357398S"),1,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29357398S"),1,21,21)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26923979J"),0,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74211356W"),6,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74211356W"),6,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29357398S"),1,21,21)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36252718F"),5,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99679371U"),7,44).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99679371U"),7,44,44)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74625466A"),10,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74625466A"),10,46,46)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("74211356W"),52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74211356W"),6,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32978441C"),1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32978441C"),1,54,54)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_54")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_55 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_55") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_55")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("85748624Y"),5).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45657411O"),7,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45657411O"),7,6,6)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("45657411O"),15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45657411O"),7,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79232458S"),10,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79232458S"),10,16,16)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("79232458S"),5,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79232458S"),5,16,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25774261W"),2,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25774261W"),2,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25774261W"),5,25).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("79232458S"),2,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79232458S"),2,16,35)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25774261W"),2,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74127979F"),4,53).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74127979F"),4,53,53)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79232458S"),2,16,35)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(66,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35994323N"),0,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35994323N"),0,72,72)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_55")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_56 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_56") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_56")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86117476T"),8,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86117476T"),8,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42385993N"),5,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42385993N"),5,9,9)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,51,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66327369B"),6,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66327369B"),6,25,25)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42385993N"),5,9,9)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("86117476T"),27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86117476T"),8,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38154317Y"),2,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38154317Y"),2,31,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63647893T"),0,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63647893T"),0,40,40)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36168393K"),4,44).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36168393K"),4,44,44)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("63647893T"),48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63647893T"),0,40,40)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38154317Y"),2,31,31)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("66327369B"),8,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66327369B"),8,25,57)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,67).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36168393K"),4,44,44)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74687354Z"),6,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74687354Z"),6,69,69)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,51,74).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_56")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_57 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_57") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_57")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63771987V"),2,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63771987V"),2,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("46193527F"),4,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46193527F"),4,11,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86898647F"),5,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86898647F"),5,17,17)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,91,26).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93667656Q"),4,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93667656Q"),4,33,33)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("46193527F"),7,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46193527F"),7,11,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79597176Y"),5,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79597176Y"),5,46,46)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("93667656Q"),3,56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93667656Q"),3,33,56)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84636993L"),8,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84636993L"),8,64,64)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("63771987V"),69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63771987V"),2,5,5)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("84636993L"),73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84636993L"),8,64,64)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17629952S"),8,78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17629952S"),8,78,78)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13483178Y"),1,88).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13483178Y"),1,88,88)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16841393D"),0,90).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16841393D"),0,90,90)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88356484S"),6,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88356484S"),6,96,96)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_57")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_58 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_58") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_58")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63418377I"),5,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63418377I"),5,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89934137Z"),0,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89934137Z"),0,13,13)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89934137Z"),0,13,13)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63418377I"),5,4,4) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57822434E"),4,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57822434E"),4,25,25)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57822434E"),4,25,25)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43845437Q"),7,44).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43845437Q"),7,44,44)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74124928Q"),5,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74124928Q"),5,48,48)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63418377I"),5,4,4)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("74124928Q"),0,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74124928Q"),0,48,63)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43845437Q"),9,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43845437Q"),9,44,73)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74124928Q"),0,48,63)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43845437Q"),9,44,73) }) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(94,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28843462U"),9,76).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28843462U"),9,76,76)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,87,83).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,84).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43845437Q"),9,44,73)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_58")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_59 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_59") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_59")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34458875X"),2,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34458875X"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17314162Y"),1,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17314162Y"),1,7,7)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34458875X"),2,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34458875X"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17314162Y"),1,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("41931334V"),2,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41931334V"),2,26,26)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34458875X"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41931334V"),2,26,26)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,50).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36888999T"),2,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36888999T"),2,59,59)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36888999T"),2,59,59) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21268912W"),3,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21268912W"),3,65,65)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("12143217L"),5,68).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12143217L"),5,68,68)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("21268912W"),70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21268912W"),3,65,65)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36888999T"),2,59,59)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,87).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12143217L"),5,68,68)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29613996A"),8,91).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29613996A"),8,91,91)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11248617O"),7,97).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11248617O"),7,97,97)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11248617O"),7,97,97)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_59")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_60 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_60") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_60")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77835847C"),6,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77835847C"),6,4,4)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77835847C"),6,4,4) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77835847C"),6,4,4)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,4,15).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26786853P"),9,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26786853P"),9,16,16)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("26786853P"),26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26786853P"),9,16,16)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71237841Z"),9,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71237841Z"),9,33,33)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("71237841Z"),4,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71237841Z"),4,33,38)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57683252K"),9,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57683252K"),9,46,46)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71237841Z"),4,33,38)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16664682O"),3,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16664682O"),3,59,59)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("16664682O"),8,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16664682O"),8,59,63)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16664682O"),8,59,63)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("57683252K"),7,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57683252K"),7,46,69)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57683252K"),7,46,69)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("55196856X")).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_60")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_61 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_61") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_61")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("45852716D"),5,2).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61247146P"),2,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61247146P"),2,10,10)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61247146P"),2,10,10)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(9,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38511589U"),9,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38511589U"),9,29,29)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(9,1)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38511589U"),9,29,29)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87297151N"),8,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87297151N"),8,35,35)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67866913V"),6,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67866913V"),6,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44675163J"),4,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44675163J"),4,43,43)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68296559K"),3,50).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68296559K"),3,50,50)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("68296559K"),53).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68296559K"),3,50,50)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("87297151N"),6,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87297151N"),6,35,58)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("67866913V"),66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67866913V"),6,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22351635K"),9,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22351635K"),9,72,72)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("44675163J"),81).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44675163J"),4,43,43)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("87297151N"),9,83).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87297151N"),9,35,83)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24838933M"),9,88).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24838933M"),9,88,88)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_61")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_62 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_62") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_62")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("17154152L")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49183867V"),9,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49183867V"),9,3,3)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("49183867V"),5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49183867V"),9,3,3)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75192575M"),10,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75192575M"),10,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95946122O"),8,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95946122O"),8,14,14)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95946122O"),8,14,14),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75192575M"),10,6,6) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("75192575M"),7,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75192575M"),7,6,15)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("75192575M"),17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75192575M"),7,6,15)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95946122O"),8,14,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27724382D"),1,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27724382D"),1,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18857168L"),6,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18857168L"),6,39,39)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23338825M"),3,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23338825M"),3,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84293828I"),1,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84293828I"),1,46,46)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("23338825M"),2,50).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23338825M"),2,41,50)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27724382D"),1,29,29),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84293828I"),1,46,46),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23338825M"),2,41,50),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18857168L"),6,39,39) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77742145G"),5,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77742145G"),5,54,54)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("84293828I")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84293828I"),1,46,46)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("77742145G"),55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77742145G"),5,54,54)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27724382D"),1,29,29),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84293828I"),1,46,46),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23338825M"),2,41,50),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18857168L"),6,39,39) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("23338825M"),0,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23338825M"),0,41,65)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_62")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_63 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_63") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_63")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45295718P"),5,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45295718P"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45295718P"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91621669A"),3,17).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44466425N"),0,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44466425N"),0,23,23)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("44466425N"),27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44466425N"),0,23,23)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,33,29).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34279135F"),3,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34279135F"),3,36,36)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84191584F"),4,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84191584F"),4,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78526141Q"),1,50).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78526141Q"),1,50,50)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("84191584F"),59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84191584F"),4,42,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78526141Q"),1,50,50)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("34279135F"),67).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34279135F"),3,36,36)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("24138293R")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95839227X"),1,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95839227X"),1,70,70)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85551726V"),5,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85551726V"),5,74,74)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78796518J"),4,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78796518J"),4,75,75)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("85551726V")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85551726V"),5,74,74)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95839227X"),1,70,70),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78796518J"),4,75,75),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85551726V"),5,74,74) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("78796518J"),2,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78796518J"),2,75,79)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95839227X"),1,70,70),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78796518J"),2,75,79),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85551726V"),5,74,74) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_63")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_64 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_64") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_64")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76797168R"),7,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76797168R"),7,10,10)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("76797168R"),18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76797168R"),7,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71255521V"),1,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71255521V"),1,21,21)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71255521V"),22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71255521V"),1,21,21)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44243994J"),0,30).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("84532888A"),38).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67468372Z"),3,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67468372Z"),3,45,45)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49294436H"),3,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49294436H"),3,46,46)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93297139I"),7,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93297139I"),7,48,48)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("67468372Z"),5,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67468372Z"),5,45,58)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("67468372Z"),59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67468372Z"),5,45,58)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,69,66).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45531182I"),8,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45531182I"),8,69,69)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49294436H"),3,46,46)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43457526E"),7,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43457526E"),7,79,79)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76648316T"),2,85).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76648316T"),2,85,85)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67856899C"),2,89).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67856899C"),2,89,89)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51847554S"),7,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51847554S"),7,96,96)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,104).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76648316T"),2,85,85)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34476774Y"),7,114).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34476774Y"),7,114,114)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_64")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_65 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_65") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_65")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15911997E"),9,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15911997E"),9,3,3)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,21,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("15911997E"),3,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15911997E"),3,3,20)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15911997E"),3,3,20)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,91,27).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35347542N"),9,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35347542N"),9,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36111732K"),4,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36111732K"),4,35,35)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36111732K"),4,35,35)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("35347542N"),39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35347542N"),9,29,29)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("66724924F"),1,43).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("19356918L")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38112648S"),7,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38112648S"),7,49,49)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64651965I"),10,56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64651965I"),10,56,56)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19622755C"),8,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19622755C"),8,66,66)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88515863J"),8,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88515863J"),8,73,73)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38112648S"),7,49,49),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19622755C"),8,66,66),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88515863J"),8,73,73),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64651965I"),10,56,56) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("19622755C"),5,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19622755C"),5,66,74)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19622755C"),5,66,74)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38112648S"),1,87).doCall().checkResult(new PacienteExisteException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_65")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_66 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_66") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_66")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,21,1).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14489943F"),1,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14489943F"),1,6,6)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14489943F"),0,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14489943F"),0,6,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57249888T"),7,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57249888T"),7,15,15)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14489943F"),5,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14489943F"),5,6,22)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14489943F"),5,6,22)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19353463D"),1,37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19353463D"),1,37,37)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19353463D"),1,37,37),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57249888T"),7,15,15) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57249888T"),10,41).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23347291Z"),2,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23347291Z"),2,49,49)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19353463D"),1,37,37)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("57249888T"),62).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57249888T"),7,15,15)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("23347291Z"),6,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23347291Z"),6,49,72)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("23347291Z"),80).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23347291Z"),6,49,72)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94154357K"),1,90).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94154357K"),1,90,90)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15815943G"),8,98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15815943G"),8,98,98)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15815943G"),3,103).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,106).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94154357K"),1,90,90)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,111).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15815943G"),8,98,98)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74838265Y"),7,118).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74838265Y"),7,118,118)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,120).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74838265Y"),7,118,118)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,129).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_66")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_67 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_67") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_67")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73471633V"),6,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73471633V"),6,17,17)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17898795B"),3,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17898795B"),3,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81324679K"),9,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81324679K"),9,32,32)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17898795B"),3,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22766288S"),6,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22766288S"),6,47,47)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56858338P"),7,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56858338P"),7,49,49)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73471633V"),6,17,17)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("22766288S")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22766288S"),6,47,47)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,47,62).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22766288S"),6,47,47),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56858338P"),7,49,49),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81324679K"),9,32,32) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79919591K"),0,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79919591K"),0,70,70)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81324679K"),5,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81324679K"),5,32,74)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("56858338P"),83).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56858338P"),7,49,49)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,75,87).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("41264775X"),3,94).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41264775X"),3,94,94)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("22766288S"),98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22766288S"),6,47,47)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(54,2)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81324679K"),9,107).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81324679K"),9,32,107)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("79919591K"),0,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79919591K"),0,70,70)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("79919591K"),2,117).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79919591K"),2,70,117)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("41264775X"),3,122).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41264775X"),3,94,94)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,130).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79919591K"),2,70,117)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91594757Y"),6,136).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91594757Y"),6,136,136)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25756727K"),6,143).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25756727K"),6,143,143)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_67")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_68 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_68") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_68")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56251812E"),9,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56251812E"),9,8,8)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56251812E"),9,8,8)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44235444K"),0,20).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67672422K"),0,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67672422K"),0,21,21)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("67672422K"),1,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67672422K"),1,21,23)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67672422K"),1,21,23) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67672422K"),1,21,23)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36483581M"),4,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36483581M"),4,38,38)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34734518R"),2,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34734518R"),2,48,48)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("36483581M"),54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36483581M"),4,38,38)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("34734518R"),59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34734518R"),2,48,48)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56615527I"),10,61).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56615527I"),10,61,61)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56615527I"),10,61,61)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17269873J"),10,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17269873J"),10,72,72)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21624884J"),4,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21624884J"),4,79,79)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,84).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21624884J"),4,79,79)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84479357A"),7,91).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84479357A"),7,91,91)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39367287U"),6,101).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39367287U"),6,101,101)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39367287U"),6,101,101),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84479357A"),7,91,91),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17269873J"),10,72,72) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,104).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39367287U"),6,101,101)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,112).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84479357A"),7,91,91)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("17269873J"),121).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17269873J"),10,72,72)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("73596715A")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("83482561G"),8,129).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85766764V"),3,134).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85766764V"),3,134,134)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_68")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_69 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_69") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_69")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,3,0).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("82665882U"),1).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("76527614D"),4,7).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42473781Z"),3,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42473781Z"),3,13,13)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42473781Z"),2,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42473781Z"),2,13,20)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42473781Z"),1,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42473781Z"),1,13,24)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42473781Z"),1,13,24) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14676467R"),1,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14676467R"),1,33,33)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42473781Z"),1,13,24)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14676467R"),10,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14676467R"),10,33,51)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,53).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14676467R"),10,33,51)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,54,62).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66228285H"),9,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66228285H"),9,63,63)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("66228285H"),9,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66228285H"),9,63,63)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(49,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66228285H"),9,63,63)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,83).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("41863972D")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74916157I"),6,86).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74916157I"),6,86,86)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37718993G"),10,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37718993G"),10,96,96)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37718993G"),2,106).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37718993G"),2,96,106)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,110).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37718993G"),2,96,106)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("74916157I"),112).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74916157I"),6,86,86)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73733887K"),4,113).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73733887K"),4,113,113)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("73733887K"),6,118).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73733887K"),6,113,118)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_69")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_70 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_70") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_70")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63971366W"),2,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63971366W"),2,9,9)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63971366W"),2,9,9) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63971366W"),3,10).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63971366W"),2,9,9)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("83678992P"),22).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("56763722C"),31).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63816719G"),10,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63816719G"),10,39,39)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("63816719G"),42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63816719G"),10,39,39)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45524329V"),3,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45524329V"),3,51,51)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,61).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45524329V"),3,51,51)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23734215A"),9,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23734215A"),9,65,65)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81933262U"),4,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81933262U"),4,72,72)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81933262U"),4,72,72)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("23734215A"),4,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23734215A"),4,65,79)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("23734215A"),6,89).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23734215A"),6,65,89)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("23734215A"),95).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23734215A"),6,65,89)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("82853726V"),102).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28456147N"),9,110).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28456147N"),9,110,110)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83334971A"),10,117).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83334971A"),10,117,117)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28456147N"),9,110,110)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,133).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83334971A"),10,117,117)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,134).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66446845F"),2,142).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66446845F"),2,142,142)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,144).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66446845F"),2,142,142)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_70")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_71 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_71") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_71")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21584891F"),9,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21584891F"),9,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21842711Y"),0,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21842711Y"),0,16,16)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21842711Y"),0,16,16)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23392262M"),4,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23392262M"),4,30,30)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23392262M"),4,30,30)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("21584891F"),41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21584891F"),9,6,6)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,42).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,51).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19231646M"),3,56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19231646M"),3,56,56)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("19231646M")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19231646M"),3,56,56)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47443889J"),8,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47443889J"),8,58,58)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75192262L"),3,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75192262L"),3,65,65)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25469683R"),1,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25469683R"),1,70,70)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25469683R"),1,70,70)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,83).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19231646M"),3,56,56)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,2,86).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82925673C"),9,93).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82925673C"),9,93,93)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75192262L"),2,65,86),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47443889J"),7,58,86),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82925673C"),9,93,93) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98993939A"),8,103).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98993939A"),8,103,103)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,39,112).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82925673C"),5,114).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("47443889J")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47443889J"),7,58,86)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,115).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75192262L"),2,65,86)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("47443889J"),5,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47443889J"),5,58,123)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,126).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47443889J"),5,58,123)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("98993939A"),127).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98993939A"),8,103,103)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82925673C"),9,93,93) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_71")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_72 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_72") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_72")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77932995R"),1,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77932995R"),1,9,9)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77932995R"),1,9,9) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77932995R"),8,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77932995R"),8,9,14)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77932995R"),8,9,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58216212Y"),4,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58216212Y"),4,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17265339O"),10,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17265339O"),10,32,32)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58216212Y"),4,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47114551T"),2,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47114551T"),2,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("69378359Z"),1,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69378359Z"),1,49,49)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69378359Z"),1,49,49)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,74,61).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("17265339O"),3,71).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17265339O"),3,32,71)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47114551T"),2,42,42),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17265339O"),3,32,71) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82876284R"),3,81).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82876284R"),3,81,81)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23622275P"),0,91).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23622275P"),0,91,91)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,97).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23622275P"),0,91,91)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("12448157C"),0,100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12448157C"),0,100,100)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84193224M"),2,107).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84193224M"),2,107,107)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,110).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12448157C"),0,100,100)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,117).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47114551T"),2,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42982453T"),4,118).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42982453T"),4,118,118)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,122).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84193224M"),2,107,107)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("17265339O"),7,129).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17265339O"),7,32,129)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71162234M"),3,131).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71162234M"),3,131,131)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("82876284R")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82876284R"),3,81,81)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("71162234M"),10,133).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71162234M"),10,131,133)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82876284R"),3,81,81),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42982453T"),4,118,118),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17265339O"),7,32,129),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71162234M"),10,131,133) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64435591K"),2,140).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64435591K"),2,140,140)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,150).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64435591K"),2,140,140)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,22,159).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("71162234M"),7,163).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71162234M"),7,131,163)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,18,169).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("71162234M"),7,179).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71162234M"),7,131,163)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_72")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_73 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_73") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_73")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98342424A"),2,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98342424A"),2,0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98342424A"),2,0,0)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,71,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94624343P"),10,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94624343P"),10,14,14)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94624343P"),10,14,14) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94758238C"),8,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94758238C"),8,19,19)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94758238C"),8,19,19)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("94624343P"),37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94624343P"),10,14,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27347255B"),2,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27347255B"),2,39,39)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27347255B"),2,39,39)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55735289J"),7,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55735289J"),7,49,49)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55735289J"),7,49,49)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,55,55).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("74528146Q"),65).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("17152486L")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48234151C"),10,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48234151C"),10,70,70)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("48234151C"),9,71).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48234151C"),9,70,71)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48234151C"),9,70,71)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25214784Y"),6,82).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25214784Y"),6,82,82)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99665515G"),8,87).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99665515G"),8,87,87)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25214784Y"),6,82,82),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99665515G"),8,87,87) }) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25214784Y"),6,82,82),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99665515G"),8,87,87) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84647573D"),9,90).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84647573D"),9,90,90)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("25214784Y"),100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25214784Y"),6,82,82)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(21,5)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(21,5)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99665515G"),8,87,87)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43323524G"),1,116).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43323524G"),1,116,116)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81623748R"),9,124).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81623748R"),9,124,124)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("84647573D"),7,127).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84647573D"),7,90,127)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62618766Q"),3,128).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62618766Q"),3,128,128)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25961576Z"),6,132).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25961576Z"),6,132,132)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81623748R"),1,139).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81623748R"),1,124,139)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_73")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_74 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_74") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_74")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("11197478J"),0,5).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48353233K"),8,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48353233K"),8,12,12)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48353233K"),8,12,12)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82353763N"),3,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82353763N"),3,23,23)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42723752G"),4,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42723752G"),4,31,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15482653M"),7,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15482653M"),7,33,33)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82353763N"),3,23,23)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42723752G"),5,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42723752G"),5,31,48)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42723752G"),5,31,48)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15482653M"),7,33,33)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(71,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15634976R"),7,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15634976R"),7,63,63)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15634976R"),7,63,63)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72838987I"),1,78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72838987I"),1,78,78)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,85).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72838987I"),1,78,78)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42363589Q"),0,94).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42363589Q"),0,94,94)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94297989Q"),2,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94297989Q"),2,96,96)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,97).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42363589Q"),0,94,94)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72912347X"),2,103).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72912347X"),2,103,103)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17969261A"),3,109).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17969261A"),3,109,109)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17651429B"),6,111).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17651429B"),6,111,111)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("17651429B"),5,120).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17651429B"),5,111,120)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("17969261A"),0,125).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17969261A"),0,109,125)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("32759324Y")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77373669A"),2,128).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77373669A"),2,128,128)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,135).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17969261A"),0,109,125)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94297989Q"),2,96,96),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72912347X"),2,103,103),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77373669A"),2,128,128),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17651429B"),5,111,120) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("17651429B"),0,140).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17651429B"),0,111,140)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,144).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17651429B"),0,111,140)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("77373669A"),153).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77373669A"),2,128,128)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,154).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94297989Q"),2,96,96)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26875267Q"),6,157).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26875267Q"),6,157,157)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,164).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72912347X"),2,103,103)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91961834S"),0,168).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91961834S"),0,168,168)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91961834S"),0,168,168),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26875267Q"),6,157,157) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37117655R"),3,177).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37117655R"),3,177,177)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_74")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_75 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_75") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_75")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91778194C"),10,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778194C"),10,8,8)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778194C"),10,8,8)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87791751M"),9,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87791751M"),9,17,17)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("87791751M"),27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87791751M"),9,17,17)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49941258A"),5,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49941258A"),5,31,31)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49941258A"),5,31,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82832425R"),3,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82832425R"),3,47,47)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82832425R"),3,47,47) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82832425R"),3,47,47)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39995544W"),0,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39995544W"),0,54,54)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("39995544W"),7,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39995544W"),7,54,64)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39995544W"),7,54,64)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(28,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86417687C"),3,67).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86417687C"),3,67,67)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("86417687C"),75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86417687C"),3,67,67)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98689159G"),9,78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98689159G"),9,78,78)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("98689159G"),85).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98689159G"),9,78,78)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("59822683E")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91299792P"),9,94).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91299792P"),9,94,94)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91299792P"),9,94,94) }) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("91299792P")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91299792P"),9,94,94)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91299792P"),9,94,94)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44462879H"),7,107).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44462879H"),7,107,107)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59813272E"),9,115).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59813272E"),9,115,115)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44462879H"),7,107,107),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59813272E"),9,115,115) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,117).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44462879H"),7,107,107)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93819577N"),6,118).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93819577N"),6,118,118)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("93819577N"),10,128).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93819577N"),10,118,128)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("69785698K"),1,132).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69785698K"),1,132,132)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,141).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69785698K"),1,132,132)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59813272E"),9,115,115),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93819577N"),10,118,128) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77988945G"),1,150).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77988945G"),1,150,150)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91325917Y"),9,153).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91325917Y"),9,153,153)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,158).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77988945G"),1,150,150)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("59813272E"),164).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59813272E"),9,115,115)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("91325917Y"),166).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91325917Y"),9,153,153)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68393522X"),6,168).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68393522X"),6,168,168)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31466956V"),3,177).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31466956V"),3,177,177)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("31466956V")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31466956V"),3,177,177)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76588672L"),1,179).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76588672L"),1,179,179)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45515692O"),5,189).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45515692O"),5,189,189)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_75")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_76 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_76") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_76")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("29152367U"),0).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11618424G"),2,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11618424G"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84134295Z"),7,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84134295Z"),7,9,9)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11618424G"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84134295Z"),7,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34917426V"),8,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34917426V"),8,32,32)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,63,40).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34917426V"),8,32,32)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29958486A"),4,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29958486A"),4,54,54)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34596287F"),4,61).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34596287F"),4,61,61)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74858846Y"),2,68).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74858846Y"),2,68,68)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14576279E"),3,78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14576279E"),3,78,78)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("19281688I"),3,88).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81878314K"),3,94).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81878314K"),3,94,94)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74858846Y"),2,68,68)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("29958486A"),103).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29958486A"),4,54,54)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("65883177Z"),3,107).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65883177Z"),3,107,107)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("65883177Z"),2,111).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65883177Z"),2,107,111)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65883177Z"),2,107,111),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14576279E"),3,78,78),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81878314K"),3,94,94),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34596287F"),4,61,61) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76512836W"),7,115).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76512836W"),7,115,115)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81878314K"),2,117).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81878314K"),2,94,117)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14576279E"),10,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14576279E"),10,78,123)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81878314K"),5,126).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81878314K"),5,94,126)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37476276N"),9,127).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37476276N"),9,127,127)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77757164S"),10,130).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77757164S"),10,130,130)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("76512836W"),137).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76512836W"),7,115,115)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68482895D"),7,142).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68482895D"),7,142,142)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("65883177Z"),0,146).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65883177Z"),0,107,146)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65883177Z"),0,107,146),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34596287F"),4,61,61),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81878314K"),5,94,126),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68482895D"),7,142,142),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37476276N"),9,127,127),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14576279E"),10,78,123),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77757164S"),10,130,130) }) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("37476276N"),150).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37476276N"),9,127,127)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("65883177Z")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65883177Z"),0,107,146)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77757164S"),1,156).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77757164S"),1,130,156)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57936826L"),3,166).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57936826L"),3,166,166)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,170).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65883177Z"),0,107,146)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77757164S"),8,171).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77757164S"),8,130,171)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,179).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57936826L"),3,166,166)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("77757164S"),184).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77757164S"),8,130,171)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,192).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34596287F"),4,61,61)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,198).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81878314K"),5,94,126)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86492366B"),7,203).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86492366B"),7,203,203)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("86492366B")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86492366B"),7,203,203)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44476215Q"),4,204).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44476215Q"),4,204,204)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18722358R"),8,205).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18722358R"),8,205,205)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44476215Q"),6,209).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44476215Q"),6,204,209)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,211).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44476215Q"),6,204,209)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14899269D"),3,213).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14899269D"),3,213,213)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14576279E"),7,221).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14576279E"),7,78,221)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,222).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14899269D"),3,213,213)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_76")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_77 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_77") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_77")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36648299F"),9,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36648299F"),9,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22663761J"),4,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22663761J"),4,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89155652Z"),6,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89155652Z"),6,11,11)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22663761J"),4,9,9)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("89155652Z"),8,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89155652Z"),8,11,19)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89155652Z"),8,11,19)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36648299F"),9,4,4)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,59,35).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(47,3)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44618313F"),5,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44618313F"),5,36,36)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44618313F"),5,36,36) }) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("44618313F"),37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44618313F"),5,36,36)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("65312215L"),4,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65312215L"),4,47,47)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65312215L"),4,47,47)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("19554556H"),0,59).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,67).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,77).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("25857354P"),4,83).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96326426D"),5,91).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96326426D"),5,91,91)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54646874V"),5,100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54646874V"),5,100,100)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("54646874V"),101).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54646874V"),5,100,100)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32247629Y"),8,102).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32247629Y"),8,102,102)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71331696O"),5,105).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71331696O"),5,105,105)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("96326426D")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96326426D"),5,91,91)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88113465Q"),9,114).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),9,114,114)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(54,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35662829L"),9,120).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35662829L"),9,120,120)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83462825S"),5,121).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),5,121,121)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93712294Y"),2,130).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93712294Y"),2,130,130)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66763717H"),10,138).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66763717H"),10,138,138)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("83462825S"),7,143).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),7,121,143)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,149).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93712294Y"),2,130,130)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("66763717H"),2,154).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66763717H"),2,138,154)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("88113465Q")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),9,114,114)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66763717H"),2,138,154),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96326426D"),5,91,91),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71331696O"),5,105,105),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),7,121,143),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32247629Y"),8,102,102),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),9,114,114),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35662829L"),9,120,120) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,158).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66763717H"),2,138,154)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("88113465Q"),2,164).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),2,114,164)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71331696O"),165).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71331696O"),5,105,105)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),2,114,164),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96326426D"),5,91,91),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),7,121,143),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32247629Y"),8,102,102),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35662829L"),9,120,120) }) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),2,114,164),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96326426D"),5,91,91),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),7,121,143),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32247629Y"),8,102,102),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35662829L"),9,120,120) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32312858S"),10,173).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32312858S"),10,173,173)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61345157N"),1,180).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61345157N"),1,180,180)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35662829L"),2,190).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("83462825S"),2,192).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),2,121,192)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("61345157N"),1,202).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61345157N"),1,180,180)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("35662829L"),1,210).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35662829L"),1,120,210)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66844535R"),1,217).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66844535R"),1,217,217)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("66844535R"),3,221).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66844535R"),3,217,221)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("46293285W"),5,224).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46293285W"),5,224,224)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,74,234).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64796176R"),2,237).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64796176R"),2,237,237)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,238).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61345157N"),1,180,180)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,245).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35662829L"),1,120,210)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),2,114,164),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),2,121,192),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64796176R"),2,237,237),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66844535R"),3,217,221),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96326426D"),4,91,234),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46293285W"),5,224,224),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32247629Y"),7,102,234),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32312858S"),10,173,173) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21174558W"),4,248).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21174558W"),4,248,248)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32312858S"),2,258).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32312858S"),2,173,258)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67585688E"),7,261).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67585688E"),7,261,261)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("83462825S"),266).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83462825S"),2,121,192)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31619823C"),0,268).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31619823C"),0,268,268)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("66844535R"),277).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66844535R"),3,217,221)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32247629Y"),6,282).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32247629Y"),6,102,282)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,286).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31619823C"),0,268,268)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67942439R"),1,289).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67942439R"),1,289,289)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87545853M"),0,297).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87545853M"),0,297,297)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("88113465Q"),307).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88113465Q"),2,114,164)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,94,309).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("32312858S"),317).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32312858S"),2,173,258)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_77")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_78 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_78") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_78")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95434747T"),2,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95434747T"),2,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33889456P"),8,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33889456P"),8,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61943542C"),1,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61943542C"),1,14,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39696296Z"),10,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,18)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("33889456P"),22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33889456P"),8,4,4)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61943542C"),1,14,14),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95434747T"),2,2,2),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,18) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94817339Q"),8,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94817339Q"),8,27,27)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21182499K"),5,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21182499K"),5,33,33)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("94817339Q"),5,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94817339Q"),5,27,34)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("39696296Z"),2,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),2,18,35)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("21182499K"),44).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21182499K"),5,33,33)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("39696296Z"),7,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),7,18,48)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61943542C"),1,14,14)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("39696296Z"),10,60).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,60)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95434747T"),2,2,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94817339Q"),5,27,34)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78449464H"),7,77).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78449464H"),7,77,77)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86585855W"),4,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86585855W"),4,79,79)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58817395K"),3,84).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58817395K"),3,84,84)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58817395K"),3,84,84),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86585855W"),4,79,79),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78449464H"),7,77,77),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,60) }) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("78449464H"),87).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78449464H"),7,77,77)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,89).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58817395K"),3,84,84)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83936558R"),1,98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83936558R"),1,98,98)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("83936558R"),102).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83936558R"),1,98,98)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86585855W"),4,79,79),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,60) }) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86585855W"),4,79,79),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,60) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("12492973V"),4,109).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12492973V"),4,109,109)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77242121Y"),1,117).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77242121Y"),1,117,117)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77242121Y"),1,117,117),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86585855W"),4,79,79),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12492973V"),4,109,109),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,60) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31988831V"),10,121).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31988831V"),10,121,121)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,131).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77242121Y"),1,117,117)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,141).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86585855W"),4,79,79)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("31988831V"),151).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31988831V"),10,121,121)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,161).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12492973V"),4,109,109)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56936211L"),9,162).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56936211L"),9,162,162)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,172).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56936211L"),9,162,162)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("39696296Z")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,60)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,176).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39696296Z"),10,18,60)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("16363874R")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16381598Z"),10,178).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16381598Z"),10,178,178)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(444,9)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,188).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16381598Z"),10,178,178)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33892647S"),2,196).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33892647S"),2,196,196)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97543927V"),0,205).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97543927V"),0,205,205)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("97543927V"),0,208).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97543927V"),0,205,205)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58687737K"),5,214).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58687737K"),5,214,214)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,218).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97543927V"),0,205,205)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71115333Y"),0,225).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71115333Y"),0,225,225)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,234).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71115333Y"),0,225,225)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22185161Z"),10,242).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22185161Z"),10,242,242)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("33892647S"),2,243).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33892647S"),2,196,196)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72927696L"),8,252).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72927696L"),8,252,252)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,259).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33892647S"),2,196,196)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("22185161Z"),7,267).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22185161Z"),7,242,267)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35979686D"),3,269).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35979686D"),3,269,269)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16482548A"),3,271).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16482548A"),3,271,271)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,273).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35979686D"),3,269,269)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,276).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16482548A"),3,271,271)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24111644D"),6,280).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24111644D"),6,280,280)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19722357W"),9,288).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19722357W"),9,288,288)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16137173A"),8,292).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16137173A"),8,292,292)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("58687737K"),10,299).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58687737K"),10,214,299)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,306).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24111644D"),6,280,280)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("19722357W"),7,316).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19722357W"),7,288,316)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95168336R"),4,318).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95168336R"),4,318,318)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95337534T"),6,327).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95337534T"),6,327,327)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("95337534T"),8,331).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95337534T"),8,327,331)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82341676I"),1,339).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82341676I"),1,339,339)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82341676I"),1,339,339),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95168336R"),4,318,318),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22185161Z"),7,242,267),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19722357W"),7,288,316),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72927696L"),8,252,252),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16137173A"),8,292,292),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95337534T"),8,327,331),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58687737K"),10,214,299) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,341).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82341676I"),1,339,339)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("22185161Z"),10,342).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22185161Z"),10,242,342)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76894641W"),5,346).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76894641W"),5,346,346)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,356).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95168336R"),4,318,318)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,41,366).doCall().checkResult(null) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_78")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_urgencias_79 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_urgencias_79") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_urgencias_79")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("23714755Z"),5,5).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27479599T"),4,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27479599T"),4,15,15)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27479599T"),4,15,15) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22883866O"),1,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22883866O"),1,23,23)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("22883866O"),25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22883866O"),1,23,23)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64816617A"),4,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64816617A"),4,30,30)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27479599T"),4,15,15)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("64816617A"),4,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64816617A"),4,30,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96912849G"),2,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96912849G"),2,45,45)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76294322Z"),1,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76294322Z"),1,48,48)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("96912849G"),54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96912849G"),2,45,45)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("76294322Z"),59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76294322Z"),1,48,48)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64816617A"),4,30,30) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17833831A"),7,60).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17833831A"),7,60,60)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("17833831A"),62).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17833831A"),7,60,60)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64816617A"),4,30,30) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81295625H"),4,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81295625H"),4,64,64)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64816617A"),4,30,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47631515X"),0,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47631515X"),0,74,74)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32983556D"),6,84).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32983556D"),6,84,84)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91773586U"),9,87).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91773586U"),9,87,87)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47631515X"),0,74,74),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81295625H"),4,64,64),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32983556D"),6,84,84),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91773586U"),9,87,87) }) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32983556D"),5,89).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32983556D"),5,84,89)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81295625H"),4,99).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81295625H"),4,64,64)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,101).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47631515X"),0,74,74)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47976961U"),4,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47976961U"),4,108,108)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14841546A"),2,110).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14841546A"),2,110,110)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,28,116).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32983556D"),10,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32983556D"),10,84,123)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,125).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14841546A"),2,110,110)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45531151T"),5,126).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45531151T"),5,126,126)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,133).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81295625H"),3,64,116)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,14,134).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,142).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47976961U"),3,108,134)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17963615V"),3,150).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17963615V"),3,150,150)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93865177Y"),9,156).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93865177Y"),9,156,156)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91773586U"),6,165).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91773586U"),6,87,165)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18588443B"),10,167).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18588443B"),10,167,167)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91773586U"),10,176).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91773586U"),10,87,176)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,184).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17963615V"),3,150,150)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("18588443B"),1,185).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18588443B"),1,167,185)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,186).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18588443B"),1,167,185)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("32983556D"),187).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32983556D"),10,84,123)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(255,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84178585E"),5,192).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84178585E"),5,192,192)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,200).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45531151T"),5,126,126)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84178585E"),5,192,192),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93865177Y"),9,156,156),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91773586U"),10,87,176) }) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("91773586U"),201).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91773586U"),10,87,176)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14386377W"),7,211).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14386377W"),7,211,211)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26459948Z"),5,213).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26459948Z"),5,213,213)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14386377W"),9,214).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14386377W"),9,211,214)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("84178585E"),10,224).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84178585E"),10,192,224)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,231).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26459948Z"),5,213,213)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,232).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93865177Y"),9,156,156)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14386377W"),2,236).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14386377W"),2,211,236)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,243).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14386377W"),2,211,236)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92988179U"),10,253).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92988179U"),10,253,253)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38518873J"),3,256).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38518873J"),3,256,256)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,263).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38518873J"),3,256,256)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("84178585E"),0,273).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84178585E"),0,192,273)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84178585E"),0,192,273),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92988179U"),10,253,253) }) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84178585E"),0,192,273),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92988179U"),10,253,253) }) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("84178585E"),278).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84178585E"),0,192,273)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94282878H"),3,285).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94282878H"),3,285,285)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("94282878H"),292).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94282878H"),3,285,285)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("92988179U"),5,296).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92988179U"),5,253,296)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("92988179U"),303).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92988179U"),5,253,296)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("33978382K"),304).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33815394W"),9,308).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33815394W"),9,308,308)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("65586811V"),7,314).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65586811V"),7,314,314)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,324).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("65586811V"),7,314,314)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33815394W"),9,308,308) }) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86988263G"),10,332).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86988263G"),10,332,332)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("86988263G"),340).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86988263G"),10,332,332)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("33815394W"),8,345).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33815394W"),8,308,345)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("33815394W"),349).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33815394W"),8,308,345)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55462586Q"),4,352).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55462586Q"),4,352,352)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,73,359).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(472,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28996581P"),8,360).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28996581P"),8,360,360)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("55462586Q"),362).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55462586Q"),4,352,352)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85355784O"),1,369).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85355784O"),1,369,369)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,375).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85355784O"),1,369,369)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,66,377).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14715817R"),8,380).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14715817R"),8,380,380)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28996581P"),8,360,360),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14715817R"),8,380,380) }) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,382).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28996581P"),8,360,360)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38965993N"),7,385).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38965993N"),7,385,385)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,392).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38965993N"),7,385,385)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32583118T"),9,394).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32583118T"),9,394,394)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,400).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14715817R"),8,380,380)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32583118T"),10,401).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32583118T"),10,394,401)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22216893I"),8,407).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22216893I"),8,407,407)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,415).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22216893I"),8,407,407)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29565373W"),5,422).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29565373W"),5,422,422)) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_urgencias_79")) ;
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab6";
}





static class UrgenciasPaciente {
  String DNI;
  int prioridad;
  int tiempoAdmision;
  int tiempoAdmisionEnPrioridad;

  public UrgenciasPaciente(String DNI, int prioridad, int tiempoAdmision, int tiempoAdmisionEnPrioridad) {
    this.DNI = DNI;
    this.prioridad = prioridad;
    this.tiempoAdmision = tiempoAdmision;
    this.tiempoAdmisionEnPrioridad = tiempoAdmisionEnPrioridad;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Paciente) {
      Paciente paciente = (Paciente) obj;
      return DNI.equals(paciente.getDNI())
	&& prioridad == paciente.getPrioridad()
	&& tiempoAdmision == paciente.getTiempoAdmision()
	&& tiempoAdmisionEnPrioridad == paciente.getTiempoAdmisionEnPrioridad();
    } else return false;
  }

  @Override
  public int hashCode() {
    return DNI.hashCode();
  }

  @Override
  public String toString() {
     return "<\""+DNI.toString()+"\","+prioridad+","+tiempoAdmision+","+tiempoAdmisionEnPrioridad+">";
  }
}

static class UrgenciasUtils2022 {
  static HashMap<Object,String> urgenciasNames = null;

  public static void resetPrinter() {
    urgenciasNames = null;
  }

  public static String printer(Object obj) {
    if (obj instanceof Urgencias) {
      if (urgenciasNames == null)
        urgenciasNames = new HashMap<Object,String>();
      String name = urgenciasNames.get(obj);
      if (name == null) {
        name = "urgencias";
        urgenciasNames.put(obj,name);
      }
      return name;
    } else return TestUtils.printer(obj, x -> printer(x));
  }
}




























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";

    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
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
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(" -- the exception "+exc+" was raised although it "+
			     "should not have been\n"+msg);
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
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
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
        TestData.message("\n"+callSeqString(traceLength,time));
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
      switch(time) {
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

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
				     TestResult<E,F> result,
				     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
	("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2)) 
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }
  
  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();
    
    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
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
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
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

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterator with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }
  
  static <E,F> boolean iterableCorrect(String callString, F[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect
    (TestCall<Iterable<E>,PositionList<F>> call,
     TestResult<Iterable<E>,PositionList<F>> result,
     Iterable<F> expected) {
    java.util.Iterator<E> it = null;
    java.util.Iterator<F> exp = expected.iterator();

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
				return false;
      }
      else return iterableCorrect(call.toString(), expected, result.getValue());
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }
  
  static <E,F> boolean iterableCorrect(String callString, Iterable<F> original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    PositionList<F> e = extractElementsFromIterable(callString, original);
    if (l == null) return false;

    boolean correct = (e.size() == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      Position<F> cursorE = e.first();
      for (int j=0; j<e.size(); j++) {
        if (cursorE.element() == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && cursorE.element().equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
				cursorE = e.next(cursorE);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(e));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+TestUtils.print(original)+
	     "; it has now the elements "+TestUtils.print(l));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+TestUtils.print(original)+
	       "; it has now the elements "+TestUtils.print(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
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
  public static <T> T[] toGenericArray(T ... elems) {
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

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
	"*** ERROR: aedlib is too old. Minimum version needed is "+
	major+"."+minor+"."+patchlevel+"; your version is "+
	aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true; 	      
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
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
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
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
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
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
      else
	{
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
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

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
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
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] original, int[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] original, char[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
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
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }
    
    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe call to "+this+" returned null, "+
	   "but should have returned "+TestUtils.print(expected));
	return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
	 "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
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
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}


static class InformacionEspera extends TestCall<es.upm.aedlib.Pair<Integer,Integer>,Object>
{
  Urgencias x_1;
  
  public InformacionEspera (Urgencias x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".informacionEspera")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.Pair<Integer,Integer> call () throws PacienteNoExisteException
  {
    return x_1.informacionEspera() ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Constructor extends TestCall<Urgencias,Void>
{
  
  public Constructor ()
  {
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new Urgencias")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Urgencias call () 
  {
    return new UrgenciasAED() ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class CambiarPrioridad extends TestCall<Paciente,Object>
{
  Urgencias x_1;
  String x_2;
  Integer x_3;
  Integer x_4;
  
  public CambiarPrioridad (Urgencias x_1,String x_2,Integer x_3,Integer x_4)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".cambiarPrioridad")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_4)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws PacienteNoExisteException
  {
    return x_1.cambiarPrioridad(x_2,x_3,x_4) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class AumentaPrioridad extends TestCall<Void,Throwable>
{
  Urgencias x_1;
  Integer x_2;
  Integer x_3;
  
  public AumentaPrioridad (Urgencias x_1,Integer x_2,Integer x_3)
  {
    voidReturn = true ;
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".aumentaPrioridad")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () throws PacienteNoExisteException
  {
    x_1.aumentaPrioridad(x_2,x_3) ;
    return null ;
  }
  
  public boolean checkResult (Throwable expected) 
  {
    if (expected != null)
    {
      if (!throwsException(expected.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class AdmitirPaciente extends TestCall<Paciente,Object>
{
  Urgencias x_1;
  String x_2;
  Integer x_3;
  Integer x_4;
  
  public AdmitirPaciente (Urgencias x_1,String x_2,Integer x_3,Integer x_4)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".admitirPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_4)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws PacienteExisteException
  {
    return x_1.admitirPaciente(x_2,x_3,x_4) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class SalirPaciente extends TestCall<Paciente,Object>
{
  Urgencias x_1;
  String x_2;
  Integer x_3;
  
  public SalirPaciente (Urgencias x_1,String x_2,Integer x_3)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".salirPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws PacienteNoExisteException
  {
    return x_1.salirPaciente(x_2,x_3) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class GetPaciente extends TestCall<Paciente,aed.urgencias.TesterLab6.UrgenciasPaciente>
{
  Urgencias x_1;
  String x_2;
  
  public GetPaciente (Urgencias x_1,String x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".getPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () 
  {
    return x_1.getPaciente(x_2) ;
  }
  
  public boolean checkResult (aed.urgencias.TesterLab6.UrgenciasPaciente expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class AtenderPaciente extends TestCall<Paciente,aed.urgencias.TesterLab6.UrgenciasPaciente>
{
  Urgencias x_1;
  Integer x_2;
  
  public AtenderPaciente (Urgencias x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".atenderPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () 
  {
    return x_1.atenderPaciente(x_2) ;
  }
  
  public boolean checkResult (aed.urgencias.TesterLab6.UrgenciasPaciente expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class PacientesEsperando extends TestCall<Iterable<Paciente>,aed.urgencias.TesterLab6.UrgenciasPaciente[]>
{
  Urgencias x_1;
  
  public PacientesEsperando (Urgencias x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".pacientesEsperando")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Iterable<Paciente> call () 
  {
    return x_1.pacientesEsperando() ;
  }
  
  public boolean checkResult (aed.urgencias.TesterLab6.UrgenciasPaciente[] expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.iterableCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;

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

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
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

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
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
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    if (results_sofar == null) 
      results_sofar = new LinkedHashMap<String,Boolean>();
    if (runningTests == null)
      runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
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
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests "+runningTests+" are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath) 
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);
 
    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) 
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }
 
    return sb.toString();
  }
  
}


static class TesterCode
{
  
  public static void resetPrinter () 
  {
    UrgenciasUtils2022.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return UrgenciasUtils2022.printer(obj) ;
  }
  
}


}
