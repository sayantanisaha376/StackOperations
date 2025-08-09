import java.util.Scanner;

class StackApplyStudent
{
	public static void main(String args[])
	{
		int choice ;
		Student x=null;
		Scanner sc=new Scanner(System.in);
		StackArrayStudent st=new StackArrayStudent(12);
		
		st.display();
		
		
		
		while(100<1000)
		{
			System.out.println("1. Push a Student.");
			System.out.println("2. Pop a Student.");
			System.out.println("3. Display the top Student.");
			System.out.println("4. Display all Students.");
			System.out.println("5. Display the size of the stack.");
			System.out.println("6. Display student according to email input");
			System.out.println("7. Quit.\n\n");
			System.out.println("Enter your Choice\n");
			choice=sc.nextInt();
			
			if (choice==7)
				break;
			
			switch(choice)
			{
				case 1: 
							
			System.out.println("enter id and name\n");
		
		      Student e1=  Student.builder()
		      .id(sc.nextInt())
		      .name(sc.nextLine())
			  .email(sc.nextLine())
		      .build();
		       st.push(e1);
				break;
				
				case 2: 
				x=st.pop();
				System.out.println("Popped student is "+x);
				break;
				
				case 3: 
				
				System.out.println("student at the top is "+st.peek());
				break;
				
				case 4: 
				
				st.display();
				
				break;
				case 5: 
				
				System.out.println("Size of the stack is "+st.size());
				
				break;
				
				

                case 6:
                System.out.println("Enter email to search:");
                String emailToSearch = sc.next();
                Student found = st.searchByEmail(emailToSearch);
                if (found != null) {
                System.out.println("Found: " + found);
                } 
				else {
                System.out.println("No student found with email: " + emailToSearch);
                }
                break;

				
				
				default:
				
				System.out.println("WRONG CHOICE!!!!");
			}
			System.out.println("");
		}
		sc.close();
		
	}
}
