
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double total;
        total=0;

    Scanner sc =new Scanner(System.in);

    Student[] students = new Student[5];

    for(int i=0; i<students.length; i++){

        students[i] = new Student();

    }

    for(int i=0; i<students.length; i++){


        System.out.println("\n--Enter the details of Student " +(i+1)+ " --");

        System.out.print("\nEnter Student Name : ");
        students[i].name = sc.nextLine();

        System.out.print("\nEnter Student Id : ");
        students[i].id=sc.nextLine();

        System.out.print("\nEnter Student Marks : ");
        students[i].mark = sc.nextDouble();

        sc.nextLine();

        total=total+students[i].mark;

    }
        System.out.println("-------------------");
        System.out.println("\nAll the Students\n");
        for (int i = 0; i < students.length; i++) {

            System.out.println("--Student " +(i+1)+ " --");
            students[i].display();
            System.out.println("-------------------");
        }


        Student highMarks= students[0];
        int studentNo=1;

        for(int i=0; i<students.length; i++){

            if(students[i].mark > highMarks.mark){

                highMarks=students[i];
                studentNo=i+1;


            }
        }
        System.out.println("\n--- Higest Mark is * "+highMarks.mark+" * of the Student "+studentNo+" -----");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("The Student "+studentNo+ " Details");

        System.out.println("-------------------------------------");
        highMarks.display();
        System.out.println("-------------------------------------");



        System.out.println("\nAvarage Marks Of The Students Are : "+(total/students.length));
        System.out.println();




    }
}