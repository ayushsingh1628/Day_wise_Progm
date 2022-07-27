package CollegeStatic;

public class collegeName {

	public static void main(String[] args) {
		
			Backend col1 = new Backend(1, "first");
			col1.change("NIT");
			Backend col2=new Backend(2, "second");
			Backend col3=new Backend(3, "third");
			col1.display();
			col2.display();
			col3.display();
		}

	

}
