public class Student implements Compare {
    private int roll;
    private String name;
    private int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public String compare(Student sd) {
        if (roll == sd.roll) {
            return "Roll number is same";
        }
        if (name == sd.name) {
            return "Name is same";
        }
        if (age == sd.age){
            return "Age is same";
        }
        else{
            return "No same element found";
        }

    }
}
