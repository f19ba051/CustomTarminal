package terminal.custom.commands;

import terminal.custom.Command;
import terminal.custom.DoubleValuesNode;

public class Add extends Command {

    public Add() {
        commandName = "add";
        usingNode = new DoubleValuesNode();
    }

    public String run() {
        System.out.println(
                Integer.parseInt(
                        ((DoubleValuesNode) usingNode).getValue1()) +
                        Integer.parseInt(
                                ((DoubleValuesNode) usingNode).getValue2()));
        return "";
    }
}
