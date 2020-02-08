public class S2opened implements IDoorState {
    @Override
    public void cycleState(Door door) {
        door.setDoorState(new S0inactive());
    }

    @Override
    public void updateSensor(Door door) {
        for (IDoorListener listener:door.getListenerList()
             ) {
            System.out.println("Sensor: *beep*");
            listener.doorOpened();
        }

    }
}
