import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int choice =0;
        while(choice !=3) {

            System.out.println("Enter 1 for students information.\n Enter 2 for the book information.");
            choice = obj.nextInt();

            if (choice == 1) {
                student_information obj1=new student_information();
                System.out.println("Enter the name of the student:");
                obj1.name=obj.nextLine();obj1.name=obj.nextLine();
                System.out.println("Enter the father's name:");
                obj1.f_name=obj.nextLine();
                System.out.println("Enter the university id:");
                obj1.uni_id=obj.nextLine();
                System.out.println("Enter the user id:");
                obj1.user_id=obj.nextLine();
                System.out.println("Enter the semester of the student:");
                obj1.sem=obj.nextInt();
                obj1.getData(obj1.name, obj1.f_name, obj1.uni_id, obj1.user_id, obj1.sem);
                obj1.setData();

            }

            else if(choice == 2){
                book_information obj2=new book_information();

                obj2.chemistry();
                obj2.physics();
                obj2.biology();
            }
        }

    }
}