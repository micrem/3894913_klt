public class EmergencyExit {
    private Door door = new Door();


    public EmergencyExit() {
        door.setButton(new Button());
        door.getButton().setDoor(door);
    }

    public Door getDoor() {
        return door;
    }

}
