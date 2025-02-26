package chapter2.capsulation.v1;

public class DataStore {
    //"B가 문자열이 들어오면 핵폭발 발생
    private String store;

    void setStore(String store) {
        if (store == "B"){
            System.out.println("바꾸지 마세요");
        }
        else {
            this.store = store;
        }
    }
}
