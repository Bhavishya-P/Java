import java.util.*;
class details 
{
	String name;
	int age;
	Long salary;
	String designation;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public Long getSalary() 
	{
		return salary;
	}
	public void setSalary(Long salary) 
	{
		this.salary = salary;
	}
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
}
public class sample 
{
	
	

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.Raise");
		System.out.println("4.Exit");
		System.out.println("Enter the option : ");
		int option;
		details detail = new details();
		while((option = sc.nextInt()) >= 0)
		{
			if(option==1)
			{
				System.out.println("enter name : ");
				detail.setName(sc.next());
				System.out.println("enter age : ");
				detail.setAge(sc.nextInt());
				System.out.println("enter salary : ");
				detail.setSalary(sc.nextLong());
				System.out.println("enter designation : ");
				detail.setDesignation(sc.next());
			}
			
			else if(option==2)
			{
				System.out.println(detail.getName());
				System.out.println(detail.getAge());
				System.out.println(detail.getSalary());
				System.out.println(detail.getDesignation());
			}
			
			else if(option==3)
			{
				System.out.println("Salary Raised");
				detail.setSalary(detail.getSalary()*2);
			}
			else
			{
				return;
			}
		}
		

	}

}