import java.util.ArrayList;
import java.util.List;

public class Cafe {

    int start;
    int end;
    String time;
    List<Integer> days;
    List<Integer> weekends = new ArrayList<>();

    public Cafe(int start, int end, List<Integer> days) {
        this.start = start;
        this.end = end;
        this.days = days;
    }

    public String showTime() {
        String result = ("Кафе работает с " + start + ":00 до " + end + ":00");
        System.out.println(result);
        return result;
    }

    public String showDate() {
        String result = ("Выходные: " + days);
        System.out.println(result);
        return result;
    }

    public String changeTime(int start, int end) {
        this.start = start;
        this.end = end;
        time = ("Режим работы изменен! Теперь кафе работает с " + start + ":00 до " + end + ":00");
        System.out.println(time);
        return time;
    }

    public String changeDate(List<Integer> weekends) {
        this.weekends.addAll(weekends);
        String result = ("График изменен! Добавлен выходной. Выходные дни: " + this.weekends);
        System.out.println(result);
        return result;
    }

    public String removeDate(List<Integer> weekends) {
        this.weekends.removeAll(weekends);
        String result = ("График изменен! Отменен выходной. Выходные дни: " + this.weekends);
        System.out.println(result);
        return result;
    }
}
