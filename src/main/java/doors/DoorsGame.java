package doors;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class DoorsGame {
    public static void main(String[] args) {
        Doors doors = new Doors(100);
        doors.visit(100);
        for (int i = 1; i <= 100; i++) {
            System.out.println(String.format("door number:%s,door is open:%s", i, doors.get(i).isOpen()));
        }
    }
}
