package november.day011125.task1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаём конкретную реализацию репозитория (инфраструктурный слой)
        TaskRepository repository = new InMemoryTaskRepository();

        // Добавляем задачи разных типов (минимум по одному каждого вида)
        repository.add(new WorkTask("Подготовить отчёт", "пятница 18:00"));
        repository.add(new HomeTask("Помыть посуду", "кухня"));

        // Сервис работает только с интерфейсом репозитория и абстрактным типом Task
        TaskService service = new TaskService(repository);

        // 1) Получение и вывод информации о задачах
        service.printAllTasksInfo();

        System.out.println(); // Пустая строка для наглядности вывода

        // 2) Демонстрация выполнения задач
        service.completeAllTasks();
    }
}

abstract class Task {
    private String title;

    public Task(String title) {
        this.title = title;
    }

    public abstract void complete();

    public String getTitle() {
        return title;
    }

}

class WorkTask extends Task {
    String deadline;

    public WorkTask(String title, String deadline) {
        super(title);
        this.deadline = deadline;
    }

    @Override
    public void complete() {

    }
}

class HomeTask extends Task {
    String location;

    public HomeTask(String title, String location) {
        super(title);
        this.location = location;
    }

    @Override
    public void complete() {

    }
}

interface TaskRepository {

    void add(Task task);
    Task findTask(String title);
    List getAllTasks();
}

class InMemoryTaskRepository implements TaskRepository {
    private List<Task> tasks = new ArrayList<>();


    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public Task findTask(String title) {
        return null;
    }

    @Override
    public List getAllTasks() {
        return new ArrayList(tasks);
    }


}

class TaskService {
    TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void printAllTasksInfo() {
        List<Task> temp = repository.getAllTasks();
        for (Task task : temp) {
            System.out.println(task.getTitle());
        }
    }

    public void completeAllTasks() {
        List<Task> temp = repository.getAllTasks();
        for (Task task : temp) {
            task.complete();
        }
    }
}