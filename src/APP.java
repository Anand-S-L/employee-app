import java.util.ArrayList;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        while (true){
            System.out.println("1 add employee");
            System.out.println("2 search employee");
            System.out.println("3 remove employee");
            System.out.println("4 view all employee");
            System.out.println("5 exit");
            System.out.println("Enter the option?");
            int option =s.nextInt();


            switch (option){
                case 1 :
                    System.out.println("Enter the name of employee");
                    arr.add(s.next());
                    break;

                case 2 :
                    System.out.println("Enter the employee to be searched");
                    String name2=s.next();
                    if(arr.contains(name2)){
                        System.out.println("Employee found");
                    }
                    else {
                        System.out.println("Employee not found");
                    }
                    break;

                case 3 :
                    System.out.println("Enter the name of employee to be removed");
                    String name=s.next();
                    if(arr.contains(name)){
                        System.out.println("removed"+arr.remove(name));
                    }
                    break;

                case 4 :
                    System.out.println("The employees present are :");
                    for (int i=0;i<arr.size();i++){
                        System.out.print(arr.get(i)+" , ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exit");
                    return;
        }

        }
    }
}
