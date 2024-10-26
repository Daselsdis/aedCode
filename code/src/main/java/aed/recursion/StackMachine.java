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
            PositionList<Instruction> prog = code.get(name);
            runRecusion(0, prog, prog.first());
        }
    }

    /**
     * @implNote
     *           The setup case is ret = 0, prog is whichever instruction set is
     *           loaded, and cursorProg is the first of these. The first run
     *           through, we don't skip the first instruction by advancing the
     *           cursor by ret, as ret = 0. Then, the instruction at the cursor is
     *           executed, and the amount to increase the cursor by, passed through
     *           ret to the next iteration. The next iteration will only come if
     *           after advancing the cursor ret times during this iteration, it
     *           still points to something, and if ret isn't -1, which is the code
     *           I've designed for when we must terminate a subrutine and return to
     *           the previous run instance, which will happen if we don't go to the
     *           next iteration.
     * @param ret
     *                   The number of times to advance the cursor, given by
     *                   previous iterations's instruction execution. To start, it
     *                   must be 0.
     * @param prog
     *                   The PositionList of Instructions oevr which we advance the
     *                   cursor.
     * @param cursorProg
     *                   The current program cursor, it's advanced by ret at the
     *                   start of every iteration.
     */
    private void runRecusion(int ret, PositionList<Instruction> prog, Position<Instruction> cursorProg) {
        cursorProg = advanceCursor(0, ret, cursorProg, prog);
        ret = execute(cursorProg.element());
        if (cursorProg != null && ret != -1)
            runRecusion(ret, prog, cursorProg);
    }

    /**
     * @implNote
     *           It returns a call to itself with i+1 while (i < ret) as a recursive
     *           case, and cursorProg elsewise as an end case. It's starting case is
     *           the current cursorProg, current Prog, current ret value to advance,
     *           and i = 0.
     * @param i
     *                   The iteration number, by which we advance the iteration.
     *                   Must be 0 when the function if called the first time.
     * @param ret
     *                   The number of times to advance the cursor, given by the
     *                   previous instuction's execution, thus the name res.
     * @param cursorProg
     *                   The current Program cursor, which is the variable we
     *                   advance and ultimately return.
     * @param prog
     *                   The PositionList of Instructions over which we advance the
     *                   cursor.
     * @return
     *         cursorProg after advancing it ret times(in case i starts as 0).
     */
    private Position<Instruction> advanceCursor(int i, int ret, Position<Instruction> cursorProg,
            PositionList<Instruction> prog) {
        if (i < ret) {
            cursorProg = prog.next(cursorProg);
            return advanceCursor(i + 1, ret, cursorProg, prog);
        } else
            return cursorProg;
    }

    /**
     * 
     * @param ins
     *            The instruction under the current cursor.
     * @return
     *         The return value is used both as the ammount of instructions to
     *         advance (default 1, and with if_next, the passed value), and also as
     *         the return order to stop current subrutine and return (-1)
     */
    private int execute(Instruction ins) {
        switch (ins.getInstType()) {
            case CALL:
                this.run(ins.getNameParm());
                break;
            case RET:
                return -1;
            case PUSH:
                stack.push(ins.getIntParm());
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
                    return ins.getIntParm(); // extra amount to advance the cursor by
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
        return 1; // Regular amount to advance the cursor by
    }
}
