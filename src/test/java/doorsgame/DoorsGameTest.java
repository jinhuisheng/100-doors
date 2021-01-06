package doorsgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static doorsgame.Status.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class DoorsGameTest {

    private DoorsGame doorsGame;

    @BeforeEach
    void setUp() {
        doorsGame = new DoorsGame(10);
    }

    @Test
    void should_init_10_doors() {
        List<Status> statuses = doorsGame.getDoorStatuses();
        Status[] expected = {CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE, CLOSE};
        assertDoorStatuses(doorsGame.getDoorStatuses(), expected);

        for (Status status : statuses) {
            assertThat(status).isEqualTo(CLOSE);
        }
    }

    @Test
    void visit_doors_1_times() {
        doorsGame.visit(1);
        List<Status> statuses = doorsGame.getDoorStatuses();
        Status[] expected = {OPEN, OPEN, OPEN, OPEN, OPEN, OPEN, OPEN, OPEN, OPEN, OPEN};
        assertDoorStatuses(doorsGame.getDoorStatuses(), expected);
    }

    @Test
    void visit_doors_2_times() {
        doorsGame.visit(2);
        Status[] expected = {OPEN, CLOSE, OPEN, CLOSE, OPEN, CLOSE, OPEN, CLOSE, OPEN, CLOSE};
        assertDoorStatuses(doorsGame.getDoorStatuses(), expected);
    }

    @Test
    void visit_doors_3_times() {
        doorsGame.visit(3);
        Status[] expected = {OPEN, CLOSE, CLOSE, CLOSE, OPEN, OPEN, OPEN, CLOSE, CLOSE, CLOSE};
        assertDoorStatuses(doorsGame.getDoorStatuses(), expected);
    }

    @Test
    void visit_doors_4_times() {
        doorsGame.visit(4);
        Status[] expected = {OPEN, CLOSE, CLOSE, OPEN, OPEN, OPEN, OPEN, OPEN, CLOSE, CLOSE};
        assertDoorStatuses(doorsGame.getDoorStatuses(), expected);
    }

    @Test
    void visit_doors_10_times() {
        doorsGame.visit(10);
        Status[] expected = {OPEN, CLOSE, CLOSE, OPEN, CLOSE, CLOSE, CLOSE, CLOSE, OPEN, CLOSE};
        assertDoorStatuses(doorsGame.getDoorStatuses(), expected);
    }

    private void assertDoorStatuses(List<Status> statuses, Status[] expected) {
        for (int i = 0; i < statuses.size(); i++) {
            assertThat(statuses.get(i)).isEqualTo(expected[i]);
        }
    }

}
