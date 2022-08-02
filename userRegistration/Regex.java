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

	public boolean isValidMail(String mail) {
		String email = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"; 
        Pattern emil = Pattern.compile(email); 
        if (mail == null) { 
            return false; 
        } 
        Matcher m3 = emil.matcher(mail);
        return m3.matches();
	}

}
