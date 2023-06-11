public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("Лев Толстой", "Война и мир", 1867);
        Book borodino = new Book("lermontov", "Бородино", 1837);
        Author tolstoy = new Author("Лев", "Толстой");
        Author lermontov = new Author("Михаил", "Лермонтов");
        System.out.println(warAndPeace.toString());
        System.out.println(borodino.toString());
        System.out.println(tolstoy.toString());
        System.out.println(lermontov.toString());

        Book book = new Book("Лев Толстой", "Война и мир", 1867);
        Author author = new Author("Лев", "Толстой");

        System.out.println(warAndPeace.equals(warAndPeace));
    }
}