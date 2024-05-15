package SolidWithDesignPattern;

public class Book implements Resource {
    private String title;

    public Book(String title) {

        this.title = title;

    }

    @Override
    public void borrow() {

        System.out.print(" is Borrowing Book: " + title);

    }

}