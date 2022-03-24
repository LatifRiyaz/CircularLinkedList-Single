import java.util.*;

public class maincircular{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        CircularList cl = new CircularList();
        while(true){
            System.out.print("1. Insert\n2. Insert at specific location\n3. Delete\n4. Show data\n5. Exit\nEnter your choice : ");
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the integer data to be inserted : ");
                    int data = in.nextInt();
                    cl.insertnext(data);
                    break;
                case 2:
                    System.out.print("Enter the position to insert the data : ");
                    int index = in.nextInt();
                    System.out.print("Enter the integer data to be inserted : ");
                    data = in.nextInt();
                    cl.insertatown(index, data);
                    break;
                case 3:
                    System.out.print("Enter the data to be deleted : ");
                    data = in.nextInt();
                    cl.delete(data);
                    break;
                case 4:
                    System.out.print("Data present : ");
                    cl.display();
                    break;
                case 5:
                    System.out.println("GoodBye");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice\n");
                
            }
        }        
    }
}

//Created by Abdul Latif