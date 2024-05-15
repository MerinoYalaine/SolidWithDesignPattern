package SolidWithDesignPattern;

public class TestLibrary {
    public static void main(String[] args) {

        Student student = new Student("Karla", 2110252918);

        Resource book = new Book("Introduction to Computer Science");
        Resource capstone = new Capstone("NEUQuery for FAQs");
        Resource internet = new InternetAccess();
        Resource journal = new Journal("Application of Object-Oriented Programming");
        
        System.out.print(student.getName());
        student.borrowResource(book);
        System.out.print("\n" + student.getName());
        student.borrowResource(journal);
        System.out.print("\n" + student.getName());
        student.borrowResource(internet);
        System.out.print("\n" + student.getName());
        student.borrowResource(capstone);

    }

}