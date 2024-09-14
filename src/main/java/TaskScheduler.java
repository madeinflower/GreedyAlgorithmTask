import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Task:
//Начало недели, у разработчика в бэклоге есть список задач от разных отделов,
//каждая из которых требует определённого времени для выполнения.
//Разработчик може в неделю работать определенное количество времени maxTime.
//Мы хотим выбрать максимальное количество задач, которые можно выполнить,
//учитывая ограничение по времени.
//Используйте подход жадного алгоритма по критерию: время выполнения задачи.
public class TaskScheduler {
    public static void main(String[] args) {

        int[] taskTimes = {2, 1, 3, 4, 2};
        int maxTime = 7;

        List<Integer> selectedTasks = getMaxTasks(taskTimes, maxTime);

        System.out.println("Количество выбранных задач: " + selectedTasks.size());
        System.out.println("Выбранные задачи (время выполнения): " + selectedTasks);
    }

    public static List<Integer> getMaxTasks(int[] taskTimes, int maxTime) {
        Arrays.sort(taskTimes);

        List<Integer> selectedTasks = new ArrayList<>();
        int currentTime = 0;

        for (int taskTime : taskTimes) {
            if (currentTime + taskTime <= maxTime) {
                selectedTasks.add(taskTime);
                currentTime += taskTime;
            } else {
                break;
            }
        }

        return selectedTasks;
    }

}
