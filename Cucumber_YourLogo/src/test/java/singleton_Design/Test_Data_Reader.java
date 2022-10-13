package singleton_Design;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {
	public static Properties p;

	public Test_Data_Reader() throws IOException {
		File f = new File("C:\\Arif_Project\\src\\main\\java\\singleton_Design\\Test_Data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String get_url() {
		String url = p.getProperty("url");
		return url;
	}

	public String get_username() {
		String username = p.getProperty("username");
		return username;
	}

	public String get_password() {
		String password = p.getProperty("password");
		return password;
	}
	public String checkin() {
		String checkin = p.getProperty("checkin");
		return checkin;
	}
	public String checkout() {
		String checkout = p.getProperty("checkout");
		return checkout;
	}
	public String firstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String lastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String address() {
		String address = p.getProperty("address");
		return address;
	}
	public String cardno() {
		String ccvno = p.getProperty("cardno");
		return ccvno;
	}
	public String ccvno() {
		String ccvno = p.getProperty("ccvno");
		return ccvno;
	}

}
