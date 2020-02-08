public class DashBoard {
    private ICommand command;
    public void pressLightSwitch(){
        command.switchLights();
    }

    public ICommand getCommand() {
        return command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }
}
