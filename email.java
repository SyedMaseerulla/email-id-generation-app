
package email_app;
import java.util.Scanner;

public class email {
	private String firstname;
	private String lastname;
	private String password;
	private int defaultpasswordlength = 10;
	private String department;
	private int emailCapacity = 500;
	private String altemailaddr;
	private String email;
	private String companysuffix = "alscompany.com";
	
	// constructor to rescieve first name and last name
	public email(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
		//System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);
		//call a method asking for dept.
		this.department = getdepartment();
		System.out.println("The department is " + this.department);
		//call a method to generate a password
		this.password = randomPassword(defaultpasswordlength);
		System.out.println("Your password is: " + this.password);
		//combine elements to get email
		email = firstname + "." + lastname + "@" + department + "." + companysuffix;
		//System.out.println("Your email is : " + email);
		
	}
	//generate a random password
	private String randomPassword(int length){
		String passwordset = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length ; i++){
			int rand = (int)(Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rand);
		}
		return new String (password);
		
	}
	
	//get the department 
	private String getdepartment(){
		System.out.println("NEW EMPLOYEE: " + firstname + "\nDEPARTMENT CODES:\n 1.Sales\n 2.Development\n 3.accounts\n 4.none\n Enter the dept.code: ");
		Scanner scan = new Scanner(System.in);
		int deptcode=scan.nextInt();
		if (deptcode == 1){
			return "sales";
		}
		else if(deptcode == 2){
			return "dev";
		}
		else if(deptcode == 3){
			return "accounts";
					
		}
		else{
			return "none";
		}
		
	}
	
	//set the email capacity
	
	/*public void setemailcapacity(int capacity){
		this.emailCapacity = capacity;
	}
	//also get the alternate email id
	public void setalternateemailid(String altemailid){
		this.altemailaddr = altemailid;
		
	}
	//change password
	public void changepassword(String password){
		this.password = password;
	}
	public int getemailcapacity(){
		return emailCapacity;
	}
	public String getalternateemailid(){
		return altemailaddr;
	}
	public String getpassword(){
		return password;
	}*/
	public String showinfo(){
		return ("DISPLAY NAME: " + firstname + " " + lastname +
			   "\nCOMPANY EMAIL: " + email +
			   "\nMAIL BOX CAPACITY: " + emailCapacity + "mb");
			   
				
	}
}
