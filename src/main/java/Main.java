import MyConfig.MyConfig;
import WeekDay.WeekDay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        String text;
        text = JOptionPane.showInputDialog("Выберите категорию заметки: Weekend,Shop,Job # " +
                " Сегодня " + weekDay.getWeekDayName());
        JOptionPane.showMessageDialog(null,"вы выбрали категорию:" + text);

        Map<String, String> weekend = new HashMap<>();
        Map<String, String> shop = new HashMap<>();
        Map<String, String> job = new HashMap<>();
    }
}
