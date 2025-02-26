package chapter3.optioan;


import java.util.Optional;

public class Camp {
    //속성
    private Student student;
    //생성자

    //기능
    //게터
    public Optional<Student> getStudent() {
        return Optional.ofNullable(student);
        //        return student;
    }
    //세터
    public  void setStudent(Student student) {
        this.student = student;
    }
}
