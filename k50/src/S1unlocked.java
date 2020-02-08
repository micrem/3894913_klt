public class S1unlocked implements IDoorState {
    @Override
    public void cycleState(Door door) {
        door.setDoorState(new S2opened());
    }

    @Override
    public void updateSensor(Door door) {

    }
}
