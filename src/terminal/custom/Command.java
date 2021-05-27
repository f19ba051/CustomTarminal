package terminal.custom;

import java.lang.reflect.InvocationTargetException;
import java.util.InputMismatchException;
import java.util.Optional;

public abstract class Command {
    protected String commandName;
    protected Node usingNode;

    public String getCommandName() {
        return commandName;
    }

    public Node getUsingNode() {
        return usingNode;
    }

    public abstract String run();

    //commandNameに応じたインスタンスを生成し、返す
    public static Optional<Command> valueOf(String commandName) {
        try {
            return Optional.of(Class.forName(Command.class.getPackageName() + ".commands."
                    + commandName.substring(0, 1).toUpperCase() + commandName.substring(1).toLowerCase())
                    .asSubclass(Command.class)
                    .getDeclaredConstructor()
                    .newInstance());
        }
        catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new InputMismatchException("そのコマンドは存在しません");
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
