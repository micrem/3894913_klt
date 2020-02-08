public class Car {
    private Light lightLeft;
    private Light lightRight;
    private DashBoard dashboard;

    public Light[] getLights() {
        Light[] lights = new Light[2];
        lights[0]=lightLeft;
        lights[1]=lightRight;
        return lights;
    }

    public void setLights(Light lightLeft, Light lightRight) {
        this.lightLeft = lightLeft;
        this.lightRight = lightRight;
    }

    public DashBoard getDashboard() {
        return dashboard;
    }

    public void setDashboard(DashBoard dashboard) {
        this.dashboard = dashboard;
    }
}
