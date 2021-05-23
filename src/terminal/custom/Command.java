package terminal.custom;

public abstract class Command {
    protected String commandName;

    public String getCommandName() {
        return commandName;
    }

    //commandNameに応じたインスタンスを生成し、返す
    public static Command valueOf(String commandName) throws Exception {
        return Class.forName(Command.class.getPackageName() + ".commands."
                    + commandName.substring(0,1).toUpperCase() + commandName.substring(1))
                .asSubclass(Command.class)
                .getDeclaredConstructor()
                .newInstance();
    }
}
