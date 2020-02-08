public class S0LightsOut implements ILightState {
    @Override
    public void switchLight(Light light) {
        light.setState(new S1Park());
    }
}
