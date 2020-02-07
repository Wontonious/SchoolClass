import java.util.ArrayList;

public class School {
    /*
    This class holds all the information to create a school and stores the students and teachers
    added to the school.
     */
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public int getSchoolId() {
        return schoolId;
    }
    public static void setId(int id) {
        Id = id;
    }
    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher add){
        /*
        This method adds a teacher to the specific school it is added to.
        The teacher is added must be a teacher object created from the "Teacher" class.
         */

        this.teachers.add(add);
    }
    public void addStudent(Student add){
        /*
        This method adds a student to the specific school it is added to.
         */
        this.students.add(add);
    }
    public void delTeacher(int indexPos){
        /*
        This method removes a teacher from the specific school at a specific index position the user inputs.
         */
        this.teachers.remove(indexPos);
    }
    public void delStudent(int indexPos){
        /*
        This method removes a student from the specific school at a specific index position.
         */
        this.students.remove(indexPos);
    }
    public void allTeachers(){
        /*
        This method prints out a list of every teacher in a specific school.
         */
        System.out.println(teachers);
    }
    public void allStudents(){
        /*
        This method prints out a list of every student in a specific school.
         */
        System.out.println(students);
    }
}

