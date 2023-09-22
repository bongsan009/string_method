public class App {
    
    public static void main(String[] args){
        System.out.println("\033c");
    
        Student stu = new Student();
        System.out.println(stu.toString());

        System.out.println(Student.age);
        
    }
}
