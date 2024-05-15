package SolidWithDesignPattern;

public class Capstone implements Resource {

    private String title;

    public Capstone(String title) {

        this.title = title;

    }

    @Override
    public void borrow() {

        System.out.print(" is Borrowing Capstone: " + title);

    }

}