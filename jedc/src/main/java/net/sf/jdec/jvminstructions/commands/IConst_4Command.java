package net.sf.jdec.jvminstructions.commands;

import net.sf.jdec.core.Operand;
import net.sf.jdec.core.OperandStack;
import net.sf.jdec.reflection.Behaviour;

public class IConst_4Command extends AbstractInstructionCommand {

	public IConst_4Command(Behaviour context) {
		super(context);

	}

	public int getSkipBytes() {
		return 0;
	}

	public void execute() {
		OperandStack opStack = getStack();
		Operand op = new Operand();
		op.setOperandValue("4");
		boolean r = false;// checkIFLoadInstIsPartOFTernaryCond(currentForIndex);
		if (r) {
			if (opStack.size() > 0) {
				java.lang.String str = opStack.getTopOfStack()
						.getOperandValue();
				str = str + op.getOperandValue();
				op.setOperandValue(str);
			}
		}
		opStack.push(op);
	}

}
