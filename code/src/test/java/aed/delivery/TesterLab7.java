
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
// File generated at: 2023/12/9 -- 11:54:9
// Seed: {1702,119246,697062}
//
//////////////////////////////////////////////////////////////////////



package aed.delivery;

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
@SuppressWarnings({"unused","deprecation"})
public class TesterLab7 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(53,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,11,1) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_withTour_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_01")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Valdilecha"),new String("Majadahonda") },new Integer[][] { { null,null }, { 71,null } }).doCall() ;
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
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_02")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Pozuelo del Rey"),new String("Estremera"),new String("Madrid"),new String("Gascones") },new Integer[][] { { null,11,null,null }, { null,null,null,19 }, { null,null,null,null }, { null,null,89,null } }).doCall() ;
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
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_03")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Reduena"),new String("Horcajo de la Sierra-Aoslos"),new String("Torrelaguna"),new String("Gascones") },new Integer[][] { { null,null,56,15 }, { null,null,74,4 }, { 4,null,null,98 }, { null,null,null,null } }).doCall() ;
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
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_04")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Las Rozas de Madrid"),new String("Boadilla del Monte"),new String("Torremocha de Jarama"),new String("Cervera de Buitrago"),new String("Bustarviejo"),new String("Villarejo de Salvanes"),new String("Zarzalejo") },new Integer[][] { { null,41,null,null,null,null,59 }, { 41,null,null,64,92,null,null }, { null,null,null,54,null,null,12 }, { null,64,54,null,null,null,null }, { null,92,null,null,null,14,null }, { null,null,null,null,14,null,null }, { 59,null,12,null,null,null,null } }).doCall() ;
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
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_05")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Aldea del Fresno"),new String("Cabanillas de la Sierra"),new String("Zarzalejo"),new String("Pozuelo de Alarcon"),new String("Serranillos del Valle"),new String("Valdeolmos-Alalpardo") },new Integer[][] { { null,60,45,null,null,null }, { 91,null,51,50,null,null }, { null,69,null,null,null,null }, { 42,84,22,null,null,null }, { 6,63,58,null,null,null }, { 8,19,58,null,14,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Aldea del Fresno"),new String("Cabanillas de la Sierra"),new String("Zarzalejo"),new String("Pozuelo de Alarcon"),new String("Serranillos del Valle"),new String("Valdeolmos-Alalpardo") },new Integer[][] { { null,60,45,null,null,null }, { 91,null,51,50,null,null }, { null,69,null,null,null,null }, { 42,84,22,null,null,null }, { 6,63,58,null,null,null }, { 8,19,58,null,14,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_06")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Miraflores de la Sierra"),new String("Brunete"),new String("Fuenlabrada"),new String("Torrejon de Ardoz"),new String("Fresno de Torote"),new String("Boadilla del Monte"),new String("Los Molinos") },new Integer[][] { { null,87,76,80,60,null,null }, { 41,null,77,null,null,null,18 }, { 1,26,null,null,3,null,null }, { 73,79,56,null,null,null,null }, { 44,10,null,null,null,null,null }, { 15,null,null,null,null,null,null }, { 66,70,42,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Miraflores de la Sierra"),new String("Brunete"),new String("Fuenlabrada"),new String("Torrejon de Ardoz"),new String("Fresno de Torote"),new String("Boadilla del Monte"),new String("Los Molinos") },new Integer[][] { { null,87,76,80,60,null,null }, { 41,null,77,null,null,null,18 }, { 1,26,null,null,3,null,null }, { 73,79,56,null,null,null,null }, { 44,10,null,null,null,null,null }, { 15,null,null,null,null,null,null }, { 66,70,42,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_07")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Becerril de la Sierra"),new String("Rivas-Vaciamadrid") },new Integer[][] { { null,null }, { 88,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Becerril de la Sierra"),new String("Rivas-Vaciamadrid") },new Integer[][] { { null,null }, { 88,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Becerril de la Sierra"),new String("Rivas-Vaciamadrid") },new Integer[][] { { null,null }, { 88,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_08")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Torres de la Alameda"),new String("Navacerrada"),new String("Valdeavero"),new String("Torrelaguna"),new String("Chapineria"),new String("Ajalvir"),new String("Rozas de Puerto Real") },new Integer[][] { { null,55,null,null,24,null,null }, { 78,null,null,null,null,null,null }, { 1,null,null,null,26,92,null }, { 43,88,null,null,null,null,75 }, { null,null,null,10,null,null,null }, { null,1,null,null,null,null,null }, { null,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Torres de la Alameda"),new String("Navacerrada"),new String("Valdeavero"),new String("Torrelaguna"),new String("Chapineria"),new String("Ajalvir"),new String("Rozas de Puerto Real") },new Integer[][] { { null,55,null,null,24,null,null }, { 78,null,null,null,null,null,null }, { 1,null,null,null,26,92,null }, { 43,88,null,null,null,null,75 }, { null,null,null,10,null,null,null }, { null,1,null,null,null,null,null }, { null,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Torres de la Alameda"),new String("Navacerrada"),new String("Valdeavero"),new String("Torrelaguna"),new String("Chapineria"),new String("Ajalvir"),new String("Rozas de Puerto Real") },new Integer[][] { { null,55,null,null,24,null,null }, { 78,null,null,null,null,null,null }, { 1,null,null,null,26,92,null }, { 43,88,null,null,null,null,75 }, { null,null,null,10,null,null,null }, { null,1,null,null,null,null,null }, { null,null,null,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_09")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Alcala de Henares"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null }, { 23,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Alcala de Henares"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null }, { 23,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Alcala de Henares"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null }, { 23,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Alcala de Henares"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null }, { 23,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_10")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Pelayos de la Presa"),new String("Cenicientos") },new Integer[][] { { null,37 }, { 37,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Pelayos de la Presa"),new String("Cenicientos") },new Integer[][] { { null,37 }, { 37,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Pelayos de la Presa"),new String("Cenicientos") },new Integer[][] { { null,37 }, { 37,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Pelayos de la Presa"),new String("Cenicientos") },new Integer[][] { { null,37 }, { 37,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_11")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Puebla de la Sierra"),new String("Somosierra") },new Integer[][] { { null,100 }, { null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Puebla de la Sierra"),new String("Somosierra") },new Integer[][] { { null,100 }, { null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Puebla de la Sierra"),new String("Somosierra") },new Integer[][] { { null,100 }, { null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Puebla de la Sierra"),new String("Somosierra") },new Integer[][] { { null,100 }, { null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_12")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Serranillos del Valle"),new String("Cervera de Buitrago"),new String("Galapagar") },new Integer[][] { { null,null,74 }, { 19,null,37 }, { null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Serranillos del Valle"),new String("Cervera de Buitrago"),new String("Galapagar") },new Integer[][] { { null,null,74 }, { 19,null,37 }, { null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Serranillos del Valle"),new String("Cervera de Buitrago"),new String("Galapagar") },new Integer[][] { { null,null,74 }, { 19,null,37 }, { null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Serranillos del Valle"),new String("Cervera de Buitrago"),new String("Galapagar") },new Integer[][] { { null,null,74 }, { 19,null,37 }, { null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_13")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Torrejon de la Calzada"),new String("Pinuecar-Gandullas"),new String("Los Santos de la Humosa") },new Integer[][] { { null,null,null }, { 30,null,null }, { 9,72,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Torrejon de la Calzada"),new String("Pinuecar-Gandullas"),new String("Los Santos de la Humosa") },new Integer[][] { { null,null,null }, { 30,null,null }, { 9,72,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Torrejon de la Calzada"),new String("Pinuecar-Gandullas"),new String("Los Santos de la Humosa") },new Integer[][] { { null,null,null }, { 30,null,null }, { 9,72,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Torrejon de la Calzada"),new String("Pinuecar-Gandullas"),new String("Los Santos de la Humosa") },new Integer[][] { { null,null,null }, { 30,null,null }, { 9,72,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_14")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Valdelaguna"),new String("Bustarviejo"),new String("Parla") },new Integer[][] { { null,null,11 }, { null,null,92 }, { 11,92,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdelaguna"),new String("Bustarviejo"),new String("Parla") },new Integer[][] { { null,null,11 }, { null,null,92 }, { 11,92,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdelaguna"),new String("Bustarviejo"),new String("Parla") },new Integer[][] { { null,null,11 }, { null,null,92 }, { 11,92,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdelaguna"),new String("Bustarviejo"),new String("Parla") },new Integer[][] { { null,null,11 }, { null,null,92 }, { 11,92,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_15")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Camarma de Esteruelas"),new String("Getafe"),new String("Algete"),new String("Aldea del Fresno") },new Integer[][] { { null,null,null,47 }, { null,null,49,null }, { 40,null,null,65 }, { null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Camarma de Esteruelas"),new String("Getafe"),new String("Algete"),new String("Aldea del Fresno") },new Integer[][] { { null,null,null,47 }, { null,null,49,null }, { 40,null,null,65 }, { null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Camarma de Esteruelas"),new String("Getafe"),new String("Algete"),new String("Aldea del Fresno") },new Integer[][] { { null,null,null,47 }, { null,null,49,null }, { 40,null,null,65 }, { null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Camarma de Esteruelas"),new String("Getafe"),new String("Algete"),new String("Aldea del Fresno") },new Integer[][] { { null,null,null,47 }, { null,null,49,null }, { 40,null,null,65 }, { null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_16")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Madrid"),new String("Valdelaguna"),new String("La Hiruela"),new String("Sevilla la Nueva") },new Integer[][] { { null,null,null,25 }, { null,null,11,null }, { null,11,null,7 }, { 25,null,7,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Madrid"),new String("Valdelaguna"),new String("La Hiruela"),new String("Sevilla la Nueva") },new Integer[][] { { null,null,null,25 }, { null,null,11,null }, { null,11,null,7 }, { 25,null,7,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Madrid"),new String("Valdelaguna"),new String("La Hiruela"),new String("Sevilla la Nueva") },new Integer[][] { { null,null,null,25 }, { null,null,11,null }, { null,11,null,7 }, { 25,null,7,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Madrid"),new String("Valdelaguna"),new String("La Hiruela"),new String("Sevilla la Nueva") },new Integer[][] { { null,null,null,25 }, { null,null,11,null }, { null,11,null,7 }, { 25,null,7,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_17")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Pinuecar-Gandullas"),new String("Valdemanco"),new String("Valdeavero"),new String("Coslada") },new Integer[][] { { null,32,13,null }, { 14,null,34,null }, { 75,null,null,null }, { 34,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Pinuecar-Gandullas"),new String("Valdemanco"),new String("Valdeavero"),new String("Coslada") },new Integer[][] { { null,32,13,null }, { 14,null,34,null }, { 75,null,null,null }, { 34,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Pinuecar-Gandullas"),new String("Valdemanco"),new String("Valdeavero"),new String("Coslada") },new Integer[][] { { null,32,13,null }, { 14,null,34,null }, { 75,null,null,null }, { 34,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Pinuecar-Gandullas"),new String("Valdemanco"),new String("Valdeavero"),new String("Coslada") },new Integer[][] { { null,32,13,null }, { 14,null,34,null }, { 75,null,null,null }, { 34,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_18")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Arganda del Rey"),new String("Chapineria"),new String("Gascones"),new String("Tielmes"),new String("Montejo de la Sierra") },new Integer[][] { { null,null,2,null,null }, { 89,null,66,null,null }, { 89,null,null,3,null }, { 21,35,null,null,null }, { 72,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Arganda del Rey"),new String("Chapineria"),new String("Gascones"),new String("Tielmes"),new String("Montejo de la Sierra") },new Integer[][] { { null,null,2,null,null }, { 89,null,66,null,null }, { 89,null,null,3,null }, { 21,35,null,null,null }, { 72,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Arganda del Rey"),new String("Chapineria"),new String("Gascones"),new String("Tielmes"),new String("Montejo de la Sierra") },new Integer[][] { { null,null,2,null,null }, { 89,null,66,null,null }, { 89,null,null,3,null }, { 21,35,null,null,null }, { 72,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Arganda del Rey"),new String("Chapineria"),new String("Gascones"),new String("Tielmes"),new String("Montejo de la Sierra") },new Integer[][] { { null,null,2,null,null }, { 89,null,66,null,null }, { 89,null,null,3,null }, { 21,35,null,null,null }, { 72,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_19")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("El Boalo"),new String("Madarcos"),new String("Chinchon"),new String("Collado Mediano"),new String("San Fernando de Henares") },new Integer[][] { { null,null,null,null,null }, { 70,null,25,null,null }, { 28,80,null,null,4 }, { 4,4,null,null,null }, { 69,null,90,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("El Boalo"),new String("Madarcos"),new String("Chinchon"),new String("Collado Mediano"),new String("San Fernando de Henares") },new Integer[][] { { null,null,null,null,null }, { 70,null,25,null,null }, { 28,80,null,null,4 }, { 4,4,null,null,null }, { 69,null,90,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("El Boalo"),new String("Madarcos"),new String("Chinchon"),new String("Collado Mediano"),new String("San Fernando de Henares") },new Integer[][] { { null,null,null,null,null }, { 70,null,25,null,null }, { 28,80,null,null,4 }, { 4,4,null,null,null }, { 69,null,90,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("El Boalo"),new String("Madarcos"),new String("Chinchon"),new String("Collado Mediano"),new String("San Fernando de Henares") },new Integer[][] { { null,null,null,null,null }, { 70,null,25,null,null }, { 28,80,null,null,4 }, { 4,4,null,null,null }, { 69,null,90,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_20")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("San Martin de la Vega"),new String("Puebla de la Sierra"),new String("Talamanca de Jarama"),new String("Villanueva de la Canada"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null,77,null,56 }, { null,null,91,null,null }, { null,null,null,36,null }, { 55,89,81,null,null }, { null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("San Martin de la Vega"),new String("Puebla de la Sierra"),new String("Talamanca de Jarama"),new String("Villanueva de la Canada"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null,77,null,56 }, { null,null,91,null,null }, { null,null,null,36,null }, { 55,89,81,null,null }, { null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("San Martin de la Vega"),new String("Puebla de la Sierra"),new String("Talamanca de Jarama"),new String("Villanueva de la Canada"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null,77,null,56 }, { null,null,91,null,null }, { null,null,null,36,null }, { 55,89,81,null,null }, { null,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("San Martin de la Vega"),new String("Puebla de la Sierra"),new String("Talamanca de Jarama"),new String("Villanueva de la Canada"),new String("Rozas de Puerto Real") },new Integer[][] { { null,null,77,null,56 }, { null,null,91,null,null }, { null,null,null,36,null }, { 55,89,81,null,null }, { null,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_21")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Alcorcon"),new String("Somosierra"),new String("Carabana"),new String("Robregordo"),new String("Bustarviejo"),new String("Pozuelo del Rey") },new Integer[][] { { null,64,74,null,null,null }, { 28,null,11,34,null,null }, { 84,35,null,null,null,null }, { null,55,null,null,80,null }, { 97,68,91,null,null,null }, { 69,83,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Alcorcon"),new String("Somosierra"),new String("Carabana"),new String("Robregordo"),new String("Bustarviejo"),new String("Pozuelo del Rey") },new Integer[][] { { null,64,74,null,null,null }, { 28,null,11,34,null,null }, { 84,35,null,null,null,null }, { null,55,null,null,80,null }, { 97,68,91,null,null,null }, { 69,83,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Alcorcon"),new String("Somosierra"),new String("Carabana"),new String("Robregordo"),new String("Bustarviejo"),new String("Pozuelo del Rey") },new Integer[][] { { null,64,74,null,null,null }, { 28,null,11,34,null,null }, { 84,35,null,null,null,null }, { null,55,null,null,80,null }, { 97,68,91,null,null,null }, { 69,83,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Alcorcon"),new String("Somosierra"),new String("Carabana"),new String("Robregordo"),new String("Bustarviejo"),new String("Pozuelo del Rey") },new Integer[][] { { null,64,74,null,null,null }, { 28,null,11,34,null,null }, { 84,35,null,null,null,null }, { null,55,null,null,80,null }, { 97,68,91,null,null,null }, { 69,83,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_22")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Cubas de la Sagra"),new String("Valdemoro"),new String("Canencia"),new String("Parla"),new String("Soto del Real"),new String("El Vellon") },new Integer[][] { { null,65,null,null,29,null }, { 96,null,null,29,null,null }, { null,null,null,null,99,null }, { 32,null,52,null,null,null }, { null,28,78,null,null,null }, { 12,null,null,41,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Cubas de la Sagra"),new String("Valdemoro"),new String("Canencia"),new String("Parla"),new String("Soto del Real"),new String("El Vellon") },new Integer[][] { { null,65,null,null,29,null }, { 96,null,null,29,null,null }, { null,null,null,null,99,null }, { 32,null,52,null,null,null }, { null,28,78,null,null,null }, { 12,null,null,41,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Cubas de la Sagra"),new String("Valdemoro"),new String("Canencia"),new String("Parla"),new String("Soto del Real"),new String("El Vellon") },new Integer[][] { { null,65,null,null,29,null }, { 96,null,null,29,null,null }, { null,null,null,null,99,null }, { 32,null,52,null,null,null }, { null,28,78,null,null,null }, { 12,null,null,41,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Cubas de la Sagra"),new String("Valdemoro"),new String("Canencia"),new String("Parla"),new String("Soto del Real"),new String("El Vellon") },new Integer[][] { { null,65,null,null,29,null }, { 96,null,null,29,null,null }, { null,null,null,null,99,null }, { 32,null,52,null,null,null }, { null,28,78,null,null,null }, { 12,null,null,41,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_23")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Manzanares el Real"),new String("Valdilecha"),new String("Guadalix de la Sierra"),new String("Campo Real"),new String("Torremocha de Jarama"),new String("Pozuelo de Alarcon") },new Integer[][] { { null,null,null,null,null,null }, { null,null,null,null,27,null }, { 30,null,null,91,null,null }, { 20,73,null,null,null,null }, { 46,63,51,null,null,null }, { 63,42,78,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Manzanares el Real"),new String("Valdilecha"),new String("Guadalix de la Sierra"),new String("Campo Real"),new String("Torremocha de Jarama"),new String("Pozuelo de Alarcon") },new Integer[][] { { null,null,null,null,null,null }, { null,null,null,null,27,null }, { 30,null,null,91,null,null }, { 20,73,null,null,null,null }, { 46,63,51,null,null,null }, { 63,42,78,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Manzanares el Real"),new String("Valdilecha"),new String("Guadalix de la Sierra"),new String("Campo Real"),new String("Torremocha de Jarama"),new String("Pozuelo de Alarcon") },new Integer[][] { { null,null,null,null,null,null }, { null,null,null,null,27,null }, { 30,null,null,91,null,null }, { 20,73,null,null,null,null }, { 46,63,51,null,null,null }, { 63,42,78,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Manzanares el Real"),new String("Valdilecha"),new String("Guadalix de la Sierra"),new String("Campo Real"),new String("Torremocha de Jarama"),new String("Pozuelo de Alarcon") },new Integer[][] { { null,null,null,null,null,null }, { null,null,null,null,27,null }, { 30,null,null,91,null,null }, { 20,73,null,null,null,null }, { 46,63,51,null,null,null }, { 63,42,78,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_24")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Valdemanco"),new String("Campo Real"),new String("Fuente el Saz de Jarama"),new String("Villamantilla"),new String("Villamanrique de Tajo"),new String("Ambite") },new Integer[][] { { null,81,null,30,47,null }, { 84,null,null,24,null,null }, { 60,55,null,99,null,null }, { 67,82,46,null,null,null }, { 84,null,null,58,null,null }, { 7,null,65,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdemanco"),new String("Campo Real"),new String("Fuente el Saz de Jarama"),new String("Villamantilla"),new String("Villamanrique de Tajo"),new String("Ambite") },new Integer[][] { { null,81,null,30,47,null }, { 84,null,null,24,null,null }, { 60,55,null,99,null,null }, { 67,82,46,null,null,null }, { 84,null,null,58,null,null }, { 7,null,65,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdemanco"),new String("Campo Real"),new String("Fuente el Saz de Jarama"),new String("Villamantilla"),new String("Villamanrique de Tajo"),new String("Ambite") },new Integer[][] { { null,81,null,30,47,null }, { 84,null,null,24,null,null }, { 60,55,null,99,null,null }, { 67,82,46,null,null,null }, { 84,null,null,58,null,null }, { 7,null,65,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdemanco"),new String("Campo Real"),new String("Fuente el Saz de Jarama"),new String("Villamantilla"),new String("Villamanrique de Tajo"),new String("Ambite") },new Integer[][] { { null,81,null,30,47,null }, { 84,null,null,24,null,null }, { 60,55,null,99,null,null }, { 67,82,46,null,null,null }, { 84,null,null,58,null,null }, { 7,null,65,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_25")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Fuentiduena de Tajo"),new String("Alcorcon"),new String("Villanueva de la Canada"),new String("Zarzalejo"),new String("Somosierra"),new String("Alpedrete"),new String("Navas del Rey"),new String("Aldea del Fresno") },new Integer[][] { { null,41,null,84,null,null,null,86 }, { 53,null,null,25,null,77,null,null }, { 93,87,null,null,63,null,null,null }, { 85,16,null,null,null,49,null,null }, { 42,null,null,null,null,null,null,null }, { 98,null,null,null,null,null,null,null }, { 61,63,8,null,null,null,null,33 }, { 25,9,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Fuentiduena de Tajo"),new String("Alcorcon"),new String("Villanueva de la Canada"),new String("Zarzalejo"),new String("Somosierra"),new String("Alpedrete"),new String("Navas del Rey"),new String("Aldea del Fresno") },new Integer[][] { { null,41,null,84,null,null,null,86 }, { 53,null,null,25,null,77,null,null }, { 93,87,null,null,63,null,null,null }, { 85,16,null,null,null,49,null,null }, { 42,null,null,null,null,null,null,null }, { 98,null,null,null,null,null,null,null }, { 61,63,8,null,null,null,null,33 }, { 25,9,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Fuentiduena de Tajo"),new String("Alcorcon"),new String("Villanueva de la Canada"),new String("Zarzalejo"),new String("Somosierra"),new String("Alpedrete"),new String("Navas del Rey"),new String("Aldea del Fresno") },new Integer[][] { { null,41,null,84,null,null,null,86 }, { 53,null,null,25,null,77,null,null }, { 93,87,null,null,63,null,null,null }, { 85,16,null,null,null,49,null,null }, { 42,null,null,null,null,null,null,null }, { 98,null,null,null,null,null,null,null }, { 61,63,8,null,null,null,null,33 }, { 25,9,null,null,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Fuentiduena de Tajo"),new String("Alcorcon"),new String("Villanueva de la Canada"),new String("Zarzalejo"),new String("Somosierra"),new String("Alpedrete"),new String("Navas del Rey"),new String("Aldea del Fresno") },new Integer[][] { { null,41,null,84,null,null,null,86 }, { 53,null,null,25,null,77,null,null }, { 93,87,null,null,63,null,null,null }, { 85,16,null,null,null,49,null,null }, { 42,null,null,null,null,null,null,null }, { 98,null,null,null,null,null,null,null }, { 61,63,8,null,null,null,null,33 }, { 25,9,null,null,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_26")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Tielmes"),new String("Villamantilla"),new String("Brea de Tajo"),new String("Santorcaz"),new String("Madrid"),new String("Valdetorres de Jarama"),new String("Pozuelo de Alarcon"),new String("Robledillo de la Jara") },new Integer[][] { { null,null,null,13,null,23,null,null }, { 11,null,null,null,null,95,null,44 }, { 54,11,null,74,null,null,35,null }, { 70,34,null,null,91,93,49,null }, { 37,4,null,null,null,null,null,null }, { 29,null,null,null,null,null,null,25 }, { 1,null,null,null,null,null,null,null }, { null,20,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Tielmes"),new String("Villamantilla"),new String("Brea de Tajo"),new String("Santorcaz"),new String("Madrid"),new String("Valdetorres de Jarama"),new String("Pozuelo de Alarcon"),new String("Robledillo de la Jara") },new Integer[][] { { null,null,null,13,null,23,null,null }, { 11,null,null,null,null,95,null,44 }, { 54,11,null,74,null,null,35,null }, { 70,34,null,null,91,93,49,null }, { 37,4,null,null,null,null,null,null }, { 29,null,null,null,null,null,null,25 }, { 1,null,null,null,null,null,null,null }, { null,20,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Tielmes"),new String("Villamantilla"),new String("Brea de Tajo"),new String("Santorcaz"),new String("Madrid"),new String("Valdetorres de Jarama"),new String("Pozuelo de Alarcon"),new String("Robledillo de la Jara") },new Integer[][] { { null,null,null,13,null,23,null,null }, { 11,null,null,null,null,95,null,44 }, { 54,11,null,74,null,null,35,null }, { 70,34,null,null,91,93,49,null }, { 37,4,null,null,null,null,null,null }, { 29,null,null,null,null,null,null,25 }, { 1,null,null,null,null,null,null,null }, { null,20,null,null,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Tielmes"),new String("Villamantilla"),new String("Brea de Tajo"),new String("Santorcaz"),new String("Madrid"),new String("Valdetorres de Jarama"),new String("Pozuelo de Alarcon"),new String("Robledillo de la Jara") },new Integer[][] { { null,null,null,13,null,23,null,null }, { 11,null,null,null,null,95,null,44 }, { 54,11,null,74,null,null,35,null }, { 70,34,null,null,91,93,49,null }, { 37,4,null,null,null,null,null,null }, { 29,null,null,null,null,null,null,25 }, { 1,null,null,null,null,null,null,null }, { null,20,null,null,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_27")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Ciempozuelos"),new String("Cercedilla"),new String("Nuevo Baztan"),new String("Fresno de Torote"),new String("Valdaracete"),new String("Moraleja de Enmedio"),new String("Batres"),new String("Torrelodones"),new String("Horcajuelo de la Sierra") },new Integer[][] { { null,12,61,2,null,null,null,null,null }, { 1,null,7,null,74,null,null,null,null }, { 48,33,null,8,null,null,null,null,79 }, { 65,3,41,null,44,null,7,93,97 }, { 85,73,73,null,null,null,4,null,93 }, { 23,99,52,null,null,null,null,null,null }, { 93,26,11,58,null,null,null,null,null }, { 91,90,null,null,null,null,null,null,3 }, { 16,34,18,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Ciempozuelos"),new String("Cercedilla"),new String("Nuevo Baztan"),new String("Fresno de Torote"),new String("Valdaracete"),new String("Moraleja de Enmedio"),new String("Batres"),new String("Torrelodones"),new String("Horcajuelo de la Sierra") },new Integer[][] { { null,12,61,2,null,null,null,null,null }, { 1,null,7,null,74,null,null,null,null }, { 48,33,null,8,null,null,null,null,79 }, { 65,3,41,null,44,null,7,93,97 }, { 85,73,73,null,null,null,4,null,93 }, { 23,99,52,null,null,null,null,null,null }, { 93,26,11,58,null,null,null,null,null }, { 91,90,null,null,null,null,null,null,3 }, { 16,34,18,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Ciempozuelos"),new String("Cercedilla"),new String("Nuevo Baztan"),new String("Fresno de Torote"),new String("Valdaracete"),new String("Moraleja de Enmedio"),new String("Batres"),new String("Torrelodones"),new String("Horcajuelo de la Sierra") },new Integer[][] { { null,12,61,2,null,null,null,null,null }, { 1,null,7,null,74,null,null,null,null }, { 48,33,null,8,null,null,null,null,79 }, { 65,3,41,null,44,null,7,93,97 }, { 85,73,73,null,null,null,4,null,93 }, { 23,99,52,null,null,null,null,null,null }, { 93,26,11,58,null,null,null,null,null }, { 91,90,null,null,null,null,null,null,3 }, { 16,34,18,null,null,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Ciempozuelos"),new String("Cercedilla"),new String("Nuevo Baztan"),new String("Fresno de Torote"),new String("Valdaracete"),new String("Moraleja de Enmedio"),new String("Batres"),new String("Torrelodones"),new String("Horcajuelo de la Sierra") },new Integer[][] { { null,12,61,2,null,null,null,null,null }, { 1,null,7,null,74,null,null,null,null }, { 48,33,null,8,null,null,null,null,79 }, { 65,3,41,null,44,null,7,93,97 }, { 85,73,73,null,null,null,4,null,93 }, { 23,99,52,null,null,null,null,null,null }, { 93,26,11,58,null,null,null,null,null }, { 91,90,null,null,null,null,null,null,3 }, { 16,34,18,null,null,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_28")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("La Hiruela"),new String("Boadilla del Monte"),new String("Anchuelo"),new String("Sevilla la Nueva"),new String("Grinon"),new String("Pozuelo de Alarcon"),new String("Navacerrada"),new String("Navas del Rey"),new String("Buitrago del Lozoya"),new String("Mostoles") },new Integer[][] { { null,69,30,null,50,null,5,47,68,null }, { 69,null,40,47,88,null,null,null,null,null }, { 30,40,null,null,87,null,72,null,null,40 }, { null,47,null,null,null,null,null,null,28,null }, { 50,88,87,null,null,null,54,37,null,null }, { null,null,null,null,null,null,null,null,null,16 }, { 5,null,72,null,54,null,null,null,null,null }, { 47,null,null,null,37,null,null,null,null,null }, { 68,null,null,28,null,null,null,null,null,81 }, { null,null,40,null,null,16,null,null,81,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("La Hiruela"),new String("Boadilla del Monte"),new String("Anchuelo"),new String("Sevilla la Nueva"),new String("Grinon"),new String("Pozuelo de Alarcon"),new String("Navacerrada"),new String("Navas del Rey"),new String("Buitrago del Lozoya"),new String("Mostoles") },new Integer[][] { { null,69,30,null,50,null,5,47,68,null }, { 69,null,40,47,88,null,null,null,null,null }, { 30,40,null,null,87,null,72,null,null,40 }, { null,47,null,null,null,null,null,null,28,null }, { 50,88,87,null,null,null,54,37,null,null }, { null,null,null,null,null,null,null,null,null,16 }, { 5,null,72,null,54,null,null,null,null,null }, { 47,null,null,null,37,null,null,null,null,null }, { 68,null,null,28,null,null,null,null,null,81 }, { null,null,40,null,null,16,null,null,81,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("La Hiruela"),new String("Boadilla del Monte"),new String("Anchuelo"),new String("Sevilla la Nueva"),new String("Grinon"),new String("Pozuelo de Alarcon"),new String("Navacerrada"),new String("Navas del Rey"),new String("Buitrago del Lozoya"),new String("Mostoles") },new Integer[][] { { null,69,30,null,50,null,5,47,68,null }, { 69,null,40,47,88,null,null,null,null,null }, { 30,40,null,null,87,null,72,null,null,40 }, { null,47,null,null,null,null,null,null,28,null }, { 50,88,87,null,null,null,54,37,null,null }, { null,null,null,null,null,null,null,null,null,16 }, { 5,null,72,null,54,null,null,null,null,null }, { 47,null,null,null,37,null,null,null,null,null }, { 68,null,null,28,null,null,null,null,null,81 }, { null,null,40,null,null,16,null,null,81,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("La Hiruela"),new String("Boadilla del Monte"),new String("Anchuelo"),new String("Sevilla la Nueva"),new String("Grinon"),new String("Pozuelo de Alarcon"),new String("Navacerrada"),new String("Navas del Rey"),new String("Buitrago del Lozoya"),new String("Mostoles") },new Integer[][] { { null,69,30,null,50,null,5,47,68,null }, { 69,null,40,47,88,null,null,null,null,null }, { 30,40,null,null,87,null,72,null,null,40 }, { null,47,null,null,null,null,null,null,28,null }, { 50,88,87,null,null,null,54,37,null,null }, { null,null,null,null,null,null,null,null,null,16 }, { 5,null,72,null,54,null,null,null,null,null }, { 47,null,null,null,37,null,null,null,null,null }, { 68,null,null,28,null,null,null,null,null,81 }, { null,null,40,null,null,16,null,null,81,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_29")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Madarcos"),new String("Alpedrete"),new String("Villarejo de Salvanes"),new String("Pradena del Rincon"),new String("Gargantilla del Lozoya y Pinilla de Buitrago"),new String("Santa Maria de la Alameda"),new String("Miraflores de la Sierra"),new String("Valdilecha"),new String("Somosierra"),new String("Robledillo de la Jara") },new Integer[][] { { null,43,17,42,null,100,null,null,null,null }, { 89,null,15,2,null,null,null,null,null,null }, { 87,18,null,34,null,null,null,null,null,52 }, { 75,27,null,null,null,null,null,null,null,null }, { 100,35,62,91,null,null,null,20,null,null }, { 26,5,26,74,14,null,null,90,null,null }, { 5,41,23,null,null,null,null,null,50,null }, { 20,27,null,75,null,93,null,null,null,null }, { 39,80,null,40,null,null,null,null,null,30 }, { 2,55,55,48,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Madarcos"),new String("Alpedrete"),new String("Villarejo de Salvanes"),new String("Pradena del Rincon"),new String("Gargantilla del Lozoya y Pinilla de Buitrago"),new String("Santa Maria de la Alameda"),new String("Miraflores de la Sierra"),new String("Valdilecha"),new String("Somosierra"),new String("Robledillo de la Jara") },new Integer[][] { { null,43,17,42,null,100,null,null,null,null }, { 89,null,15,2,null,null,null,null,null,null }, { 87,18,null,34,null,null,null,null,null,52 }, { 75,27,null,null,null,null,null,null,null,null }, { 100,35,62,91,null,null,null,20,null,null }, { 26,5,26,74,14,null,null,90,null,null }, { 5,41,23,null,null,null,null,null,50,null }, { 20,27,null,75,null,93,null,null,null,null }, { 39,80,null,40,null,null,null,null,null,30 }, { 2,55,55,48,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Madarcos"),new String("Alpedrete"),new String("Villarejo de Salvanes"),new String("Pradena del Rincon"),new String("Gargantilla del Lozoya y Pinilla de Buitrago"),new String("Santa Maria de la Alameda"),new String("Miraflores de la Sierra"),new String("Valdilecha"),new String("Somosierra"),new String("Robledillo de la Jara") },new Integer[][] { { null,43,17,42,null,100,null,null,null,null }, { 89,null,15,2,null,null,null,null,null,null }, { 87,18,null,34,null,null,null,null,null,52 }, { 75,27,null,null,null,null,null,null,null,null }, { 100,35,62,91,null,null,null,20,null,null }, { 26,5,26,74,14,null,null,90,null,null }, { 5,41,23,null,null,null,null,null,50,null }, { 20,27,null,75,null,93,null,null,null,null }, { 39,80,null,40,null,null,null,null,null,30 }, { 2,55,55,48,null,null,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Madarcos"),new String("Alpedrete"),new String("Villarejo de Salvanes"),new String("Pradena del Rincon"),new String("Gargantilla del Lozoya y Pinilla de Buitrago"),new String("Santa Maria de la Alameda"),new String("Miraflores de la Sierra"),new String("Valdilecha"),new String("Somosierra"),new String("Robledillo de la Jara") },new Integer[][] { { null,43,17,42,null,100,null,null,null,null }, { 89,null,15,2,null,null,null,null,null,null }, { 87,18,null,34,null,null,null,null,null,52 }, { 75,27,null,null,null,null,null,null,null,null }, { 100,35,62,91,null,null,null,20,null,null }, { 26,5,26,74,14,null,null,90,null,null }, { 5,41,23,null,null,null,null,null,50,null }, { 20,27,null,75,null,93,null,null,null,null }, { 39,80,null,40,null,null,null,null,null,30 }, { 2,55,55,48,null,null,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_30")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withTour_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withTour_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withTour_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Rozas de Puerto Real"),new String("Alpedrete"),new String("Valverde de Alcala"),new String("Lozoya"),new String("Valdemoro"),new String("Villaconejos"),new String("Los Molinos"),new String("Villanueva de Perales"),new String("Ajalvir"),new String("Majadahonda") },new Integer[][] { { null,null,null,28,null,null,74,null,null,15 }, { null,null,5,11,null,null,null,null,91,null }, { null,5,null,null,null,95,null,80,18,null }, { 28,11,null,null,null,null,null,57,null,null }, { null,null,null,null,null,72,80,null,null,null }, { null,null,95,null,72,null,null,null,92,null }, { 74,null,null,null,80,null,null,null,null,null }, { null,null,80,57,null,null,null,null,null,null }, { null,91,18,null,null,92,null,null,null,null }, { 15,null,null,null,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Rozas de Puerto Real"),new String("Alpedrete"),new String("Valverde de Alcala"),new String("Lozoya"),new String("Valdemoro"),new String("Villaconejos"),new String("Los Molinos"),new String("Villanueva de Perales"),new String("Ajalvir"),new String("Majadahonda") },new Integer[][] { { null,null,null,28,null,null,74,null,null,15 }, { null,null,5,11,null,null,null,null,91,null }, { null,5,null,null,null,95,null,80,18,null }, { 28,11,null,null,null,null,null,57,null,null }, { null,null,null,null,null,72,80,null,null,null }, { null,null,95,null,72,null,null,null,92,null }, { 74,null,null,null,80,null,null,null,null,null }, { null,null,80,57,null,null,null,null,null,null }, { null,91,18,null,null,92,null,null,null,null }, { 15,null,null,null,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Rozas de Puerto Real"),new String("Alpedrete"),new String("Valverde de Alcala"),new String("Lozoya"),new String("Valdemoro"),new String("Villaconejos"),new String("Los Molinos"),new String("Villanueva de Perales"),new String("Ajalvir"),new String("Majadahonda") },new Integer[][] { { null,null,null,28,null,null,74,null,null,15 }, { null,null,5,11,null,null,null,null,91,null }, { null,5,null,null,null,95,null,80,18,null }, { 28,11,null,null,null,null,null,57,null,null }, { null,null,null,null,null,72,80,null,null,null }, { null,null,95,null,72,null,null,null,92,null }, { 74,null,null,null,80,null,null,null,null,null }, { null,null,80,57,null,null,null,null,null,null }, { null,91,18,null,null,92,null,null,null,null }, { 15,null,null,null,null,null,null,null,null,null } }),true)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Length(v_1,v_3).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Rozas de Puerto Real"),new String("Alpedrete"),new String("Valverde de Alcala"),new String("Lozoya"),new String("Valdemoro"),new String("Villaconejos"),new String("Los Molinos"),new String("Villanueva de Perales"),new String("Ajalvir"),new String("Majadahonda") },new Integer[][] { { null,null,null,28,null,null,74,null,null,15 }, { null,null,5,11,null,null,null,null,91,null }, { null,5,null,null,null,95,null,80,18,null }, { 28,11,null,null,null,null,null,57,null,null }, { null,null,null,null,null,72,80,null,null,null }, { null,null,95,null,72,null,null,null,92,null }, { 74,null,null,null,80,null,null,null,null,null }, { null,null,80,57,null,null,null,null,null,null }, { null,91,18,null,null,92,null,null,null,null }, { 15,null,null,null,null,null,null,null,null,null } })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withTour_31")) ;
    ResultsHandler.add_result(new String("withTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Gargantilla del Lozoya y Pinilla de Buitrago"),new String("Puentes Viejas"),new String("Robledo de Chavela"),new String("Valdemoro"),new String("Canencia"),new String("Villanueva de la Canada"),new String("Pedrezuela") },new Integer[][] { { null,null,null,20,null,null,null }, { null,null,43,null,20,42,54 }, { 59,null,null,34,null,60,null }, { 82,null,null,null,null,null,null }, { null,76,null,null,null,null,null }, { 16,null,null,null,null,null,48 }, { null,null,null,null,null,null,null } }).doCall() ;
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
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_32")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Braojos de la Sierra"),new String("La Serna del Monte"),new String("Paracuellos de Jarama"),new String("Las Rozas de Madrid"),new String("Torremocha de Jarama"),new String("Pezuela de las Torres"),new String("San Lorenzo de El Escorial"),new String("Torres de la Alameda") },new Integer[][] { { null,null,null,null,null,null,null,55 }, { 97,null,29,65,48,15,null,null }, { 5,null,null,21,null,null,73,null }, { null,null,null,null,79,null,null,null }, { 4,null,null,null,null,null,null,null }, { 58,60,null,null,null,null,null,null }, { 86,null,null,null,null,null,null,null }, { 7,null,null,null,null,null,null,null } }).doCall() ;
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
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_33")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Moraleja de Enmedio"),new String("Coslada"),new String("Puentes Viejas"),new String("Mejorada del Campo"),new String("Brunete"),new String("Valdeolmos-Alalpardo"),new String("Parla"),new String("Belmonte de Tajo"),new String("San Sebastian de los Reyes"),new String("Venturada") },new Integer[][] { { null,15,38,31,null,null,null,null,null,null }, { 67,null,42,59,null,null,72,3,null,null }, { 12,44,null,null,60,null,83,null,63,11 }, { 5,76,null,null,null,null,null,null,null,null }, { 63,70,69,95,null,null,null,null,null,null }, { 75,49,70,71,68,null,null,null,null,null }, { 49,40,null,66,null,null,null,null,null,null }, { 9,33,16,18,null,null,null,null,65,null }, { 67,18,null,87,null,null,null,96,null,null }, { 96,94,45,null,31,null,null,null,null,null } }).doCall() ;
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
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_34")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Becerril de la Sierra"),new String("Brea de Tajo"),new String("Arroyomolinos") },new Integer[][] { { null,null,45 }, { null,null,92 }, { null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Becerril de la Sierra"),new String("Brea de Tajo"),new String("Arroyomolinos") },new Integer[][] { { null,null,45 }, { null,null,92 }, { null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Becerril de la Sierra"),new String("Brea de Tajo"),new String("Arroyomolinos") },new Integer[][] { { null,null,45 }, { null,null,92 }, { null,null,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_35")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Villamantilla"),new String("Talamanca de Jarama"),new String("Valdemoro") },new Integer[][] { { null,82,61 }, { null,null,null }, { null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Villamantilla"),new String("Talamanca de Jarama"),new String("Valdemoro") },new Integer[][] { { null,82,61 }, { null,null,null }, { null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Villamantilla"),new String("Talamanca de Jarama"),new String("Valdemoro") },new Integer[][] { { null,82,61 }, { null,null,null }, { null,null,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_36")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Navarredonda y San Mames"),new String("Paracuellos de Jarama"),new String("Casarrubuelos"),new String("Villamanta") },new Integer[][] { { null,62,null,null }, { 85,null,null,null }, { null,null,null,null }, { 80,null,55,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Navarredonda y San Mames"),new String("Paracuellos de Jarama"),new String("Casarrubuelos"),new String("Villamanta") },new Integer[][] { { null,62,null,null }, { 85,null,null,null }, { null,null,null,null }, { 80,null,55,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Navarredonda y San Mames"),new String("Paracuellos de Jarama"),new String("Casarrubuelos"),new String("Villamanta") },new Integer[][] { { null,62,null,null }, { 85,null,null,null }, { null,null,null,null }, { 80,null,55,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_37")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Batres"),new String("Torres de la Alameda"),new String("Guadarrama"),new String("Ciempozuelos"),new String("Cercedilla"),new String("Patones") },new Integer[][] { { null,3,null,62,null,null }, { null,null,null,null,null,null }, { null,null,null,null,null,95 }, { null,27,null,null,null,null }, { 97,49,10,null,null,null }, { null,null,null,16,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Batres"),new String("Torres de la Alameda"),new String("Guadarrama"),new String("Ciempozuelos"),new String("Cercedilla"),new String("Patones") },new Integer[][] { { null,3,null,62,null,null }, { null,null,null,null,null,null }, { null,null,null,null,null,95 }, { null,27,null,null,null,null }, { 97,49,10,null,null,null }, { null,null,null,16,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Batres"),new String("Torres de la Alameda"),new String("Guadarrama"),new String("Ciempozuelos"),new String("Cercedilla"),new String("Patones") },new Integer[][] { { null,3,null,62,null,null }, { null,null,null,null,null,null }, { null,null,null,null,null,95 }, { null,27,null,null,null,null }, { 97,49,10,null,null,null }, { null,null,null,16,null,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_38")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Valdaracete"),new String("Torrelaguna"),new String("Villanueva de la Canada"),new String("Villarejo de Salvanes"),new String("Navalafuente"),new String("Puebla de la Sierra"),new String("Collado Villalba") },new Integer[][] { { null,52,50,null,null,null,null }, { 73,null,76,54,39,null,null }, { 65,null,null,74,null,null,100 }, { 29,50,30,null,null,null,null }, { 73,40,61,null,null,null,null }, { 91,98,null,null,null,null,null }, { 62,83,53,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdaracete"),new String("Torrelaguna"),new String("Villanueva de la Canada"),new String("Villarejo de Salvanes"),new String("Navalafuente"),new String("Puebla de la Sierra"),new String("Collado Villalba") },new Integer[][] { { null,52,50,null,null,null,null }, { 73,null,76,54,39,null,null }, { 65,null,null,74,null,null,100 }, { 29,50,30,null,null,null,null }, { 73,40,61,null,null,null,null }, { 91,98,null,null,null,null,null }, { 62,83,53,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valdaracete"),new String("Torrelaguna"),new String("Villanueva de la Canada"),new String("Villarejo de Salvanes"),new String("Navalafuente"),new String("Puebla de la Sierra"),new String("Collado Villalba") },new Integer[][] { { null,52,50,null,null,null,null }, { 73,null,76,54,39,null,null }, { 65,null,null,74,null,null,100 }, { 29,50,30,null,null,null,null }, { 73,40,61,null,null,null,null }, { 91,98,null,null,null,null,null }, { 62,83,53,null,null,null,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_39")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Valverde de Alcala"),new String("Campo Real"),new String("Villarejo de Salvanes"),new String("Fuente el Saz de Jarama"),new String("Moraleja de Enmedio"),new String("Arroyomolinos"),new String("Horcajuelo de la Sierra") },new Integer[][] { { null,47,25,null,null,null,null }, { 28,null,null,97,60,97,78 }, { 60,null,null,null,37,null,null }, { 82,37,64,null,null,null,null }, { null,null,null,null,null,78,null }, { null,null,null,null,null,null,null }, { null,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valverde de Alcala"),new String("Campo Real"),new String("Villarejo de Salvanes"),new String("Fuente el Saz de Jarama"),new String("Moraleja de Enmedio"),new String("Arroyomolinos"),new String("Horcajuelo de la Sierra") },new Integer[][] { { null,47,25,null,null,null,null }, { 28,null,null,97,60,97,78 }, { 60,null,null,null,37,null,null }, { 82,37,64,null,null,null,null }, { null,null,null,null,null,78,null }, { null,null,null,null,null,null,null }, { null,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Valverde de Alcala"),new String("Campo Real"),new String("Villarejo de Salvanes"),new String("Fuente el Saz de Jarama"),new String("Moraleja de Enmedio"),new String("Arroyomolinos"),new String("Horcajuelo de la Sierra") },new Integer[][] { { null,47,25,null,null,null,null }, { 28,null,null,97,60,97,78 }, { 60,null,null,null,37,null,null }, { 82,37,64,null,null,null,null }, { null,null,null,null,null,78,null }, { null,null,null,null,null,null,null }, { null,null,null,null,null,null,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_40")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Chinchon"),new String("Valdeolmos-Alalpardo"),new String("Villamantilla"),new String("Navalcarnero"),new String("Getafe"),new String("Carabana"),new String("Guadarrama"),new String("Villanueva del Pardillo") },new Integer[][] { { null,null,36,null,32,91,null,63 }, { null,null,null,25,null,null,null,78 }, { 78,null,null,null,null,null,null,null }, { null,null,null,null,null,null,null,null }, { 20,null,null,null,null,null,null,null }, { null,68,null,null,null,null,null,15 }, { null,null,97,null,null,null,null,null }, { null,null,null,null,null,83,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Chinchon"),new String("Valdeolmos-Alalpardo"),new String("Villamantilla"),new String("Navalcarnero"),new String("Getafe"),new String("Carabana"),new String("Guadarrama"),new String("Villanueva del Pardillo") },new Integer[][] { { null,null,36,null,32,91,null,63 }, { null,null,null,25,null,null,null,78 }, { 78,null,null,null,null,null,null,null }, { null,null,null,null,null,null,null,null }, { 20,null,null,null,null,null,null,null }, { null,68,null,null,null,null,null,15 }, { null,null,97,null,null,null,null,null }, { null,null,null,null,null,83,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Chinchon"),new String("Valdeolmos-Alalpardo"),new String("Villamantilla"),new String("Navalcarnero"),new String("Getafe"),new String("Carabana"),new String("Guadarrama"),new String("Villanueva del Pardillo") },new Integer[][] { { null,null,36,null,32,91,null,63 }, { null,null,null,25,null,null,null,78 }, { 78,null,null,null,null,null,null,null }, { null,null,null,null,null,null,null,null }, { 20,null,null,null,null,null,null,null }, { null,68,null,null,null,null,null,15 }, { null,null,97,null,null,null,null,null }, { null,null,null,null,null,83,null,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_41")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_withoutTour_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("withoutTour"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<Delivery<String>,Void> v_0 = null ;
Delivery<String> v_1 = null ;
TestResult<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>> v_2 = null ;
es.upm.aedlib.positionlist.PositionList<Vertex<String>> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_withoutTour_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_withoutTour_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor(new String[] { new String("Robledo de Chavela"),new String("Batres"),new String("Torres de la Alameda"),new String("Torrejon de Ardoz"),new String("Titulcia"),new String("Valdeolmos-Alalpardo"),new String("Montejo de la Sierra"),new String("La Hiruela"),new String("Santorcaz") },new Integer[][] { { null,76,null,null,null,null,null,null,84 }, { 70,null,53,15,null,null,null,null,null }, { 3,13,null,null,null,null,null,null,null }, { 92,null,null,null,null,null,null,63,null }, { 19,null,null,null,null,null,null,null,null }, { null,22,11,null,null,null,38,null,null }, { null,null,null,null,93,null,null,47,null }, { 11,53,null,null,null,null,null,null,null }, { 73,8,null,null,null,null,null,null,null } }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetGraph(v_1).doCall().checkResult(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Robledo de Chavela"),new String("Batres"),new String("Torres de la Alameda"),new String("Torrejon de Ardoz"),new String("Titulcia"),new String("Valdeolmos-Alalpardo"),new String("Montejo de la Sierra"),new String("La Hiruela"),new String("Santorcaz") },new Integer[][] { { null,76,null,null,null,null,null,null,84 }, { 70,null,53,15,null,null,null,null,null }, { 3,13,null,null,null,null,null,null,null }, { 92,null,null,null,null,null,null,63,null }, { 19,null,null,null,null,null,null,null,null }, { null,22,11,null,null,null,38,null,null }, { null,null,null,null,93,null,null,47,null }, { 11,53,null,null,null,null,null,null,null }, { 73,8,null,null,null,null,null,null,null } })) ;
if (ok_sofar)
{
  v_2 = new Tour(v_1).doCall() ;
  ok_sofar = v_2.checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>(new es.upm.aedlib.Pair<String[],Integer[][]>(new String[] { new String("Robledo de Chavela"),new String("Batres"),new String("Torres de la Alameda"),new String("Torrejon de Ardoz"),new String("Titulcia"),new String("Valdeolmos-Alalpardo"),new String("Montejo de la Sierra"),new String("La Hiruela"),new String("Santorcaz") },new Integer[][] { { null,76,null,null,null,null,null,null,84 }, { 70,null,53,15,null,null,null,null,null }, { 3,13,null,null,null,null,null,null,null }, { 92,null,null,null,null,null,null,63,null }, { 19,null,null,null,null,null,null,null,null }, { null,22,11,null,null,null,38,null,null }, { null,null,null,null,93,null,null,47,null }, { 11,53,null,null,null,null,null,null,null }, { 73,8,null,null,null,null,null,null,null } }),false)) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_withoutTour_42")) ;
    ResultsHandler.add_result(new String("withoutTour"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_43")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,false,false,false,true),new Punto(1,0,new String("puzzle"),false,false,true,true),new Punto(2,0,null,false,false,true,false),new Punto(3,0,null,false,false,false,false) }, { new Punto(0,1,null,false,false,false,false),new Punto(1,1,null,false,false,false,false),new Punto(2,1,null,false,false,false,true),new Punto(3,1,null,true,false,true,false) }, { new Punto(0,2,null,true,false,false,false),new Punto(1,2,null,false,false,false,false),new Punto(2,2,null,false,false,false,false),new Punto(3,2,null,false,true,false,false) }, { new Punto(0,3,null,false,true,false,false),new Punto(1,3,null,false,false,false,false),new Punto(2,3,null,false,false,false,false),new Punto(3,3,null,false,false,false,false) } })).doCall().checkResult(new String("puzzle")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_43")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_44")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,false),new Punto(1,0,null,true,false,false,true),new Punto(2,0,null,false,false,true,false) }, { new Punto(0,1,null,true,true,false,false),new Punto(1,1,null,true,true,false,false),new Punto(2,1,null,true,false,false,false) }, { new Punto(0,2,null,true,true,false,false),new Punto(1,2,null,true,true,false,false),new Punto(2,2,null,false,true,false,false) }, { new Punto(0,3,null,false,true,false,true),new Punto(1,3,null,false,true,true,true),new Punto(2,3,new String("barbie"),true,false,true,false) }, { new Punto(0,4,null,false,false,false,true),new Punto(1,4,null,true,false,true,false),new Punto(2,4,null,true,true,false,false) }, { new Punto(0,5,null,false,false,false,false),new Punto(1,5,null,false,true,false,true),new Punto(2,5,null,false,true,true,false) } })).doCall().checkResult(new String("barbie")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_44")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_45")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,true),new Punto(1,0,null,false,false,true,true),new Punto(2,0,null,false,false,true,false) }, { new Punto(0,1,null,true,true,false,false),new Punto(1,1,new String("lego"),true,false,false,true),new Punto(2,1,null,false,false,true,false) }, { new Punto(0,2,null,true,true,false,false),new Punto(1,2,null,false,true,false,true),new Punto(2,2,null,true,false,true,false) }, { new Punto(0,3,null,true,true,false,true),new Punto(1,3,null,true,false,true,true),new Punto(2,3,null,false,true,true,false) }, { new Punto(0,4,null,true,true,false,true),new Punto(1,4,null,false,true,true,true),new Punto(2,4,null,true,false,true,false) }, { new Punto(0,5,null,false,true,false,false),new Punto(1,5,null,false,false,false,false),new Punto(2,5,null,false,true,false,false) } })).doCall().checkResult(new String("lego")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_45")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_46")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,true),new Punto(1,0,null,true,false,true,false),new Punto(2,0,null,true,false,false,true),new Punto(3,0,null,true,false,true,true),new Punto(4,0,null,true,false,true,true),new Punto(5,0,null,true,false,true,false) }, { new Punto(0,1,null,true,true,false,false),new Punto(1,1,null,true,true,false,false),new Punto(2,1,new String("ps5"),false,true,false,false),new Punto(3,1,null,false,true,false,false),new Punto(4,1,null,false,true,false,true),new Punto(5,1,null,true,true,true,false) }, { new Punto(0,2,null,false,true,false,true),new Punto(1,2,null,false,true,true,true),new Punto(2,2,null,false,false,true,true),new Punto(3,2,null,false,false,true,true),new Punto(4,2,null,false,false,true,true),new Punto(5,2,null,false,true,true,false) } })).doCall().checkResult(new String("ps5")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_46")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_47")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,true),new Punto(1,0,null,true,false,true,false),new Punto(2,0,null,false,false,false,false) }, { new Punto(0,1,null,true,true,false,false),new Punto(1,1,null,true,true,false,false),new Punto(2,1,null,false,false,false,false) }, { new Punto(0,2,null,false,true,false,true),new Punto(1,2,null,true,true,true,false),new Punto(2,2,null,true,false,false,false) }, { new Punto(0,3,null,true,false,false,true),new Punto(1,3,null,true,true,true,true),new Punto(2,3,null,false,true,true,false) }, { new Punto(0,4,null,true,true,false,true),new Punto(1,4,null,false,true,true,true),new Punto(2,4,null,true,false,true,false) }, { new Punto(0,5,null,true,true,false,false),new Punto(1,5,null,true,false,false,true),new Punto(2,5,null,true,true,true,false) }, { new Punto(0,6,null,false,true,false,true),new Punto(1,6,null,false,true,true,false),new Punto(2,6,new String("lego"),false,true,false,false) } })).doCall().checkResult(new String("lego")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_47")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_48")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,false,false,false,true),new Punto(1,0,null,true,false,true,false),new Punto(2,0,null,false,false,false,true),new Punto(3,0,null,true,false,true,false),new Punto(4,0,null,true,false,false,false) }, { new Punto(0,1,null,false,false,false,true),new Punto(1,1,null,true,true,true,true),new Punto(2,1,null,false,false,true,false),new Punto(3,1,null,true,true,false,true),new Punto(4,1,null,true,true,true,false) }, { new Punto(0,2,null,true,false,false,false),new Punto(1,2,null,true,true,false,false),new Punto(2,2,null,false,false,false,true),new Punto(3,2,null,false,true,true,false),new Punto(4,2,null,false,true,false,false) }, { new Punto(0,3,null,true,true,false,false),new Punto(1,3,null,false,true,false,true),new Punto(2,3,null,true,false,true,false),new Punto(3,3,null,false,false,false,false),new Punto(4,3,null,false,false,false,false) }, { new Punto(0,4,null,true,true,false,false),new Punto(1,4,null,false,false,false,false),new Punto(2,4,null,true,true,false,true),new Punto(3,4,null,false,false,true,true),new Punto(4,4,new String("playmobil"),true,false,true,false) }, { new Punto(0,5,null,false,true,false,true),new Punto(1,5,null,false,false,true,false),new Punto(2,5,null,false,true,false,false),new Punto(3,5,null,false,false,false,false),new Punto(4,5,null,false,true,false,false) } })).doCall().checkResult(new String("playmobil")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_48")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_49")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,false),new Punto(1,0,null,true,false,false,false),new Punto(2,0,null,true,false,false,true),new Punto(3,0,null,false,false,true,true),new Punto(4,0,null,true,false,true,true),new Punto(5,0,null,false,false,true,false) }, { new Punto(0,1,null,true,true,false,true),new Punto(1,1,null,true,true,true,true),new Punto(2,1,null,false,true,true,false),new Punto(3,1,null,true,false,false,true),new Punto(4,1,null,true,true,true,true),new Punto(5,1,null,false,false,true,false) }, { new Punto(0,2,null,true,true,false,false),new Punto(1,2,null,true,true,false,false),new Punto(2,2,new String("playmobil"),true,false,false,false),new Punto(3,2,null,false,true,false,false),new Punto(4,2,null,true,true,false,false),new Punto(5,2,null,false,false,false,false) }, { new Punto(0,3,null,false,true,false,true),new Punto(1,3,null,true,true,true,false),new Punto(2,3,null,false,true,false,true),new Punto(3,3,null,true,false,true,true),new Punto(4,3,null,true,true,true,false),new Punto(5,3,null,false,false,false,false) }, { new Punto(0,4,null,false,false,false,false),new Punto(1,4,null,true,true,false,true),new Punto(2,4,null,false,false,true,false),new Punto(3,4,null,false,true,false,false),new Punto(4,4,null,true,true,false,false),new Punto(5,4,null,false,false,false,false) }, { new Punto(0,5,null,false,false,false,true),new Punto(1,5,null,false,true,true,false),new Punto(2,5,null,true,false,false,true),new Punto(3,5,null,false,false,true,true),new Punto(4,5,null,false,true,true,false),new Punto(5,5,null,false,false,false,false) }, { new Punto(0,6,null,false,false,false,true),new Punto(1,6,null,false,false,true,true),new Punto(2,6,null,false,true,true,true),new Punto(3,6,null,false,false,true,false),new Punto(4,6,null,false,false,false,false),new Punto(5,6,null,false,false,false,false) } })).doCall().checkResult(new String("playmobil")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_49")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_50")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,true),new Punto(1,0,null,true,false,true,false),new Punto(2,0,null,true,false,false,true),new Punto(3,0,null,false,false,true,true),new Punto(4,0,null,false,false,true,true),new Punto(5,0,null,false,false,true,false) }, { new Punto(0,1,null,false,true,false,true),new Punto(1,1,null,false,true,true,true),new Punto(2,1,null,false,true,true,true),new Punto(3,1,null,true,false,true,true),new Punto(4,1,null,false,false,true,false),new Punto(5,1,null,false,false,false,false) }, { new Punto(0,2,null,true,false,false,true),new Punto(1,2,null,true,false,true,true),new Punto(2,2,null,true,false,true,true),new Punto(3,2,null,true,true,true,false),new Punto(4,2,null,true,false,false,false),new Punto(5,2,null,false,false,false,false) }, { new Punto(0,3,null,false,true,false,true),new Punto(1,3,null,true,true,true,true),new Punto(2,3,null,false,true,true,true),new Punto(3,3,null,false,true,true,false),new Punto(4,3,null,false,true,false,false),new Punto(5,3,null,false,false,false,false) }, { new Punto(0,4,null,true,false,false,false),new Punto(1,4,null,false,true,false,true),new Punto(2,4,null,true,false,true,false),new Punto(3,4,null,true,false,false,true),new Punto(4,4,null,false,false,true,true),new Punto(5,4,new String("ps5"),true,false,true,false) }, { new Punto(0,5,null,false,true,false,true),new Punto(1,5,null,true,false,true,true),new Punto(2,5,null,true,true,true,false),new Punto(3,5,null,true,true,false,false),new Punto(4,5,null,false,false,false,false),new Punto(5,5,null,false,true,false,false) }, { new Punto(0,6,null,true,false,false,false),new Punto(1,6,null,true,true,false,false),new Punto(2,6,null,false,true,false,false),new Punto(3,6,null,true,true,false,true),new Punto(4,6,null,true,false,true,true),new Punto(5,6,null,false,false,true,false) }, { new Punto(0,7,null,false,true,false,true),new Punto(1,7,null,false,true,true,true),new Punto(2,7,null,true,false,true,true),new Punto(3,7,null,false,true,true,false),new Punto(4,7,null,true,true,false,false),new Punto(5,7,null,true,false,false,false) }, { new Punto(0,8,null,false,false,false,true),new Punto(1,8,null,false,false,true,true),new Punto(2,8,null,false,true,true,false),new Punto(3,8,null,false,false,false,false),new Punto(4,8,null,false,true,false,true),new Punto(5,8,null,false,true,true,false) } })).doCall().checkResult(new String("ps5")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_50")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_51")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,true),new Punto(1,0,null,true,false,true,false),new Punto(2,0,null,false,false,false,false),new Punto(3,0,null,true,false,false,true),new Punto(4,0,null,false,false,true,true),new Punto(5,0,null,true,false,true,true),new Punto(6,0,null,true,false,true,false),new Punto(7,0,null,true,false,false,false),new Punto(8,0,null,false,false,false,false) }, { new Punto(0,1,null,true,true,false,false),new Punto(1,1,null,true,true,false,true),new Punto(2,1,null,false,false,true,true),new Punto(3,1,null,false,true,true,true),new Punto(4,1,null,true,false,true,false),new Punto(5,1,null,true,true,false,false),new Punto(6,1,null,false,true,false,true),new Punto(7,1,null,true,true,true,true),new Punto(8,1,null,false,false,true,false) }, { new Punto(0,2,null,true,true,false,false),new Punto(1,2,null,false,true,false,true),new Punto(2,2,null,false,false,true,false),new Punto(3,2,null,true,false,false,false),new Punto(4,2,null,false,true,false,false),new Punto(5,2,null,false,true,false,false),new Punto(6,2,null,true,false,false,false),new Punto(7,2,null,true,true,false,true),new Punto(8,2,null,false,false,true,false) }, { new Punto(0,3,null,false,true,false,false),new Punto(1,3,null,false,false,false,false),new Punto(2,3,null,true,false,false,true),new Punto(3,3,null,true,true,true,false),new Punto(4,3,null,false,false,false,false),new Punto(5,3,null,true,false,false,false),new Punto(6,3,null,false,true,false,false),new Punto(7,3,null,true,true,false,true),new Punto(8,3,null,false,false,true,false) }, { new Punto(0,4,null,true,false,false,true),new Punto(1,4,null,false,false,true,true),new Punto(2,4,null,true,true,true,false),new Punto(3,4,null,false,true,false,true),new Punto(4,4,null,false,false,true,true),new Punto(5,4,null,true,true,true,true),new Punto(6,4,null,true,false,true,true),new Punto(7,4,null,false,true,true,false),new Punto(8,4,null,true,false,false,false) }, { new Punto(0,5,null,false,true,false,false),new Punto(1,5,null,false,false,false,false),new Punto(2,5,null,false,true,false,true),new Punto(3,5,new String("lego"),false,false,true,true),new Punto(4,5,null,false,false,true,false),new Punto(5,5,null,false,true,false,true),new Punto(6,5,null,false,true,true,true),new Punto(7,5,null,false,false,true,true),new Punto(8,5,null,false,true,true,false) } })).doCall().checkResult(new String("lego")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_51")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_52")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,false,false,false,true),new Punto(1,0,null,true,false,true,true),new Punto(2,0,null,false,false,true,true),new Punto(3,0,null,true,false,true,true),new Punto(4,0,null,true,false,true,true),new Punto(5,0,null,true,false,true,true),new Punto(6,0,null,true,false,true,false) }, { new Punto(0,1,null,true,false,false,true),new Punto(1,1,null,false,true,true,true),new Punto(2,1,null,false,false,true,true),new Punto(3,1,null,true,true,true,true),new Punto(4,1,null,true,true,true,false),new Punto(5,1,null,true,true,false,true),new Punto(6,1,null,false,true,true,false) }, { new Punto(0,2,null,true,true,false,false),new Punto(1,2,null,false,false,false,true),new Punto(2,2,null,true,false,true,true),new Punto(3,2,null,true,true,true,false),new Punto(4,2,null,false,true,false,true),new Punto(5,2,null,false,true,true,false),new Punto(6,2,null,false,false,false,false) }, { new Punto(0,3,null,false,true,false,false),new Punto(1,3,null,false,false,false,true),new Punto(2,3,null,false,true,true,true),new Punto(3,3,null,true,true,true,true),new Punto(4,3,null,false,false,true,false),new Punto(5,3,null,false,false,false,true),new Punto(6,3,null,true,false,true,false) }, { new Punto(0,4,null,true,false,false,true),new Punto(1,4,null,true,false,true,false),new Punto(2,4,null,true,false,false,true),new Punto(3,4,null,false,true,true,false),new Punto(4,4,null,true,false,false,true),new Punto(5,4,null,false,false,true,false),new Punto(6,4,null,true,true,false,false) }, { new Punto(0,5,null,true,true,false,true),new Punto(1,5,null,true,true,true,true),new Punto(2,5,null,true,true,true,true),new Punto(3,5,null,true,false,true,false),new Punto(4,5,null,false,true,false,false),new Punto(5,5,null,false,false,false,false),new Punto(6,5,null,true,true,false,false) }, { new Punto(0,6,null,true,true,false,true),new Punto(1,6,null,false,true,true,true),new Punto(2,6,null,false,true,true,true),new Punto(3,6,null,false,true,true,true),new Punto(4,6,null,true,false,true,false),new Punto(5,6,null,true,false,false,true),new Punto(6,6,null,true,true,true,false) }, { new Punto(0,7,null,false,true,false,true),new Punto(1,7,new String("ps5"),false,false,true,false),new Punto(2,7,null,false,false,false,true),new Punto(3,7,null,false,false,true,true),new Punto(4,7,null,false,true,true,false),new Punto(5,7,null,false,true,false,true),new Punto(6,7,null,false,true,true,false) } })).doCall().checkResult(new String("ps5")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_52")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_busca_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
      TestData.setGlobalTimeout() ;
      ResultsHandler.add_result(new String("busca"),false) ;
      return ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_busca_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_busca_53")) ;
if (ok_sofar)
  ok_sofar = new Busca(new Laberinto(new Punto[][] { { new Punto(0,0,null,true,false,false,true),new Punto(1,0,null,false,false,true,true),new Punto(2,0,null,false,false,true,true),new Punto(3,0,null,true,false,true,true),new Punto(4,0,null,true,false,true,true),new Punto(5,0,null,false,false,true,false),new Punto(6,0,null,true,false,false,false),new Punto(7,0,null,false,false,false,true),new Punto(8,0,null,true,false,true,false) }, { new Punto(0,1,null,false,true,false,false),new Punto(1,1,null,true,false,false,true),new Punto(2,1,null,false,false,true,false),new Punto(3,1,null,false,true,false,false),new Punto(4,1,null,false,true,false,true),new Punto(5,1,null,true,false,true,true),new Punto(6,1,null,true,true,true,true),new Punto(7,1,null,true,false,true,false),new Punto(8,1,null,false,true,false,false) }, { new Punto(0,2,null,true,false,false,true),new Punto(1,2,null,false,true,true,false),new Punto(2,2,null,false,false,false,true),new Punto(3,2,null,true,false,true,true),new Punto(4,2,null,false,false,true,true),new Punto(5,2,null,false,true,true,true),new Punto(6,2,null,true,true,true,false),new Punto(7,2,null,false,true,false,true),new Punto(8,2,null,true,false,true,false) }, { new Punto(0,3,null,false,true,false,false),new Punto(1,3,null,true,false,false,false),new Punto(2,3,null,true,false,false,true),new Punto(3,3,null,false,true,true,false),new Punto(4,3,null,true,false,false,true),new Punto(5,3,null,false,false,true,true),new Punto(6,3,null,false,true,true,false),new Punto(7,3,null,true,false,false,true),new Punto(8,3,null,true,true,true,false) }, { new Punto(0,4,null,false,false,false,false),new Punto(1,4,null,true,true,false,false),new Punto(2,4,null,false,true,false,false),new Punto(3,4,null,true,false,false,false),new Punto(4,4,null,true,true,false,true),new Punto(5,4,null,true,false,true,true),new Punto(6,4,null,false,false,true,true),new Punto(7,4,null,false,true,true,false),new Punto(8,4,null,true,true,false,false) }, { new Punto(0,5,null,true,false,false,false),new Punto(1,5,new String("playmobil"),true,true,false,false),new Punto(2,5,null,false,false,false,false),new Punto(3,5,null,true,true,false,false),new Punto(4,5,null,false,true,false,false),new Punto(5,5,null,true,true,false,true),new Punto(6,5,null,true,false,true,false),new Punto(7,5,null,true,false,false,true),new Punto(8,5,null,false,true,true,false) }, { new Punto(0,6,null,false,true,false,true),new Punto(1,6,null,true,true,true,true),new Punto(2,6,null,false,false,true,true),new Punto(3,6,null,true,true,true,false),new Punto(4,6,null,true,false,false,true),new Punto(5,6,null,true,true,true,false),new Punto(6,6,null,false,true,false,true),new Punto(7,6,null,true,true,true,true),new Punto(8,6,null,true,false,true,false) }, { new Punto(0,7,null,false,false,false,false),new Punto(1,7,null,false,true,false,false),new Punto(2,7,null,false,false,false,true),new Punto(3,7,null,false,true,true,true),new Punto(4,7,null,false,true,true,false),new Punto(5,7,null,false,true,false,true),new Punto(6,7,null,false,false,true,false),new Punto(7,7,null,false,true,false,false),new Punto(8,7,null,false,true,false,false) } })).doCall().checkResult(new String("playmobil")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("\n*** TIMEOUT! *** Very slow or non-terminating execution\n"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_busca_53")) ;
    ResultsHandler.add_result(new String("busca"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab7";
}












static class RouteChecker {

  static boolean graphCorrect(GetGraph call,
                           TestResult<DirectedGraph<String,Integer>,Pair<String[],Integer[][]>> result,
                           Pair<String[],Integer[][]> expected)
  {
    // We have to check that the number of graph vertices is equal to the length of the array
    // and that every node in the array is present as a vertice in the graph.
    // Next we check that the transition function is correct according to the matrix.

    boolean ok_sofar = true;
    DirectedGraph<String,Integer> graph = result.getValue();
    String[] nodeElements = expected.getLeft();
    Integer[][] matrix = expected.getRight();

    if (graph.numVertices() != nodeElements.length) {
      ok_sofar = false;
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the call "+call+" returned a graph with "+graph.numVertices()+" vertices"+
         " but the graph should contain "+nodeElements.length+" vertices.");
    }

    if (ok_sofar) {
      int expectedNumEdges = 0;
      for (int x=0; x<matrix.length; x++) {
        Integer[] row = matrix[x];
        for (int y=0; y<row.length; y++) {
          if (row[y] != null) ++expectedNumEdges;
        }
      }

      if (graph.numEdges() != expectedNumEdges) {
        ok_sofar = false;
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "the call "+call+" returned a graph with "+graph.numEdges()+" edges"+
           " but the graph should contain "+expectedNumEdges+" edges.");
      }
    }

    Map<Integer,Vertex<String>> extToInt = new HashTableMap<>();

    if (ok_sofar) {
      for (int i=0; i<nodeElements.length; i++) {
        String nodeName = nodeElements[i];
        boolean found = false;
        for (Vertex<String> graphNode : graph.vertices()) {
          if (nodeName.equals(graphNode.element())) {
            found = true;
            extToInt.put(i,graphNode);
          }
        }
        if (!found) {
          ok_sofar = false;
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the call "+call+" returned a graph where there is no vertex with the element "+
             nodeName+" but there should be.");
        }
      }
    }

    if (ok_sofar) {
      for (int x=0; x<matrix.length && ok_sofar; x++) {
        for (int y=0; y<matrix.length && ok_sofar; y++) {
          Integer value = matrix[x][y];
          if (value != null) {
            Vertex<String> fromNode = extToInt.get(x);
            Vertex<String> toNode = extToInt.get(y);
            boolean found = false;
            for (Edge<Integer> e : graph.outgoingEdges(fromNode)) {
              Vertex<String> endNode = graph.endVertex(e);
              if (toNode == endNode) {
                if (value.equals(e.element())) {
                  found = true;
                  break;
                } else {
                  ok_sofar = false;
                  TestUtils.printError
                    (TestUtils.ExecutionTime.LAST,
                     "the call "+call+" returned a graph where there is no edge from "+
                     fromNode+" to "+toNode+" with the element "+value);
                  break;
                }
              }
            }
            if (!found) {
              ok_sofar = false;
              TestUtils.printError
                (TestUtils.ExecutionTime.LAST,
                 "the call "+call+" returned a graph where there is no edge from "+
                 fromNode+" to "+toNode);
              break;
            }
          }
        }
      }
    }
    return ok_sofar;
  }

  static boolean tourCorrect(Tour call,
                             TestResult<PositionList<Vertex<String>>,Pair<Pair<String[],Integer[][]>,Boolean>> result,
                             Pair<Pair<String[],Integer[][]>,Boolean> expected)
  {
    boolean ok_sofar = true;

    if (!call.noException())
      return false;

    PositionList<Vertex<String>> tour = result.getValue();

    if (tour == null) {
      if (expected.getRight() == true) {
        TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the call "+call+" did not return a tour but should have done so");
        return false;
      } else return true;
    } else {
      if (expected.getRight() == false) {
        TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the call "+call+" returned a tour but should not have done so");
        return false;
      }
    }

    String[] nodeElements = expected.getLeft().getLeft();
    Integer[][] matrix = expected.getLeft().getRight();

    if (ok_sofar) {
      if (tour.size() != nodeElements.length) {
        ok_sofar = false;
        TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the call "+call+" returned a tour\n  "+tour+
             "\nbut the length of the tour "+tour.size()+
             " is different from the number of nodes in the graph = "+nodeElements.length);
      }
    }

    Map<Vertex<String>,Integer> intToExt = new HashTableMap<>();

    if (ok_sofar) {
      for (int i=0; i<nodeElements.length; i++) {
        String nodeName = nodeElements[i];
        boolean found = false;
        for (Vertex<String> node : tour) {
          if (nodeName.equals(node.element())) {
            found = true;
            intToExt.put(node,i);
          }
        }
        if (!found) {
          ok_sofar = false;
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the call "+call+" returned a tour which does not visit "+nodeName);
        }
      }
      if (intToExt.size() != nodeElements.length) {
        ok_sofar = false;
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "the call "+call+" returned a tour which does not visit all nodes among "+
           nodeElements);
      }
    }

    if (ok_sofar) {
      Vertex<String> previous = null;
      for (Vertex<String> now : tour) {
        if (now == null) {
          ok_sofar = false;
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the call "+call+" returned a tour\n  "+tour+
             "\nwith a null vertex");
          break;
        }
        
        if (previous != null) {
          boolean found = false;
          int fromNode = intToExt.get(previous);
          int toNode = intToExt.get(now);
          Integer edge = matrix[fromNode][toNode];
          if (edge == null) {
            ok_sofar = false;
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the call "+call+" returned a tour\n  "+tour+
               "\nwith two consecutive nodes "+
               previous.element()+" and "+now.element()+
               " but there is no edge between these nodes in the matrix");
            break;
          }
        }
        previous = now;
      }
    }
    return ok_sofar;
  }

  static boolean tourLengthCorrect(Length call,
                           TestResult<Integer,Pair<String[],Integer[][]>> result,
                                   Pair<String[],Integer[][]> expected)
  {
    // Check that the length of the tour is correct
    boolean ok_sofar = true;

    if (!call.noException())
      return false;

    Integer tourLength = result.getValue();
    PositionList<Vertex<String>> tour = call.tour;
    String[] nodeElements = expected.getLeft();
    Integer[][] matrix = expected.getRight();

    Map<Vertex<String>,Integer> intToExt = new HashTableMap<>();

    for (int i=0; i<nodeElements.length; i++) {
      String nodeName = nodeElements[i];
      boolean found = false;
      for (Vertex<String> node : tour) {
        if (nodeName.equals(node.element())) {
          found = true;
          intToExt.put(node,i);
        }
      }
    }

    Vertex<String> previous = null;
    int length = 0;
    
    for (Vertex<String> now : tour) {
      if (previous != null) {
        boolean found = false;
        int fromNode = intToExt.get(previous);
        int toNode = intToExt.get(now);
        Integer edge = matrix[fromNode][toNode];
        length += edge;
      }
      previous = now;
    }

    if (length != tourLength) {
      ok_sofar = false;
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the call "+call+" returned a length "+tourLength+" for the tour\n  "+tour+
         "\nbut the expected length is "+length);
    }
    
    return ok_sofar;
  }
}








static class MazeChecker2 {

  static boolean checkExplore(Busca call,
                              TestResult<Pair<String,PositionList<Direccion>>,String> result,
                              String expected)
  {
    boolean ok_sofar = true;
    
    if (!call.noException() || !call.nonNull())
      ok_sofar = false;

    if (ok_sofar) {
      Pair<String,PositionList<Direccion>> pair =
	result.getValue();

      if (pair == null)
	ok_sofar = (expected == null);

      if (!ok_sofar) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+call+" returned null"+
	   " but should have returned a pair with a regalo "+expected);
      }
      
      if (pair != null) {
	String treasure = pair.getLeft();
	PositionList<Direccion> path = pair.getRight();
	
	if (treasure != null)
	  ok_sofar = ok_sofar && treasure.equals(expected);
	else
	  ok_sofar = false;
	
	if (!ok_sofar) {
	  TestUtils.printError
	    (TestUtils.ExecutionTime.UNRELATED,
	     "the call "+call+" returned the regalo "+treasure+
	     " but should have returned "+expected);
	}
      
	if (ok_sofar && path == null) {
	  TestUtils.printError
	    (TestUtils.ExecutionTime.UNRELATED,
	     "the call "+call+" returned the path null");
	  ok_sofar = false;
	}
	
	if (ok_sofar) {
	  ok_sofar =
	    checkPCPath(path, treasure, call.x_1, call.toString());
	}
      }
    }
    
    if (!ok_sofar) {
      TestData.message("\nLaberinto inicial: (x marca la posicion, $ el regalo, . tiene tiza) ");
      TestData.message(call.x_1_orig.printPuntos());
      TestData.message("\nLaberinto despues de la exploracion (x marca la posicion, $ el regalo, . tiene tiza):");
      TestData.message(call.x_1.printPuntos());
      return false;
    }
    return ok_sofar;
  }


  static boolean checkPCPath(PositionList<Direccion> path, String treasure, Laberinto callLaberinto, String callString) {
    Laberinto maze = new Laberinto(callLaberinto,0,0);
    Position<Direccion> cursor = path.first();

    while (cursor != null) {
      Direccion dir = cursor.element();
      if (dir == null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a direction "+path+
	   " that contains a null element");
	return false;
      }

      Punto newPunto = maze.canGo(dir);
      if (newPunto == null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a direction "+dir+
	   " which cannot be taken in punto "+maze.getPunto());
	return false;
      }
      maze.moverHacia(dir);
      cursor = path.next(cursor);
    }

    if (!maze.tieneRegalo()) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which terminates in a punto "+maze.getPunto()+
	   " which does not contain any regalo ");
	return false;
    }

    if (!maze.getRegalo().equals(treasure)) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which terminates in a punto "+maze.getPunto()+
	   " which has a regalo "+maze.getRegalo()+
	   " which is distinct from the regalo "+
	   " returned by the call to "+callString);
	return false;
    }
    return true;
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


static class Busca extends TestCall<es.upm.aedlib.Pair<String,es.upm.aedlib.positionlist.PositionList<Direccion>>,String>
{
  Laberinto x_1;
  Laberinto x_1_orig;
  
  public Busca (Laberinto x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new Laberinto(x_1) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Buscar.busca")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.Pair<String,es.upm.aedlib.positionlist.PositionList<Direccion>> call () 
  {
    return Buscar.busca(x_1) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!MazeChecker2.checkExplore(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Constructor extends TestCall<Delivery<String>,Void>
{
  String[] x_1;
  String[] x_1_orig;
  Integer[][] x_2;
  Integer[][] x_2_orig;
  
  public Constructor (String[] x_1,Integer[][] x_2)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = x_1.clone() ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = x_2.clone() ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new Delivery<String>")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_2_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Delivery<String> call () 
  {
    return new Delivery<String>(x_1,x_2) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!unchanged_array(x_1,x_1_orig))
      return false ;
    if (!unchanged_array(x_2,x_2_orig))
      return false ;
    return true ;
  }
  
}


static class Tour extends TestCall<es.upm.aedlib.positionlist.PositionList<Vertex<String>>,es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean>>
{
  Delivery<String> x_1;
  
  public Tour (Delivery<String> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".tour")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.PositionList<Vertex<String>> call () 
  {
    return x_1.tour() ;
  }
  
  public boolean checkResult (es.upm.aedlib.Pair<es.upm.aedlib.Pair<String[],Integer[][]>,Boolean> expected) 
  {
    if (!noException())
      return false ;
    if (!RouteChecker.tourCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class GetGraph extends TestCall<DirectedGraph<String,Integer>,es.upm.aedlib.Pair<String[],Integer[][]>>
{
  Delivery<String> x_1;
  
  public GetGraph (Delivery<String> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".getGraph")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public DirectedGraph<String,Integer> call () 
  {
    return x_1.getGraph() ;
  }
  
  public boolean checkResult (es.upm.aedlib.Pair<String[],Integer[][]> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!RouteChecker.graphCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Length extends TestCall<Integer,es.upm.aedlib.Pair<String[],Integer[][]>>
{
  Delivery<String> x_1;
  es.upm.aedlib.positionlist.PositionList<Vertex<String>> tour;
  
  public Length (Delivery<String> x_1,es.upm.aedlib.positionlist.PositionList<Vertex<String>> tour)
  {
    this.x_1 = x_1 ;
    this.tour = tour ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".length")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(tour)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return x_1.length(tour) ;
  }
  
  public boolean checkResult (es.upm.aedlib.Pair<String[],Integer[][]> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!RouteChecker.tourLengthCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}












 
static class BaseResultsHandler {
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





static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;
  static boolean globalTimeout;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
    globalTimeout = false;
  }

  public static void setGlobalTimeout() {
    if (!globalTimeout) {
      globalTimeout = true;
      System.out.println("\n*** GLOBAL TIMEOUT! *** No more test cases will be run \n\n");
    }
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

static class ResultsHandler extends BaseResultsHandler {

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    int numSuccesses = 0;
    
    for (String key : results_sofar.keySet()) {
      if (!results_sofar.get(key)) {
        if (key.equals("withTour") || key.equals("withoutTour"))
          return false;
      } else ++numSuccesses;
    }

   if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return numSuccesses >= 2;
  }

  static void report_results() {
    if (results_sofar.size() == 3) {
      System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (String testName : results_sofar.keySet()) {
        if (!testName.equals("recursionCheck")) {
          System.out.print("Testing results for "+testName+": ");
          if (results_sofar.get(testName))
            System.out.println("succeeded");
          else
            System.out.println("failed");
        }
      }
      
      System.out.println("\n------------------------------------------");
      if (results_ok()) {
        System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
        System.out.println(BaseResultsHandler.readFile("aed_success_message.txt"));
      } else System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }
}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
