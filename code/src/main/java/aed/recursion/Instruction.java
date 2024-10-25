package aed.recursion;

public class Instruction {
  enum InstType { CALL, RET, PUSH, PRINT, ADD, DROP, DUP, EQ, MULT, IF_SKIP, SUB, SWAP };
  
  private InstType instType;
  private String nameParm;
  private int intParm;

  public Instruction(InstType instType, String nameParm, int intParm) {
    this.instType = instType;
    this.nameParm = nameParm;
    this.intParm = intParm;
  }

  public Instruction(InstType instType, String nameParm) {
    this(instType, nameParm, 0);
  }

  public Instruction(InstType instType, int intParm) {
    this(instType, null, intParm);
  }

  public Instruction(InstType instType) {
    this(instType, null, 0);
  }

  public InstType getInstType() { return this.instType; }
  public String getNameParm() { return nameParm; }
  public int getIntParm() { return intParm; }

  public String toString() {
    switch (getInstType()) {
    case CALL: return "CALL" + " " + getNameParm();
    case RET: return "RET";
    case PUSH: return "PUSH" + " " + getIntParm();
    case PRINT: return "PRINT";
    case ADD: return "ADD";
    case DROP: return "DROP";
    case DUP: return "DUP";
    case EQ: return "EQ";
    case MULT: return "MULT";
    case IF_SKIP: return "IF_SKIP" + " " + getIntParm();
    case SUB: return "SUB";
    case SWAP: return "SWAP";
    }
    return "ILLEGAL INSTRUCTION";
  }
}
