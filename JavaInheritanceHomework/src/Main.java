
public class Main {

	public static void main(String[] args) {
		Student student1=new Student(1, "Fatma", "Demir");
	    Instructor inst1=new Instructor(1, "Engin", "Demirog"); 
	     
	    
	    StudentManager stManager=new StudentManager();
	    stManager.login(student1);
	    InstructorManager iMangaer=new InstructorManager();
	    iMangaer.login(inst1);

	}

}
 