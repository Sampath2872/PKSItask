package pegasus;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAnIPaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sample Input
		000.12.12.034
		121.234.12.12
		23.45.12.56
		00.12.123.123123.123
		122.23
		Hello.IP*/
		
		System.out.println(isValid("000.12.12.034"));
		System.out.println(isValid("121.234.12.12"));
		System.out.println(isValid("23.45.12.56"));
		System.out.println(isValid("00.12.123.123123.123"));
		System.out.println(isValid("122.23"));
		System.out.println(isValid("Hello.IP"));
	}

	private static final String IPV4_PATTERN =
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final Pattern pattern = Pattern.compile(IPV4_PATTERN);

    public static boolean isValid(final String ip) {
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}
