public class S1Park implements ILightState {

    @Override
    public void switchLight(Light light) {
        light.setState(new S2Lowbeam());
    }
}
