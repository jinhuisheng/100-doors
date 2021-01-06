package doors;

import java.util.List;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class DoorsGame {
    public static void main(String[] args) {
        Doors doors = new Doors(100);
        doors.visit(100);
        List<Status> doorStatuses = doors.getDoorStatuses();
        for (int i = 0; i < doorStatuses.size(); i++) {
            System.out.println(String.format("the %s door status is %s", i + 1, doorStatuses.get(i).toString()));
        }
    }
}
