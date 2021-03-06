package doubleLinkedLIst;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int choice, data, x;
		Scanner scan = new Scanner(System.in);

		DoubleLinkedList List = new DoubleLinkedList();
		List.createList();

		while (true) {
			System.out.println("1. Dislplay List");
			System.out.println("2. Insert into empty list");
			System.out.println("3. insert a node in beginning of the list");
			System.out.println("4. insert a node a the end of the list");
			System.out.println("5. insert a node after a specified node");
			System.out.println("6. insert a node before a specified node");
			System.out.println("7. delete first node");
			System.out.println("8. delete last node");
			System.out.println("9. delete any node");
			System.out.println("10. reverse the list ");
			System.out.println("11. quit");

			System.out.println("Enter your choice:");
			choice = scan.nextInt();
			
			if(choice==11) break;
			
			switch(choice){
			case 1:
				List.displayList();
				break;
			case 2:
				System.out.println("enter the elements to be inserted");
				data=scan.nextInt();
				List.insertInEmptyList(data);
				break;
			case 3: 
				System.out.println("enter the elements to be inserted");
				data=scan.nextInt();
				List.insertInBeginning(data);
				break;
				
			case 4:
				System.out.println("enter the elements to be inserted");
				data=scan.nextInt();
				List.insertAtEnd(data);
				break;
			case 5:
				System.out.println("enter the elements to be inserted");
				data=scan.nextInt();
				System.out.println("Enter the element after which to insert");
				x=scan.nextInt();
				List.insertAfter(data, x);
				break;
			case 6:
				System.out.println("enter the elements to be inserted");
				data=scan.nextInt();
				System.out.println("Enter the element before which to insert");
				x=scan.nextInt();
				List.insertBefore(data, x);
				break;
			case 7:
			 List.deleteFirstNode();
				break;
			case 8:
				List.deleteLastNode();
				break;
			case 9:
			System.out.println("enter the element to be deleted");
			data=scan.nextInt();
			List.deleteNode(data);
			break;
			case 10: 
				List.reverseList();
				break;
				default:
					System.out.println("wrong choice");
			}
			System.out.println();
		}
     scan.close();
     System.out.println("Exiting");
	}
}
