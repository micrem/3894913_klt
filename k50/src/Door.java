import java.util.ArrayList;

public class Door {
    Button button;
    IDoorState doorState;
    ArrayList<IDoorListener> listenerList = new ArrayList<IDoorListener>();

    public void cycleState() {
        System.out.print(this + " switching from "+this.doorState +" to ");
        doorState.cycleState(this);
        System.out.println(doorState+ " and updating Sensor.");
        doorState.updateSensor(this);
    }

    public Door() {
        this.doorState = new S0inactive();
    }

    public void setDoorState(IDoorState doorState) {
        this.doorState = doorState;
    }

    public ArrayList<IDoorListener> getListenerList() {
        return listenerList;
    }

    public void removeListener(IDoorListener listener){
        listenerList.remove(listener);
    }

    public void addListener(IDoorListener listener){
        listenerList.add(listener);
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
