package terminal.custom;

public class CommandNode extends Node {

    private Node primitiveCommandNode;
    @Override
    public void parse(Context context) throws Exception {
        context.skipToken("/");
        primitiveCommandNode = new PrimitiveCommandNode();
        primitiveCommandNode.parse(context);
    }
}
