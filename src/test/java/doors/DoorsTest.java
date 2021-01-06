package doors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoorsTest {
    @Test
    void should_init_10_doors() {
        Doors doors = new Doors(10);
        for (int i = 1; i <= 10; i++) {
            assertThat(doors.get(i).isOpen()).isEqualTo(false);
        }
    }

    @Test
    void visit_10_doors_once() {
        Doors doors = new Doors(10);
        doors.visit(1);
        for (int i = 1; i <= 10; i++) {
            assertThat(doors.get(i).isOpen()).isEqualTo(true);
        }
    }

    @Test
    void visit_10_doors_twice() {
        Doors doors = new Doors(10);
        doors.visit(2);
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                assertThat(doors.get(i).isOpen()).isEqualTo(false);
            } else {
                assertThat(doors.get(i).isOpen()).isEqualTo(true);
            }
        }
    }

    /**
     * 1 open
     * 2 close
     * 3 open  -> close
     * 4 close -> open
     * 5 open
     * 6 close -> open
     * 7 open
     * 8 close ->open
     * 9 open  -> close
     * 10 close
     */
    @Test
    void visit_10_doors_three_times() {
        Doors doors = new Doors(10);
        doors.visit(3);
        assertThat(doors.get(1).isOpen()).isEqualTo(true);
        assertThat(doors.get(2).isOpen()).isEqualTo(false);
        assertThat(doors.get(3).isOpen()).isEqualTo(false);
        assertThat(doors.get(4).isOpen()).isEqualTo(false);
        assertThat(doors.get(5).isOpen()).isEqualTo(true);
        assertThat(doors.get(6).isOpen()).isEqualTo(true);
        assertThat(doors.get(7).isOpen()).isEqualTo(true);
        assertThat(doors.get(8).isOpen()).isEqualTo(false);
        assertThat(doors.get(9).isOpen()).isEqualTo(false);
        assertThat(doors.get(10).isOpen()).isEqualTo(false);
    }


    @Test
    void visit_10_doors_four_times() {
        Doors doors = new Doors(10);
        doors.visit(4);
        assertThat(doors.get(1).isOpen()).isEqualTo(true);
        assertThat(doors.get(2).isOpen()).isEqualTo(false);
        assertThat(doors.get(3).isOpen()).isEqualTo(false);
        assertThat(doors.get(4).isOpen()).isEqualTo(true);
        assertThat(doors.get(5).isOpen()).isEqualTo(true);
        assertThat(doors.get(6).isOpen()).isEqualTo(true);
        assertThat(doors.get(7).isOpen()).isEqualTo(true);
        assertThat(doors.get(8).isOpen()).isEqualTo(true);
        assertThat(doors.get(9).isOpen()).isEqualTo(false);
        assertThat(doors.get(10).isOpen()).isEqualTo(false);
    }

    @Test
    void visit_10_doors_five_times() {
        Doors doors = new Doors(10);
        doors.visit(5);
        assertThat(doors.get(1).isOpen()).isEqualTo(true);
        assertThat(doors.get(2).isOpen()).isEqualTo(false);
        assertThat(doors.get(3).isOpen()).isEqualTo(false);
        assertThat(doors.get(4).isOpen()).isEqualTo(true);
        assertThat(doors.get(5).isOpen()).isEqualTo(false);
        assertThat(doors.get(6).isOpen()).isEqualTo(true);
        assertThat(doors.get(7).isOpen()).isEqualTo(true);
        assertThat(doors.get(8).isOpen()).isEqualTo(true);
        assertThat(doors.get(9).isOpen()).isEqualTo(false);
        assertThat(doors.get(10).isOpen()).isEqualTo(true);
    }

    @Test
    void visit_10_doors_ten_times() {
        Doors doors = new Doors(10);
        doors.visit(10);
        assertThat(doors.get(1).isOpen()).isEqualTo(true);
        assertThat(doors.get(2).isOpen()).isEqualTo(false);
        assertThat(doors.get(3).isOpen()).isEqualTo(false);
        assertThat(doors.get(4).isOpen()).isEqualTo(true);
        assertThat(doors.get(5).isOpen()).isEqualTo(false);
        assertThat(doors.get(6).isOpen()).isEqualTo(false);
        assertThat(doors.get(7).isOpen()).isEqualTo(false);
        assertThat(doors.get(8).isOpen()).isEqualTo(false);
        assertThat(doors.get(9).isOpen()).isEqualTo(true);
        assertThat(doors.get(10).isOpen()).isEqualTo(false);
    }


}
