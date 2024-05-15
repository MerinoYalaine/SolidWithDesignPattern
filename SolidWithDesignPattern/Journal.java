package SolidWithDesignPattern;

public class Journal implements Resource {
    private String title;

    public Journal(String title) {

        this.title = title;

    }

    @Override
    public void borrow() {

        System.out.print("is Borrowing Journal: " + title);

    }

}