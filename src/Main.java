import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> laptopBrands = new ArrayList<>(Arrays.asList("Dell", "HP", "Asus"));
        System.out.println(laptopBrands);

        laptopBrands.add("Apple");
        System.out.println(laptopBrands);
    }

}
