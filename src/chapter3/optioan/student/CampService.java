package chapter3.optioan.student;


import java.util.Optional;

public class CampService {
    public Student[] students = {(new Student("Spartan")), new Student("Steve"), new Student("John")};
    //생성자

    //기능
    //게터
    public Optional<Student> findStudentByName(String name) {
        for (Student student : students) {
            String studentName = student.getName();
            if (studentName.equals(name)) {
                return Optional.ofNullable(student);
            }
        }
        return Optional.ofNullable(null);
    }
}