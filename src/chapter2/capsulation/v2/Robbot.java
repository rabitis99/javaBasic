package chapter2.capsulation.v2;

public class Robbot {


    private boolean leftLeg;
    private boolean rightLeg;

    private boolean leftArm; // 세터필요
    private boolean rightArm;// 세터필요
    private boolean leftEye; // 세터필요
    private boolean rightEye;// 세터필요

//        public void setLeftLeg(boolean power) {
//            this.leftLeg = power;
//        }
//
//        public void setRightLeg(boolean power) {
//            this.rightLeg = power;
//        }

    public void work(boolean power) {
        this.leftLeg = power;
        this.rightLeg = power;
        this.leftArm = power;
        this.rightArm = power;
        this.leftEye = power;
        this.rightEye = power;

    }
}