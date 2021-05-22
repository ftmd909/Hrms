
public class StudentManager extends UserManager {
@Override
public void login(User user) {
	  System.out.println(user.getFirstName()+" " +user.getLastName()+" Ogrenci girisi basarili");
}

}
