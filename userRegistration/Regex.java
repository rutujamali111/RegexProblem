package userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public boolean isValidFirstName(String finame) {
		String fname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern fnme = Pattern.compile(fname);
        if (finame == null) { 
            return false; 
        } 
        Matcher m1 = fnme.matcher(finame);
        return m1.matches();
	}

	public boolean isValidLastName(String liname) {
		String lname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern lnme = Pattern.compile(lname); 
        if (liname == null) { 
            return false; 
        } 
        Matcher m2 = lnme.matcher(liname);
        return m2.matches(); 
	}

}
