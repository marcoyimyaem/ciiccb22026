import java.util.HashMap;
import java.util.Map;

public class MapsLesson {
    public static void varlala(){
        var k = 0;

    }
    public static void main(String[] args) {
        Map<String,Double> prices = new HashMap<>();
        prices.put("Gas", 98d);
        prices.put("LPG", 1600d);
        prices.put("Gas", 98d);
        System.out.println(prices.get("LPG"));
        System.out.println(prices.containsKey("Gas"));
        System.out.println(prices.keySet());
        

        

    }

}
