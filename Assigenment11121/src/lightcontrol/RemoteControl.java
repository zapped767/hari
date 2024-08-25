package lightcontrol;

public class RemoteControl {
    private Command[] commands;
    private Command lastCommand;

    public RemoteControl(int numSlots) {
        commands = new Command[numSlots];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
            lastCommand = commands[slot];
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("No command to undo");
        }
    }
}


