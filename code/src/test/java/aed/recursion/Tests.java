package aed.recursion;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;

import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.lifo.*;


public class Tests {
  
  @BeforeAll
  public static void init () 
  {
    TesterLab4.TestUtils.reportPid() ;
    TesterLab4.ResultsHandler.init() ;
    TesterLab4.ResultsHandler.setNumTestsRemaining(13,60) ;
    TesterLab4.TestData.setTesterType(true) ;
  }

  @AfterAll
  public static void reportResults () 
  {
    TesterLab4.ResultsHandler.report_results() ;
  }

  @Test 
  public void test_SM_PUSH_ADD()
  {
    String testName = "test_SM_PUSH_ADD";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.ADD),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {5}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_SUB1()
  {
    String testName = "test_SM_SUB1";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.SUB),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {1}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_SUB2()
  {
    String testName = "test_SM_SUB2";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,1),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.SUB),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {1,-1}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_MULT()
  {
    String testName = "test_SM_MULT";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.MULT),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {6}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_DUP()
  {
    String testName = "test_SM_DUP";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.DUP),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {2,2}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_PRINT()
  {
    String testName = "test_SM_PRINT";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.PRINT),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {2}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_DROP()
  {
    String testName = "test_SM_DROP";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.DROP),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {2}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_SWAP()
  {
    String testName = "test_SM_SWAP";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.PUSH,4),
                 new Instruction(Instruction.InstType.SWAP),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {2,4,3}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_EQ1()
  {
    String testName = "test_SM_EQ1";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.PUSH,4),
                 new Instruction(Instruction.InstType.EQ),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {2,0}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_EQ2()
  {
    String testName = "test_SM_EQ2";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,4),
                 new Instruction(Instruction.InstType.PUSH,4),
                 new Instruction(Instruction.InstType.EQ),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {2,1}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_CALL1()
  {
    String testName = "test_SM_CALL1";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,1),
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,4),
                 new Instruction(Instruction.InstType.PUSH,6),
                 new Instruction(Instruction.InstType.CALL,"m1"),
                 new Instruction(Instruction.InstType.RET)
               }));
            m.put
              ("m1",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.ADD),
                 new Instruction(Instruction.InstType.CALL,"m2"),
                 new Instruction(Instruction.InstType.RET)
               }));
            m.put
              ("m2",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.SUB),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {1,8}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_CALL2()
  {
    String testName = "test_SM_CALL2";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> m = new HashTableMap<>();
            m.put
              ("main",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,4),
                 new Instruction(Instruction.InstType.PUSH,6),
                 new Instruction(Instruction.InstType.CALL,"m1"),
                 new Instruction(Instruction.InstType.RET)
               }));
            m.put
              ("m1",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.PUSH,0),
                 new Instruction(Instruction.InstType.PUSH,3),
                 new Instruction(Instruction.InstType.PUSH,2),
                 new Instruction(Instruction.InstType.PUSH,6),
                 new Instruction(Instruction.InstType.ADD),
                 new Instruction(Instruction.InstType.CALL,"m2"),
                 new Instruction(Instruction.InstType.RET)
               }));
            m.put
              ("m2",
               new NodePositionList<>
               (new Instruction[] {
                 new Instruction(Instruction.InstType.SUB),
                 new Instruction(Instruction.InstType.RET)
               }));
            StackMachine sm = new StackMachine(m);
            sm.run("m1");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {0,5}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }
  
  @Test 
  public void test_SM_Factorial()
  {
    String testName = "test_SM_Factorial";
    try
      {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
            TesterLab4.ResultsHandler.startTest(testName);
            Map<String,PositionList<Instruction>> code = new HashTableMap<>();
            Instruction[] main = new Instruction[] {
              new Instruction(Instruction.InstType.PUSH,5)
              ,new Instruction(Instruction.InstType.CALL,"factorial")
              ,new Instruction(Instruction.InstType.RET)
            };
            Instruction[] factorial = new Instruction[] {
              new Instruction(Instruction.InstType.DUP)
              ,new Instruction(Instruction.InstType.PUSH,1)
              ,new Instruction(Instruction.InstType.EQ)
              ,new Instruction(Instruction.InstType.IF_SKIP,8) // 1+7
              // ELSE PART
              ,new Instruction(Instruction.InstType.DUP)
              ,new Instruction(Instruction.InstType.PUSH,1)
              ,new Instruction(Instruction.InstType.SWAP)
              ,new Instruction(Instruction.InstType.SUB)
              ,new Instruction(Instruction.InstType.CALL,"factorial")
              ,new Instruction(Instruction.InstType.MULT)
              ,new Instruction(Instruction.InstType.RET)
              // THEN PART
              ,new Instruction(Instruction.InstType.DROP)
              ,new Instruction(Instruction.InstType.PUSH,1)
              ,new Instruction(Instruction.InstType.RET)
            };
            code.put("main",new NodePositionList<>(main));
            code.put("factorial",new NodePositionList<>(factorial));
            StackMachine sm = new StackMachine(code);
            sm.run("main");
            checkStack(testName, new LIFOList<Integer>(new Integer[] {120}), sm.stack);
          },
          "*** TIMEOUT! Very slow or non-terminating execution of "+testName
          ) ;
      }
    catch ( Throwable exc )
      {
        TesterLab4.ResultsHandler.stopTest(testName);
        TesterLab4.ResultsHandler.add_result("StackMachine",false) ;
        if (!(exc instanceof org.opentest4j.AssertionFailedError))
          System.out.println("Internal testing error when executing "+testName+":\n"+exc);
        throw exc;
      }
  }

  static void checkStack(String testName, LIFO<Integer> expected, LIFO<Integer> stack) {
    String msg =
      "\n********************************\n"+
      "*** Error in "+testName+":\n\nafter executing "+testName+" the stack should be "+expected+" but is "+stack;
    if (!expected.equals(stack)) {
      System.out.println(msg);
      assertEquals(expected, stack, msg);
    } else {
       TesterLab4.ResultsHandler.stopTest(testName);
       TesterLab4.ResultsHandler.add_result("StackMachine",true) ;
    }
  }
  
}

