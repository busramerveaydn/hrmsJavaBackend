package kodlamaio.Hrms.business.concretes;

import java.util.UUID;

import kodlamaio.Hrms.business.abstracts.Verificationservice;

public class VerificationManager implements Verificationservice{

	@Override
	public void sendLink(String email) {
//		random sayı üreticisi
		UUID uuid = UUID.randomUUID();
		
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println(email + "adlı adrese doğrulama linki gönderildi. Lütfen mailinizi kontrol ediniz!");
		System.out.println("Hesabınızı doğrulamak için linke tıklayınız." + verificationLink);
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Aktivasyon Kodunuz: " + verificationCode);
		return null;
	}

}
