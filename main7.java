public class main7 {
    public static void main(String[] args){
        Student student = new Student("John Doe", 28, "Computer Science");
        book book = new book("The Hobbit", "j.r.r Tolkien", 295);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getMajor());
        System.out.println("Books info");
        System.out.println("name:" + book.getAuthor());
        System.out.println("name:" + book.getTitle());
        System.out.println("name:" + book.getNumPages());






    }
}
