package terminal.custom.commands;

import terminal.custom.Command;

import java.util.List;

public class Add extends Command {

    public Add() {
        commandName = "add";
        System.out.println("aaa");
    }

    public String run(List<String> args) {
        if (args.size() == 3) {
            return args.get(1) + args.get(2);
        }
        else {
            return "文法が間違っています。\nadd <num1> <num2>";
        }
    }
}
