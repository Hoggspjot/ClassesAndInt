package october.day221025.task1;

public class Main {
    public static void main(String[] args) {
        // Создаём экземпляр статического вложенного класса
        // Важно: объект внешнего класса Spellbook не нужен
        Spellbook.BasicCharm charm = new Spellbook.BasicCharm();

        // Активируем заклинание
        charm.castSpell();
    }
}

class Spellbook {

    static class BasicCharm {

        public void castSpell() {
            System.out.println("Hello from static basic charm!");
        }
    }
}