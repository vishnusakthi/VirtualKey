package Assessment1;

import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		int ch=0, choice=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("\t Welcome to Assesment! ");
	    System.out.println(" Name: Vishnu Vardhini \n Learning Platform: Simplilearn \n");
		
		while(true)
		{
			System.out.println("Choose one of the following options :");
			System.out.println("1-> List out the Current Files");
			System.out.println("2-> File Operations");
			System.out.println("3-> Close the Program");
			try{    
				ch = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			
			switch(ch)
			{
			case 1: //List function to list all the files in ascending order.
				FileOperations.listFiles();
				break;
			
			case 2:
				
					System.out.println("Choose one of the following options :");
					System.out.println("1-> Add a File");
					System.out.println("2-> Delete a File");
					System.out.println("3-> Search for a File");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					
					switch(choice)
					{
					case 1:
						//Creation of a file
						System.out.println("Enter the name of a file to be created: ");
						String fileCreate = sc.next();
						
						FileOperations.createFile(fileCreate);
						break;
						
					case 2:
						//deletion of a file takes place
						System.out.print("Enter the name of a file to be deleted: ");
						String fileDelete = sc.next();
						
						FileOperations.deleteFile(fileDelete);
						break;
					case 3:
						//Search for a file takes place
						System.out.println("Enter the name of a file to be searched: ");
						String fileSearch = sc.next();
						
						FileOperations.searchFile(fileSearch);
						break;
						
				default:
						
						System.out.println("\n Invalid name,Do the Process again!\n");
						break;
				}
			
					break;
			
			case 3:
				
				//exiting the application
				sc.close();
				System.out.println("\n Thank You..");
				System.exit(1);
				break;
			
			default:
				
				System.out.println("\n Invalid Number, Select within the range of 1 to 3\n");
				break;
			
			}
		}
		
	}
}

