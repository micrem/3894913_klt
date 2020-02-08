public class S3Highbeam implements ILightState {
    @Override
    public void switchLight(Light light) {
        light.setState(new S0LightsOut());
    }
}
