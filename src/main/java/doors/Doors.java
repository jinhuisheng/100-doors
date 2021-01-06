package doors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class Doors {
    private List<Door> doors;

    public Doors(int doorCount) {
        doors = IntStream.range(0, doorCount).boxed().map(i -> new Door()).collect(Collectors.toList());

    }

    public Door get(int doorNumber) {
        return doors.get(doorNumber - 1);
    }

    public void visit(int times) {
        for (int visitTimes = 1; visitTimes <= times; visitTimes++) {
            for (int index = 0; index < doors.size(); index++) {
                toggleDoors(visitTimes, index);
            }
        }
    }

    private void toggleDoors(int times, int currentDoorIndex) {
        if ((currentDoorIndex + 1) % times == 0) {
            doors.get(currentDoorIndex).toggle();
        }
    }
}
