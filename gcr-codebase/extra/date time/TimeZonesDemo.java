import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesDemo {

    public static void main(String[] args) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // GMT
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("GMT Time : " + gmt.format(formatter));

        // IST (India)
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST Time : " + ist.format(formatter));

        // PST (Pacific Standard Time)
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("PST Time : " + pst.format(formatter));
    }
}
