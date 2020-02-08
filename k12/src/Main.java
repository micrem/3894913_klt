public class Main {

    public static void main(String[] args) {

        Light lightLeft = new Light();
        Light lightRight = new Light();

        Car car = new Car();
        car.setLights(lightLeft,lightRight);
        car.setDashboard(new DashBoard());
        car.getDashboard().setCommand(new LightSwitchCommand(lightLeft,lightRight));

        car.getDashboard().pressLightSwitch();
        car.getDashboard().pressLightSwitch();
        car.getDashboard().pressLightSwitch();
        car.getDashboard().pressLightSwitch();
    }
}
