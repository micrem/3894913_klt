public class SecurityOfficer implements IDoorListener {

    @Override
    public void doorOpened() {
        System.out.println("Security Officer: '..probably just the wind'");
    }
}
