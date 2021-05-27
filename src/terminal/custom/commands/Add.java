package terminal.custom.commands;

import terminal.custom.Command;
import terminal.custom.DoubleValuesNode;

public class Add extends Command {

    public Add() {
        commandName = "add";
        usingNode = new DoubleValuesNode();

        System.out.println("aaa");
    }

    public String run() {
        return String.valueOf(
                Integer.parseInt(
                    ((DoubleValuesNode) usingNode).getValue1()) +
                Integer.parseInt(
                        ((DoubleValuesNode) usingNode).getValue2()));
    }
}
