package doors;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class Door {
    private Boolean isOpen;

    public Door() {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void toggle() {
        this.isOpen = !this.isOpen;
    }
}
