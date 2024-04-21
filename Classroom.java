
import java.util.Scanner;
public class Classroom {
	public static void main(String[] args) {
		//Variables
		Student students[] = new Student[2];//Two object creation from the class "Student"
		int score, max;
		
		students[0] = new Student(66100001,"John","Wick");//to call the constructor methods
		students[1] = new Student(66100003,"Michael","Japan");

		//Input 
		Scanner keyboard = new Scanner(System.in);// object creation from the class			
		//console.Writeline();
		System.out.print("Enter score for Student 1: ");
		score = keyboard.nextInt();//to read and integer number from the keyboard
		students[0].setScore(score);// setter method
		
		System.out.print("Enter score for Student 2: ");
		score = keyboard.nextInt();// read keyboard
		students[1].setScore(score);
		//students[1].setScore(keyboard.nextInt()); //shotcut 
		//Process
		if(students[0].getScore() > students[1].getScore()){//need to call getter
			max= students[0].getScore();
		}
		else{//opposite
			max= students[1].getScore();
		}
		//Output 
		System.out.println("\n---Summary---");

            for(int i=0;i<students.length;i++){ // we have arrayed objects
			System.out.println(students[i].getFirstName()+ ": " +students[i].getScore()+" points");
            } 

		System.out.println("Max score = "+max+" points");
	}
}



