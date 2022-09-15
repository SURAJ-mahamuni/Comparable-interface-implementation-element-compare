public class TestMain {
    public static void main(String []args){
        Student s1 = new Student(22, "Suraj",22);
        Student s2 = new Student(33, "Harish", 22);
        Student s3 = new Student(22, "Suraj", 22);

        System.out.println(s1.compare(s2));
        System.out.println();
        System.out.println(s1.compare(s3));
    }
}
