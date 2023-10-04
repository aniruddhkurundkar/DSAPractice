import java.util.ArrayList;
import java.util.List;

public class Main {

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Main main = new Main();
        main.setObj("NTS");
        main.setObj(3);
        List objectList = new ArrayList();
        objectList.add(main);
        String myStr = (String) ((Main)objectList.get(0)).getObj();
        System.out.println("myStr: " + myStr);
    }
}