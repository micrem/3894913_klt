public class S2Lowbeam implements ILightState {
    @Override
    public void switchLight(Light light) {
        light.setState(new S3Highbeam());
    }
}
