
public class Arraytastห {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {5,2,4};
		int [] b = new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		
		for (int value :b) {
			System.out.print(value+" v ");
		}
		for (int value :a) {
			System.out.print(value+" a ");
		}

	}

}
