package day29_inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid student name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            System.err.println("Age can not be negative");
            System.exit(1);
        }

        if(age < 5 || age > 90){
            System.err.println("Age can not be less than 5 or greater than 90");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if(!(gender=='M' || gender=='F')){
            System.err.println("Gender should not be set to any character other than: 'M' and 'F'");
            System.exit(1);
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if(!(grade=='A' || grade=='B' || grade=='C' ||grade=='D' || grade=='F')){
            System.err.println("Grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying at "+ schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                '}';
    }
}
