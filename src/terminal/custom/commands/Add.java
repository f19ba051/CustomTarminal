package terminal.custom.commands;

import terminal.custom.Commands;
import terminal.custom.PrimitiveCommandList;

import java.util.List;

public class Add extends Commands {
    private static Add add = new Add();

    private Add() {
        PrimitiveCommandList.add(Add.class);
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
