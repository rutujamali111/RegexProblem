package userRegistration;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regex reg=new Regex();
		String finame = "Rutuja"; 
        System.out.println(reg.isValidFirstName(finame));
        
        String liname = "mali"; 
        System.out.println(reg.isValidLastName(liname)); 

	}

}
