package userRegistration;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		HashMap<String, Boolean> map=new HashMap<String, Boolean>();
		Regex reg=new Regex();
		String finame = "Rutuja"; 
        System.out.println(reg.isValidFirstName(finame));
        
        String liname = "mali"; 
        System.out.println(reg.isValidLastName(liname)); 
        
        System.out.println("Enter mail ID: ");
        while(i<21)
        {
        	String mail = sc.next(); 
            //System.out.println(reg.isValidMail(mail)); 
            map.put(mail, reg.isValidMail(mail));
            i++;
        }
        System.out.println("mail ID validations test cases:");
       
        for(Map.Entry<String, Boolean> element:map.entrySet())
        {
        	String key=element.getKey();
        	boolean result=element.getValue();
        	System.out.println(key+"    "+result);
        
        }
        
        String no = "91 9309813565"; 
        System.out.println(reg.isValidNo(no)); 
        
        String pass = "Adminret1@"; 
        System.out.println(reg.isValidPwd(pass)); 

	}

}
