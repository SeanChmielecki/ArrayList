import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> teachers = new ArrayList<String>();
		
		teachers.add("Anthony");
		teachers.add("Paul");
		teachers.add("John");
		teachers.add("Martin");
		teachers.add("Shay");
		
		System.out.println( teachers.get(0) );
		System.out.println( teachers.get(1) );
		System.out.println( teachers.get(2) );
		System.out.println( teachers.get(3) );
		System.out.println( teachers.get(4) );
		
	}
}
