
public class InstructorManager extends UserManager {
	@Override
	public void login(User user) {
		  System.out.println(user.getFirstName()+" " +user.getLastName()+" Egitmen girisi basarili");
	}

	}

	

