package jenk;

   //Write a program to print the name, salary and date of joining of 10 employees in a company use array of object..

  public class NameObject {
	
	static void arrange(Employee[]emp) {
		for(int i = 0; i<emp.length-1; i++) 
		{
			for(int j=i+1; j<emp.length; j++) 
			{
				if(emp[i].Salary > emp[j].Salary) 
				
				{
					Employee t = emp[i];
					emp[i] = emp[j];
					emp[j] = t;
					}
				
			}
		}
		for(Employee e: emp) {
			
			System.out.println(e.name + " " + e.salary + " "+e.dateOfJoining);
		}
	}

	public static void main(String[] args) {
		
		 Employee[] employee = new Employee[10];
			
			employee[0]  = new Employee("seraz",25000,"october");
			employee[1]  = new Employee("raj",17000,"march");
			employee[2]  = new Employee("mohan",17000,"april");
			employee[3]  = new Employee("rahul",20000,"january");
			employee[4]  = new Employee("ashis",75000,"may");
			employee[5]  = new Employee("avinash",90000,"november");
			employee[6]  = new Employee("sahid",80000,"dec");
			employee[7]  = new Employee("rajesh",70000,"aug");
			employee[8]  = new Employee("abid",60000,"jun");
			employee[9]  = new Employee("waqaar",50000,"july");
			
			arrange(employee);


	}

}
