public class Student {
    /*
    This method stores all the information to create a student object.
     */
    private String firstName;
    private String lastName;
    private int grade;
    private int id;
    static int number = 1;

    Student(String firstName, String lastName, int grade){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grade=grade;
        this.id=number;
        number++;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getGrade() {
        return grade;
    }
    public int getId() {
        return id;
    }
    public static int getNumber() {
        return number;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static void setNumber(int number) {
        Student.number = number;
    }
    public String toString(){
        return "Name: "+firstName+" "+lastName+" Grade: "+grade;
    }
}
