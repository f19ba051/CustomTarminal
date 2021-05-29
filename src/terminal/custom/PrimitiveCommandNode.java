package terminal.custom;

import java.util.InputMismatchException;

public class PrimitiveCommandNode extends Node {

    @Override
    public void parse(Context context) throws Exception {
        System.out.println("primitive command node : " + context.getCurrentToken());
        Command primitiveCommand = Command.valueOf(context.getCurrentToken())
                .orElseThrow(() -> new InputMismatchException(""));

        context.nextToken();
        primitiveCommand.getUsingNode().parse(context);
        primitiveCommand.run();
    }
}
