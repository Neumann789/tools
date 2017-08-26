package net.sf.jdec.jvminstructions.commandholders;

import net.sf.jdec.jvminstructions.commands.Fstore_2Command;
import net.sf.jdec.util.ExecutionState;

public class Fstore_2 extends AbstractInstructionCommandHolder {

	protected String getName() {
		return "Fstore_2";
	}

	protected void registerCommand() {
		setCommand(new Fstore_2Command(ExecutionState.getMethodContext()));
	}

}
