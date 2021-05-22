package terminal.custom;

import terminal.custom.commands.Add;

public class Main {

    public static void main(String[] args) {
        System.out.println(PrimitiveCommandList.commandsList);
        TerminalApplication.run();
    }
}
