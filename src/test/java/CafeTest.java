import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CafeTest {

    Cafe cafe;

    @BeforeEach
    public void before() {
        cafe = new Cafe(10, 15, Arrays.asList(6, 7));
    }

    @Test
    public void shouldShowTime() {
        String result = cafe.showTime();

        Assertions.assertEquals("Кафе работает с 10:00 до 15:00", result);
    }

    @Test
    public void shouldShowDate() {
        String result = cafe.showDate();

        Assertions.assertEquals("Выходные: [6, 7]", result);
    }

    @Test
    public void shouldChangeTime() {
        cafe.changeTime(8, 18);
        String result = ("Режим работы изменен! Теперь кафе работает с " + cafe.start + ":00 до " + cafe.end + ":00");

        Assertions.assertEquals("Режим работы изменен! Теперь кафе работает с " +
                cafe.start + ":00 до " + cafe.end + ":00", result);
    }

    @Test
    public void shouldChangeDate() {
        cafe.changeDate(Arrays.asList(4, 5, 6));
        String result = ("График изменен! Добавлен выходной. Выходные дни: " + cafe.weekends);

        Assertions.assertEquals("График изменен! Добавлен выходной. Выходные дни: " + cafe.weekends, result);
    }

    @Test
    public void shouldRemoveDate() {
        cafe.changeDate(Arrays.asList(4, 5, 6));
        cafe.removeDate(Arrays.asList(4));
        String result = ("График изменен! Отменен выходной. Выходные дни: " + cafe.weekends);

        Assertions.assertEquals("График изменен! Отменен выходной. Выходные дни: " + cafe.weekends, result);
    }
}
