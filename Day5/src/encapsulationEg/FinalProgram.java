package encapsulationEg;

public class FinalProgram {

	public static void main(String[] args) {
		
		College emp1=new College();
	
		emp1.setId(1);
		emp1.setName("Ayush");
		emp1.setSalary("1,00,000");
		
	/*System.out.println(emp1.getId()+" "
				+" "+emp1.getSalary()+" "+emp1.getName());*/		
		System.out.println(emp1);
	}

}
