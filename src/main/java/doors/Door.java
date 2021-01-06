package doors;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class Door {
    private Status status;

    public Door() {
        status = Status.CLOSE;
    }

    public Status getStatus() {
        return status;
    }


    public void toggle() {
        status = status == Status.CLOSE ? Status.OPEN : Status.CLOSE;
    }
}
