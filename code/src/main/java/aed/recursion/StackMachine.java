package aed.recursion;

import es.upm.aedlib.map.*;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.lifo.*;

public class StackMachine {
    Map<String, PositionList<Instruction>> code;
    LIFO<Integer> stack;

    public StackMachine(Map<String, PositionList<Instruction>> code) {
        this.stack = new LIFOArray<>();
        this.code = code;
    }

    public void run(String name) {
        if (code.containsKey(name)) {
            int ret = 0;
            PositionList<Instruction> prog = code.get(name);
            Position<Instruction> cursorProg = prog.first();
            while (cursorProg != null && ret != -1) {
                for (int i = 0; i < ret; i++) {
                   cursorProg = prog.next(cursorProg);
                } 
                ret = execute(cursorProg, prog);
            }
        }
    }

    private int execute(Position<Instruction> cursorProg, PositionList<Instruction> prog) {
        switch (cursorProg.element().getInstType()) {
            case CALL:
                this.run(cursorProg.element().getNameParm());
                break;
            case RET:
                return -1;
            case PUSH:
                stack.push(cursorProg.element().getIntParm());
                break;
            case PRINT:
                System.out.println(stack.pop());
                break;
            case ADD:
                stack.push(stack.pop() + stack.pop());
                break;
            case DROP:
                stack.pop();
                break;
            case DUP:
                Integer temp = stack.pop();
                stack.push(temp);
                stack.push(temp);
                break;
            case EQ:
                Integer tempEq1 = stack.pop();
                Integer tempEq2 = stack.pop();
                Integer eq = tempEq1.equals(tempEq2) ? (Integer) 1 : (Integer) 0;
                stack.push(eq);
                break;
            case MULT:
                stack.push(stack.pop() * stack.pop());
                break;
            case IF_SKIP:
                if (!stack.pop().equals((Integer) 0))
                    return cursorProg.element().getIntParm();
                break;
            case SUB:
                stack.push(stack.pop() - stack.pop());
                break;
            case SWAP:
                Integer temp1 = stack.pop();
                Integer temp2 = stack.pop();
                stack.push(temp1);
                stack.push(temp2);
                break;
            default:
                break;
        }
        return 1;
    }

    public static void main(String[] args) {
        Map<String, PositionList<Instruction>> code = new HashTableMap<>();
        Instruction[] main = new Instruction[] {
                new Instruction(Instruction.InstType.PUSH, 5), new Instruction(Instruction.InstType.CALL, "factorial"),
                new Instruction(Instruction.InstType.RET)
        };
        Instruction[] factorial = new Instruction[] {
                new Instruction(Instruction.InstType.DUP), new Instruction(Instruction.InstType.PUSH, 1),
                new Instruction(Instruction.InstType.EQ), new Instruction(Instruction.InstType.IF_SKIP, 8) // 1+7
                // ELSE PART
                , new Instruction(Instruction.InstType.DUP), new Instruction(Instruction.InstType.PUSH, 1),
                new Instruction(Instruction.InstType.SWAP), new Instruction(Instruction.InstType.SUB),
                new Instruction(Instruction.InstType.CALL, "factorial"), new Instruction(Instruction.InstType.MULT),
                new Instruction(Instruction.InstType.RET)
                // THEN PART
                , new Instruction(Instruction.InstType.DROP), new Instruction(Instruction.InstType.PUSH, 1),
                new Instruction(Instruction.InstType.RET)
        };
        code.put("main", new NodePositionList<>(main));
        code.put("factorial", new NodePositionList<>(factorial));
        StackMachine sm = new StackMachine(code);
        sm.run("main");
    }

}
