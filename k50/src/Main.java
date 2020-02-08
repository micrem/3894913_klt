public class Main {
    public static void main(String[] args) {
        EmergencyExit emergencyExit = new EmergencyExit();
        emergencyExit.getDoor().addListener(new SecurityOfficer());
        emergencyExit.getDoor().getButton().press();
        emergencyExit.getDoor().getButton().press();
        emergencyExit.getDoor().getButton().press();
        emergencyExit.getDoor().getButton().press();
    }
}
