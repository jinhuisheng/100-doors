package doorsgame;

import java.util.List;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class DoorsConsole {
    public static void main(String[] args) {
        DoorsGame doorsGame = new DoorsGame(100);
        doorsGame.visit(100);
        List<Status> doorStatuses = doorsGame.getDoorStatuses();
        for (int i = 0; i < doorStatuses.size(); i++) {
            System.out.println(String.format("the %s door status is %s", i + 1, doorStatuses.get(i).toString()));
        }
    }
}
