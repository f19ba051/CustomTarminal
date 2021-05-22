package terminal.custom;

import java.util.*;

public class TerminalApplication {
    private static Scanner sc = new Scanner(System.in);
    private static String querySyntax;

    public static void run() {
        System.out.println("> ");

        try {
            query();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void query() throws Exception {
        CommandNode commandNode = new CommandNode();
        Context context = new Context(sc.nextLine());
        commandNode.parse(context);
    }
}
