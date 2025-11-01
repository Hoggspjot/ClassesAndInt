package october.day221025.task3;


public class ArtifactChain {
    // Ссылка на начало цепочки (голову списка)
    private Link head;

    private static class Link {
        int value;
        Link next;

        public Link(int value) {
            this.value = value;
        }
    }


    void addArtifact(int artifactValue) {
        Link link = new Link(artifactValue);
        link.next = head;
        head = link;
    }

    void displayChain() {
        Link current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    // Приватный статический вложенный класс — отдельное звено цепочки.
    // static: звено не хранит неявную ссылку на внешний объект ArtifactChain.


    // Добавляем новый артефакт в начало цепи (в голову списка)


    // Проходим по всей цепи и печатаем значения каждого звена


    public static void main(String[] args) {
        // Создаем цепочку артефактов
        ArtifactChain chain = new ArtifactChain();

        // Добавляем артефакты в указанном порядке
        chain.addArtifact(5);
        chain.addArtifact(10);
        chain.addArtifact(15);

        // Выводим всю цепочку (ожидается порядок: 15, 10, 5 — так как добавляем в начало)
        chain.displayChain();
    }
}