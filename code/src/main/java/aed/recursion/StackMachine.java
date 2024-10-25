package aed.recursion;

import es.upm.aedlib.map.*;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.lifo.*;

public class StackMachine {
  Map<String,PositionList<Instruction>> code;
  LIFO<Integer> stack;

  public StackMachine(Map<String,PositionList<Instruction>> code) {
    this.stack = new LIFOArray<>();
    this.code = code;
  }

  public void run(String name) {
  }

}

