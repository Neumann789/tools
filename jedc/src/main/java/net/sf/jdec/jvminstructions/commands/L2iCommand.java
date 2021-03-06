package net.sf.jdec.jvminstructions.commands;

import net.sf.jdec.core.Operand;
import net.sf.jdec.core.OperandStack;
import net.sf.jdec.reflection.Behaviour;

public class L2iCommand extends AbstractInstructionCommand {

	public L2iCommand(Behaviour context) {
		super(context);

	}

	public int getSkipBytes() {
		return 0;
	}

	public void execute() {
		OperandStack opStack = getStack();
		Operand operand=opStack.getTopOfStack();
        operand.setOperandValue("(int)"+"("+operand.getOperandValue()+")");
        boolean r=false;//checkIFLoadInstIsPartOFTernaryCond(currentForIndex);
        if(r){
            if(opStack.size() > 0){
                java.lang.String str=opStack.getTopOfStack().getOperandValue();
                str=str+operand.getOperandValue();
                operand.setOperandValue(str);
            }
        }
        
        opStack.push(operand);
	}

}
