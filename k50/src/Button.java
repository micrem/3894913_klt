public class Button {
    private Door door;
    public void press(){
        door.cycleState();
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
