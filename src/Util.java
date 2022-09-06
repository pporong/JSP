import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
	
	public static String getNowDateStr() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String regDate = now.format(formatter);
		return regDate;
	}

}
