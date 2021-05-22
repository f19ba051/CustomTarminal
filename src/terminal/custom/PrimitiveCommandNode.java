package terminal.custom;

import terminal.custom.commands.Add;

public class PrimitiveCommandNode extends Node {

    @Override
    public void parse(Context context) throws Exception {
        Commands command = PrimitiveCommandList.valueOf(context.getCurrentToken());
        context.skipToken(command.getCommandName());
        command.getClass().cast(command);
    }
}
