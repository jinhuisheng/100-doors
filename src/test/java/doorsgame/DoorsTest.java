package doorsgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static doorsgame.DoorStatus.*;
import static doorsgame.DoorStatus.CLOSE;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class DoorsTest {

    private Doors doors;

    @BeforeEach
    void setUp() {
        doors = new Doors();
    }

    @Test
    void init_doors() {
        assertThat(doors.count()).isEqualTo(100);
        List<DoorStatus> statuses = doors.getStatuses();
        List<DoorStatus> expected = IntStream.range(0, 100).boxed().map(i -> CLOSE).collect(Collectors.toList());
        assertThat(statuses).isEqualTo(expected);
    }

    @Test
    void first_visit() {
        doors.visit(1);
        List<DoorStatus> statuses = doors.getStatuses();
        List<DoorStatus> expected = IntStream.range(0, 100).boxed().map(i -> OPEN).collect(Collectors.toList());
        assertThat(statuses).isEqualTo(expected);
    }

    @Test
    void visit_twice() {
        int times = 2;
        doors.visit(times);
        List<DoorStatus> statuses = doors.getStatuses();
        for (int index = 1; index <= 100; index++) {
            int doorNumber = index * times;
            if (doorNumber <= 100) {
                assertThat(statuses.get(doorNumber - 1)).isEqualTo(CLOSE);
            }
        }
        assertThat(statuses.get(99)).isEqualTo(CLOSE);
    }

    @Test
    void visit_third() {
        int times = 3;
        doors.visit(times);
        List<DoorStatus> statuses = doors.getStatuses();
        for (int index = 1; index <= 100; index++) {
            int doorNumber = index * times;
            if (doorNumber <= 100) {
                if (doorNumber % 2 == 0) {
                    assertThat(statuses.get(doorNumber - 1)).isEqualTo(OPEN);
                } else {
                    assertThat(statuses.get(doorNumber - 1)).isEqualTo(CLOSE);
                }
            }
        }
    }

}
