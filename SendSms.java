package webapp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
public class Sendsms {

	int OTP;
	public int sendSms(String phno) {
	try {
	String apiKey = "apikey=" + "NmU2YzU2NjQ2MzZlNjU1YTc5NDc2NDczNmU1MzY4NmU";
	Random rand = new Random();
	OTP = rand.nextInt(999999);
	String message = "&message=" + "This is your otp" + OTP;
	String sender = "&sender=" + "TSN";
	String numbers = "&numbers=" + "9535210911";
	
	// Send data
	HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
	String data = apiKey + numbers + message + sender;
	conn.setDoOutput(true);
	conn.setRequestMethod("POST");
	conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
	conn.getOutputStream().write(data.getBytes("UTF-8"));
	final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	final StringBuffer stringBuffer = new StringBuffer();
	String line;
	while ((line = rd.readLine()) != null) {
		stringBuffer.append(line);
	}
	rd.close();
	
	return OTP;
} catch (Exception e) {
	System.out.println("Error SMS "+e);
	return 0;
}
}
}
