public class S0inactive implements IDoorState {

    @Override
    public void cycleState(Door door) {
        door.setDoorState(new S1unlocked());
    }

    @Override
    public void updateSensor(Door door) {

    }
}
