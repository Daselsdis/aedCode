
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
// File generated at: 2024/11/14 -- 21:12:47
// Seed: {1731,615166,85117}
//
//////////////////////////////////////////////////////////////////////



package aed.individual5;

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
import es.upm.aedlib.set.*;
import es.upm.aedlib.tree.*;
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
public class TesterInd5 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    TestData.setIndividualTimeout(10) ;
    TestData.setGlobalTimeout(60) ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(41,TestData.getGlobalTimeout()) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,8,1) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_longestPath_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_01")) ;
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
    ResultsHandler.stopTest(new String("test_longestPath_01")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_02")) ;
if (ok_sofar)
  ok_sofar = new LongestPath(new es.upm.aedlib.tree.LinkedGeneralTree<Integer>()).doCall().checkResult(0) ;
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
    ResultsHandler.stopTest(new String("test_longestPath_02")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_03")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(55) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_03")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_04")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(229) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_04")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_05")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(824) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_05")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_06")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(999) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_06")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_07")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1001) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_07")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_08")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1436) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_08")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_09")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1470) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_09")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_10")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1630) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(1) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_10")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_11")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(72) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1554) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_11")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_12")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(73) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1168) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_12")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_13")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(334) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1349) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,672) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,1331) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_13")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_14")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(336) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,393) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_14")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_15")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(337) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1776) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,137) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_15")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_16")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(573) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1542) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_16")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_17")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(673) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1026) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,438) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_17")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_18")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1260) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,96) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_18")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_19")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1390) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,748) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,1247) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_19")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_20")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1404) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,683) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,479) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,1239) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_20")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_21")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1923) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1287) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,1352) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,97) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_21")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_22")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1960) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,103) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,1933) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,1083) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(2) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_22")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_23")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(147) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,916) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,1775) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_23")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_24")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(185) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1121) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,812) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,1873) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_2,1928) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_24")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_25")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(243) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1223) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,297) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,1088) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_25")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_26")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(384) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,37) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,836) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_0,800) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_26")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_27")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(567) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1232) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,408) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_0,458) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(root,1164) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,33) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_3,816) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(root,1184) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_27")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_28")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(572) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1293) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,1828) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_0,1644) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_0,1281) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(root,434) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_4,98) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_4,764) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_4,1988) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_28")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_29")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(723) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1159) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,79) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_0,1530) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(root,290) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,75) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_3,303) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_3,605) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_3,429) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(root,1937) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree.addChildLast(pos_8,213) ;
  es.upm.aedlib.Position<Integer> pos_10 = tree.addChildLast(pos_8,265) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_29")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_30")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(958) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,929) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,1779) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,100) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_30")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_31")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1412) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1072) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,560) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,820) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_2,234) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(root,574) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_31")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_32")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1436) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1970) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,1149) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_0,1690) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_0,253) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(root,1255) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_4,1238) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_4,1738) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_4,1514) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(pos_4,915) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_32")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_33")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1667) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1358) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,603) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(root,190) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(root,1709) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,738) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(3) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_33")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_34")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(112) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,622) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,14) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_1,1815) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_1,1646) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,1917) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_3,875) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_3,1057) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(4) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_34")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_35")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(604) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1369) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,545) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_1,488) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_0,1176) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,40) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_3,396) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_3,794) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(root,686) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(pos_7,756) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree.addChildLast(pos_8,123) ;
  es.upm.aedlib.Position<Integer> pos_10 = tree.addChildLast(pos_7,348) ;
  es.upm.aedlib.Position<Integer> pos_11 = tree.addChildLast(pos_10,1101) ;
  es.upm.aedlib.Position<Integer> pos_12 = tree.addChildLast(pos_7,1492) ;
  es.upm.aedlib.Position<Integer> pos_13 = tree.addChildLast(pos_12,386) ;
  es.upm.aedlib.Position<Integer> pos_14 = tree.addChildLast(pos_12,1150) ;
  es.upm.aedlib.Position<Integer> pos_15 = tree.addChildLast(pos_12,1833) ;
  es.upm.aedlib.Position<Integer> pos_16 = tree.addChildLast(root,978) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(4) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_35")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_36")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(964) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1333) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,371) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_1,1290) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(root,713) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,856) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_4,1414) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_4,1109) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_4,1189) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(pos_3,1913) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree.addChildLast(root,1188) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(4) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_36")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_37")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1508) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1518) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,370) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_1,1723) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(root,1115) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,715) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_3,1552) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(root,715) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(4) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_37")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_38")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(662) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1538) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,1212) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_1,1679) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_2,298) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_2,10) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_2,1258) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_2,74) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_1,1971) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(pos_7,3) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree.addChildLast(pos_7,1334) ;
  es.upm.aedlib.Position<Integer> pos_10 = tree.addChildLast(pos_7,148) ;
  es.upm.aedlib.Position<Integer> pos_11 = tree.addChildLast(pos_1,511) ;
  es.upm.aedlib.Position<Integer> pos_12 = tree.addChildLast(pos_0,432) ;
  es.upm.aedlib.Position<Integer> pos_13 = tree.addChildLast(pos_12,1800) ;
  es.upm.aedlib.Position<Integer> pos_14 = tree.addChildLast(pos_13,811) ;
  es.upm.aedlib.Position<Integer> pos_15 = tree.addChildLast(pos_13,850) ;
  es.upm.aedlib.Position<Integer> pos_16 = tree.addChildLast(pos_12,1765) ;
  es.upm.aedlib.Position<Integer> pos_17 = tree.addChildLast(pos_16,445) ;
  es.upm.aedlib.Position<Integer> pos_18 = tree.addChildLast(pos_16,1418) ;
  es.upm.aedlib.Position<Integer> pos_19 = tree.addChildLast(pos_12,611) ;
  es.upm.aedlib.Position<Integer> pos_20 = tree.addChildLast(pos_19,1055) ;
  es.upm.aedlib.Position<Integer> pos_21 = tree.addChildLast(pos_0,1714) ;
  es.upm.aedlib.Position<Integer> pos_22 = tree.addChildLast(pos_21,62) ;
  es.upm.aedlib.Position<Integer> pos_23 = tree.addChildLast(pos_0,7) ;
  es.upm.aedlib.Position<Integer> pos_24 = tree.addChildLast(pos_23,1872) ;
  es.upm.aedlib.Position<Integer> pos_25 = tree.addChildLast(pos_24,1360) ;
  es.upm.aedlib.Position<Integer> pos_26 = tree.addChildLast(pos_24,1838) ;
  es.upm.aedlib.Position<Integer> pos_27 = tree.addChildLast(pos_24,602) ;
  es.upm.aedlib.Position<Integer> pos_28 = tree.addChildLast(pos_23,252) ;
  es.upm.aedlib.Position<Integer> pos_29 = tree.addChildLast(pos_28,1064) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(5) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_38")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_39")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1748) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,721) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(root,1438) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_1,1193) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_2,386) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,465) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_3,1100) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_1,374) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_6,1069) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(pos_6,1370) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree.addChildLast(pos_8,1746) ;
  es.upm.aedlib.Position<Integer> pos_10 = tree.addChildLast(pos_8,441) ;
  es.upm.aedlib.Position<Integer> pos_11 = tree.addChildLast(pos_1,1849) ;
  es.upm.aedlib.Position<Integer> pos_12 = tree.addChildLast(pos_11,1926) ;
  es.upm.aedlib.Position<Integer> pos_13 = tree.addChildLast(pos_12,1920) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(5) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_39")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_40")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1270) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,772) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,373) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_1,1694) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_2,1391) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,1031) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_3,967) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_1,1423) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_1,599) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(pos_7,1877) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree.addChildLast(pos_8,1915) ;
  es.upm.aedlib.Position<Integer> pos_10 = tree.addChildLast(pos_8,1688) ;
  es.upm.aedlib.Position<Integer> pos_11 = tree.addChildLast(pos_8,780) ;
  es.upm.aedlib.Position<Integer> pos_12 = tree.addChildLast(pos_8,1520) ;
  es.upm.aedlib.Position<Integer> pos_13 = tree.addChildLast(root,420) ;
  es.upm.aedlib.Position<Integer> pos_14 = tree.addChildLast(pos_13,1265) ;
  es.upm.aedlib.Position<Integer> pos_15 = tree.addChildLast(pos_14,1821) ;
  es.upm.aedlib.Position<Integer> pos_16 = tree.addChildLast(root,1091) ;
  es.upm.aedlib.Position<Integer> pos_17 = tree.addChildLast(pos_16,925) ;
  es.upm.aedlib.Position<Integer> pos_18 = tree.addChildLast(pos_17,71) ;
  es.upm.aedlib.Position<Integer> pos_19 = tree.addChildLast(pos_18,1904) ;
  es.upm.aedlib.Position<Integer> pos_20 = tree.addChildLast(pos_19,520) ;
  es.upm.aedlib.Position<Integer> pos_21 = tree.addChildLast(pos_16,637) ;
  es.upm.aedlib.Position<Integer> pos_22 = tree.addChildLast(pos_21,787) ;
  es.upm.aedlib.Position<Integer> pos_23 = tree.addChildLast(pos_22,60) ;
  es.upm.aedlib.Position<Integer> pos_24 = tree.addChildLast(pos_23,270) ;
  es.upm.aedlib.Position<Integer> pos_25 = tree.addChildLast(pos_23,1872) ;
  es.upm.aedlib.Position<Integer> pos_26 = tree.addChildLast(pos_23,91) ;
  es.upm.aedlib.Position<Integer> pos_27 = tree.addChildLast(pos_23,1097) ;
  es.upm.aedlib.Position<Integer> pos_28 = tree.addChildLast(pos_22,1479) ;
  es.upm.aedlib.Position<Integer> pos_29 = tree.addChildLast(pos_22,420) ;
  es.upm.aedlib.Position<Integer> pos_30 = tree.addChildLast(pos_29,1387) ;
  es.upm.aedlib.Position<Integer> pos_31 = tree.addChildLast(pos_22,380) ;
  es.upm.aedlib.Position<Integer> pos_32 = tree.addChildLast(pos_21,771) ;
  es.upm.aedlib.Position<Integer> pos_33 = tree.addChildLast(pos_21,333) ;
  es.upm.aedlib.Position<Integer> pos_34 = tree.addChildLast(pos_33,1711) ;
  es.upm.aedlib.Position<Integer> pos_35 = tree.addChildLast(pos_33,1071) ;
  es.upm.aedlib.Position<Integer> pos_36 = tree.addChildLast(pos_21,1182) ;
  es.upm.aedlib.Position<Integer> pos_37 = tree.addChildLast(pos_36,648) ;
  es.upm.aedlib.Position<Integer> pos_38 = tree.addChildLast(pos_37,1704) ;
  es.upm.aedlib.Position<Integer> pos_39 = tree.addChildLast(pos_37,833) ;
  es.upm.aedlib.Position<Integer> pos_40 = tree.addChildLast(pos_37,1940) ;
  es.upm.aedlib.Position<Integer> pos_41 = tree.addChildLast(pos_36,1484) ;
  es.upm.aedlib.Position<Integer> pos_42 = tree.addChildLast(pos_41,876) ;
  es.upm.aedlib.Position<Integer> pos_43 = tree.addChildLast(pos_41,879) ;
  es.upm.aedlib.Position<Integer> pos_44 = tree.addChildLast(pos_16,1936) ;
  es.upm.aedlib.Position<Integer> pos_45 = tree.addChildLast(pos_44,1566) ;
  es.upm.aedlib.Position<Integer> pos_46 = tree.addChildLast(pos_45,1291) ;
  es.upm.aedlib.Position<Integer> pos_47 = tree.addChildLast(pos_46,1689) ;
  es.upm.aedlib.Position<Integer> pos_48 = tree.addChildLast(pos_45,404) ;
  es.upm.aedlib.Position<Integer> pos_49 = tree.addChildLast(pos_44,1094) ;
  es.upm.aedlib.Position<Integer> pos_50 = tree.addChildLast(pos_49,1123) ;
  es.upm.aedlib.Position<Integer> pos_51 = tree.addChildLast(pos_50,1508) ;
  es.upm.aedlib.Position<Integer> pos_52 = tree.addChildLast(pos_50,11) ;
  es.upm.aedlib.Position<Integer> pos_53 = tree.addChildLast(pos_50,255) ;
  es.upm.aedlib.Position<Integer> pos_54 = tree.addChildLast(pos_50,379) ;
  es.upm.aedlib.Position<Integer> pos_55 = tree.addChildLast(pos_49,740) ;
  es.upm.aedlib.Position<Integer> pos_56 = tree.addChildLast(pos_44,600) ;
  es.upm.aedlib.Position<Integer> pos_57 = tree.addChildLast(pos_44,1481) ;
  es.upm.aedlib.Position<Integer> pos_58 = tree.addChildLast(pos_57,941) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(6) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_40")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_longestPath_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(TestData.getIndividualTimeout()), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_longestPath_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_longestPath_41")) ;
if (ok_sofar)
{
  es.upm.aedlib.tree.GeneralTree<Integer> tree = new es.upm.aedlib.tree.LinkedGeneralTree<Integer>() ;
  es.upm.aedlib.Position<Integer> root = tree.addRoot(1847) ;
  es.upm.aedlib.Position<Integer> pos_0 = tree.addChildLast(root,1284) ;
  es.upm.aedlib.Position<Integer> pos_1 = tree.addChildLast(pos_0,1235) ;
  es.upm.aedlib.Position<Integer> pos_2 = tree.addChildLast(pos_0,57) ;
  es.upm.aedlib.Position<Integer> pos_3 = tree.addChildLast(pos_2,1974) ;
  es.upm.aedlib.Position<Integer> pos_4 = tree.addChildLast(pos_3,885) ;
  es.upm.aedlib.Position<Integer> pos_5 = tree.addChildLast(pos_4,1462) ;
  es.upm.aedlib.Position<Integer> pos_6 = tree.addChildLast(pos_4,1143) ;
  es.upm.aedlib.Position<Integer> pos_7 = tree.addChildLast(pos_4,934) ;
  es.upm.aedlib.Position<Integer> pos_8 = tree.addChildLast(pos_3,1673) ;
  es.upm.aedlib.Position<Integer> pos_9 = tree.addChildLast(pos_8,239) ;
  es.upm.aedlib.Position<Integer> pos_10 = tree.addChildLast(pos_8,660) ;
  es.upm.aedlib.Position<Integer> pos_11 = tree.addChildLast(pos_8,1922) ;
  es.upm.aedlib.Position<Integer> pos_12 = tree.addChildLast(root,849) ;
  es.upm.aedlib.Position<Integer> pos_13 = tree.addChildLast(pos_12,596) ;
  es.upm.aedlib.Position<Integer> pos_14 = tree.addChildLast(pos_13,294) ;
  es.upm.aedlib.Position<Integer> pos_15 = tree.addChildLast(pos_14,494) ;
  es.upm.aedlib.Position<Integer> pos_16 = tree.addChildLast(pos_15,1805) ;
  es.upm.aedlib.Position<Integer> pos_17 = tree.addChildLast(root,1306) ;
  ok_sofar = new LongestPath(tree).doCall().checkResult(6) ;
}
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
    ResultsHandler.stopTest(new String("test_longestPath_41")) ;
    ResultsHandler.add_result(new String("longestPath"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd5";
}




static class TreeLongestPath {

  static boolean checkLongestPath(LongestPath call,
                                  TestResult<PositionList<Position<Integer>>,Integer> result,
                                  Integer expected)
  {
    String callString = call.toString();
    Tree<Integer> t = call.tree;

    if (!call.noException(() -> "\nThe tree was\n"+t)) {
      return false;
    }
    
    if (!call.nonNull(() -> "\nThe tree was\n"+t)) {
      return false;
    }

    PositionList<Position<Integer>> path = result.getValue();
    
    if (path.size() != expected) {
      TestUtils.printError
	(TestUtils.ExecutionTime.DURING,
	 "the call "+callString+
	 "\nwith the tree\n"+t+
	 "\nreturned a path "+path+" of length "+path.size()+"\n"+
	 "which is different from the expected maximum path length: "+
	 expected);
      return false;
    }

    if (t.isEmpty()) return true;

    Position<Integer> treeRoot = t.root();
    Position<Integer> prevPos = path.first().element();
             
    if (treeRoot != prevPos) {
      TestUtils.printError
        (TestUtils.ExecutionTime.DURING,
         "the call "+callString+
         "\nwith the tree\n"+t+
         "\nreturned a path "+path+" whose first element "+prevPos+
         " != the expected first element "+treeRoot);
      return false;
    }

    boolean first = true;
    for (Position<Integer> pos : path) {
      if (!first) {
        if (pos == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.DURING,
             "the call "+callString+
             "\nwith the tree\n"+t+
             "\nreturned a path "+path+" which contains a null element");
          return false;
        }
        if (pos.element() == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.DURING,
             "the call "+callString+
             "\nwith the tree\n"+t+
             "\nreturned a path "+path+" which contains a position with a null element");
          return false;
        }
        boolean found = false;
        for (Position<Integer> childPos : t.children(prevPos)) {
          found = found || (childPos == pos);
        }
        if (!found) {
          TestUtils.printError
            (TestUtils.ExecutionTime.DURING,
             "the call "+callString+
             "\nwith the tree\n"+t+
             "\nreturned a path "+path+" where the path element "+pos.element()+
             " is not reachable from the previous path element "+prevPos.element());
          return false;
        }
        prevPos = pos;
      }
      first = false;
    }
    return true;
  }
    
  public static void resetPrinter() { }

  public static String printer(Object obj) {
    if (obj instanceof Tree<?>) {
      return "tree";
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

  static <E> boolean checkNull(TestCall<E,Boolean> call,
                               TestResult<E,Boolean> result,
                               Boolean expected) {
    if (expected) return call.nonNull();
    else return call.isNull();
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

  boolean isNull() {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n");
      return false;
    } else return true;
  }

  boolean isNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() != null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " should have returned null but did not\n"+
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


static class LongestPath extends TestCall<es.upm.aedlib.positionlist.PositionList<es.upm.aedlib.Position<Integer>>,Integer>
{
  es.upm.aedlib.tree.Tree<Integer> tree;
  
  public LongestPath (es.upm.aedlib.tree.Tree<Integer> tree)
  {
    this.tree = tree ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Utils.longestPath")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(tree)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.PositionList<es.upm.aedlib.Position<Integer>> call () 
  {
    return Utils.longestPath(tree) ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!TreeLongestPath.checkLongestPath(this,result,expected))
      return false ;
    return true ;
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
    TreeLongestPath.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return TreeLongestPath.printer(obj) ;
  }
  
}


}
