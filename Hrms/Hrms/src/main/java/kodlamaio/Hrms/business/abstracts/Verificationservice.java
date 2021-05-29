package kodlamaio.Hrms.business.abstracts;

public interface Verificationservice {
	
	void sendLink(String email);
	
	String sendCode();
}
