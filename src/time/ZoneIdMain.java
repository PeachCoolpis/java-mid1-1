package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }
    }
}
