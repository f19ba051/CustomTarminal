package terminal.custom;

import terminal.custom.commands.Add;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveCommandList {
    public static List<Commands> commandsList = new ArrayList<>();

    public static Commands valueOf(String value) throws Exception {
        return commandsList.stream()
                .filter(e -> e.getCommandName().equals(value))
                .findFirst().orElseThrow(() -> new Exception("存在しないコマンドです"));
    }

    public static void add(Class<? extends Commands> command) {
        Commands newCommands = command.cast(Commands.class);

        commandsList.add(newCommands);
    }

}
