package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class CydeoStudent extends Student{

    private int batchNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, char gender, LocalDate dateOfBirth, char grade, int batchNumber, String programmingLanguage) {
        super(name, gender, dateOfBirth, grade);
        setBatchNumber(batchNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", grade=" + getGrade() +
                ", batchNumber=" + batchNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
