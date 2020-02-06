import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String name;
    private int schoolId;
    static int Id = 1;
    private int studentCount;

    School(String name, int studentCount){
        this.name = name;
        this.studentCount = studentCount;
        this.schoolId = Id;
        Id++;
    }
    public static int getId(){
        return Id;
    }
    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public void addTeacher(Teacher add){
        this.teachers.add(add);
    }
    public void addStudent(Student add){
        this.students.add(add);
    }
    public void delTeacher(int indexPos){
        this.teachers.remove(indexPos);
    }
    public void delStudent(int indexPos){
        this.students.remove(indexPos);
    }
    public void allTeachers(){
        System.out.println(teachers);
    }
    public void allStudents(){
        System.out.println(students);
    }
}

