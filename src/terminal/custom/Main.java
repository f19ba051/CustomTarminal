package terminal.custom;

import terminal.custom.commands.Add;

public class Main {

    public static void main(String[] args) throws Exception {
        Command.valueOf("add").ifPresent(System.out::println);
    }
}
