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

        if (!value1.chars().allMatch(Character::isDigit)) {
            throw new Exception(value1 + "is undefined.");
        }
        else if (!value2.chars().allMatch(Character::isDigit)) {
            throw new Exception(value2 + "is undefined.");
        }
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}
