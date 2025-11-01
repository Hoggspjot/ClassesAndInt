package october.day221025.task4;

public class Main {
    public static void main(String[] args) {
        // Создаем книгу через статический вложенный класс Builder
        Book book = new Book.Builder()
                .setTitle("Java Basics")
                .setPages(500)
                .build();

        // Выводим информацию о книге (toString() возвращает строку в нужном формате)
        System.out.println(book);
    }
}

class Book {
    private String bookTitle;
    private int pageCount;

    private Book(Builder builder) {
        this.bookTitle = builder.bookTitle;
        this.pageCount = builder.pageCount;
    }

    public static class Builder {
        private String bookTitle;
        private int pageCount;

        public Builder setTitle(String bookTitle) {
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder setPages(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book: "+ bookTitle +", "+ pageCount + " pages.";
    }
}