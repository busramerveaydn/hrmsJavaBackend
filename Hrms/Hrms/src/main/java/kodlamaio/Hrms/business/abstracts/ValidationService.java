package kodlamaio.Hrms.business.abstracts;

public interface ValidationService {
	boolean validateByMernis(long identityNumber, String firstName, String lastName, int dateOfBirth);
}
