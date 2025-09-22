import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("Yellow");
        items.add("Green");
        items.add("Red");

        String str = items.get(1);
        System.out.println(str);
    }

}
