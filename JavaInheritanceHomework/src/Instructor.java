
public class Instructor extends User {

	public Instructor(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		System.out.println(getFirstName() +" "+ getLastName() +":Egitmen olarak eklendi");
		
	}

}
