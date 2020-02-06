public class Main {
    public static void main(String[] args) {
        School windermere = new School("Windermere",1000);

        windermere.addStudent(new Student("Winston","Nguyen",11));
        windermere.addStudent(new Student("Krista","Nguyen",10));
        windermere.addStudent(new Student("Jonathon","Kim",11));
        windermere.addStudent(new Student("Jack","Martin",8));
        windermere.addStudent(new Student("Emily","Fun",11));
        windermere.addStudent(new Student("Troy","Mah",9));
        windermere.addStudent(new Student("Rachel","Yan",9));
        windermere.addStudent(new Student("Jericho","Layugan",12));
        windermere.addStudent(new Student("Cathy","Lei",10));
        windermere.addStudent(new Student("Tina","Jun",11));

        windermere.addTeacher(new Teacher("Andrea","Lee", "Choir"));
        windermere.addTeacher(new Teacher("Mike","Griffiths","Math"));
        windermere.addTeacher(new Teacher("Laurelin","Au","English"));

        windermere.allStudents();
        windermere.allTeachers();

        windermere.delStudent(1);
        windermere.delStudent(2);

        windermere.delTeacher(2);

        windermere.allStudents();
        windermere.allTeachers();
    }
}
