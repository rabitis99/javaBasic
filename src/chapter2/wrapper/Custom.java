package chapter2.wrapper;

public class Custom {

    int value;

    Custom(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
class DoubleCustom{
    double value;

    DoubleCustom(double value){
        this.value = value;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}