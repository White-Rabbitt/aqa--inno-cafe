import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cafe cafe = new Cafe(10, 15, Arrays.asList(6, 7));

        // Смотрим часы работы
        cafe.showTime();

        // Смотрим выходные
        cafe.showDate();

        // Меняем часы работы
        cafe.changeTime(8, 18);

        // Добавляем выходные дни
        cafe.changeDate(Arrays.asList(4, 5, 6));

        // Удаляем выходные дни
        cafe.removeDate(Arrays.asList(4));
    }
}
