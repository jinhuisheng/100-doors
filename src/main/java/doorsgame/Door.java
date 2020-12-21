package doorsgame;

public class Door {
    private DoorStatus status;

    public Door() {
        status = DoorStatus.CLOSE;
    }

    public DoorStatus status() {
        return status;
    }

    public void toggle() {
        if (status == DoorStatus.CLOSE) {
            status = DoorStatus.OPEN;
        } else {
            status = DoorStatus.CLOSE;
        }
    }
}
