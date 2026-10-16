import java.util.Map;

public class KursService {
    private static final Map<String, Double> Kurse = Map.of(
            "Euro", 1.0,
            "USD", 1.08,
            "CHF", 0.94,
            "GBP", 0.84
    );

    public static boolean isGueltig(String waehrung){
       return Kurse.containsKey(waehrung);
    }

    public static double getKurs(String von, String nach){
        return Kurse.get(nach) / Kurse.get(von);
    }

}
