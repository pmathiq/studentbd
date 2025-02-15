package Student;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Studentmain {
    public static  void main(String args[]) {
        List<Studentdemo> students=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
    System.out.println("enter student");
    int numOfStudents=scan.nextInt();
    scan.nextLine();

        for(int i=0;i<numOfStudents;i++){

        System.out.print("enter name:");
        String name=scan.nextLine();

        System.out.print("enter dept:");
        String dept=scan.nextLine();


        System.out.println("enter section:");
        String section =scan.nextLine();

        System.out.print("enter regno:");
        int regno =scan.nextInt();

scan.nextLine();


         Studentdemo studentDemo=new Studentdemo(name,dept,section,regno);

        students.add(studentDemo);
    }

        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%20s%15s%15s%15s", "NAME", "DEPT", "REGNO", "SECTION");
        System.out.println();
        System.out.println("--------------------------------------------------");
    for(Studentdemo student:students){

        System.out.printf("%20s%15s%15s%15s", student.getName(), student.getSection(), student.getDept(), student.getRegno());
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

scan.close();
    }
}