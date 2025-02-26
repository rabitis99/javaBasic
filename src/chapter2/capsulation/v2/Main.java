package chapter2.capsulation.v2;

public class Main {
    public static void main(String[] args) {

      Robbot robot = new Robbot();
        //무분별한 세터
//        robot.setLeftLeg(true);  // ✅ 왼쪽 다리 움직임
//        robot.setRightLeg(true); // ✅ 오른쪽 다리 움직임
        robot.work(true);
    }

}
