import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ads = new ArrayList<>();
        ads.add("Buy One Get One Free");
        ads.add("20% Off All Items");
        System.out.println(ads);

        ads.set(1, "30% Off All Items");
        System.out.println(ads);
    }

}
