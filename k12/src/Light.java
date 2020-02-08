public class Light {

    public ILightState state;

    public void switchLight(){
        System.out.print(this + " switching from "+this.getState() +" to ");
        state.switchLight(this);
        System.out.println(getState());
    }

    public ILightState getState() {
        return state;
    }

    public void setState(ILightState state) {
        this.state = state;
    }

    public Light() {
        this.state = new S0LightsOut();
    }
}
