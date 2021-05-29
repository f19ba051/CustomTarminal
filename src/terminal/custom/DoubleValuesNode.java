package terminal.custom;

public class DoubleValuesNode extends Node {
    private String value1;
    private String value2;

    @Override
    public void parse(Context context) throws Exception {
        value1 = context.getCurrentToken();
        context.skipToken(value1);
        value2 = context.getCurrentToken();
        context.skipToken(value2);

    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}
