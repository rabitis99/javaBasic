package chapter3.optioan.student;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CampService campService = new CampService();

        System.out.print("캠프에서 찾고 싶은 수강생의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 캠프에서 수강생 찾기
        Optional<Student> studentOptional = campService.findStudentByName(name);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            System.out.println("캠프에 " + student.getName() + "수강생이 존재합니다.");
        } else  {
            System.out.println("해당 수강생은 캠프에 존재하지 않습니다.");
        }
    }
}
