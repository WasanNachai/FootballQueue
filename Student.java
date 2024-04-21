
public class Student {
	private int ID;
	private String firstName;
	private String lastName;
	private int score;
	
	public Student(int id, String firstname, String lastname){
		ID = id;
		firstName = firstname;
		lastName = lastname;
	}

	public int getId() {
		return ID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastname() {
		return lastName;
	}

	public void setScore(int s){
		score = s;
		
	}
	public int getScore(){
		return score;
		
	}
}


