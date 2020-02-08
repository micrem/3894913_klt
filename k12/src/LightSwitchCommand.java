public class LightSwitchCommand implements ICommand {
    private Light light1;
    private Light light2;
    @Override
    public void switchLights() {
        light1.switchLight();
        light2.switchLight();
    }

    public LightSwitchCommand(Light light1, Light light2) {
        this.light1 = light1;
        this.light2 = light2;
    }
}
