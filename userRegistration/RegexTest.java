package userRegistration;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regex reg=new Regex();
		String finame = "Rutuja"; 
        System.out.println(reg.isValidFirstName(finame));
        
        String liname = "mali"; 
        System.out.println(reg.isValidLastName(liname)); 
        
        String mail = "abc.xyz@bl.co.in"; 
        System.out.println(reg.isValidMail(mail)); 
        
        String no = "91 9309813565"; 
        System.out.println(reg.isValidNo(no)); 
        
        String pass = "Adminret1@"; 
        System.out.println(reg.isValidPwd(pass)); 

	}

}
