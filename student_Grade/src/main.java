import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int x=5,ID;
        boolean isValid=true;
        while (x>0) {
            String choices = """
                    1. Input new student details
                    2. Single student details
                    3. All student details
                    4. Enter the marks of student
                    5. Ranking list
                    6. stats of students
                    7. exit
                    """;
            System.out.println(choices);

            System.out.print("Enter your choice:");
            int choice = input.nextInt();
            char want;

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter student details: ");

                    System.out.print("Enter student Name: ");
                    String name = input.next();
                    System.out.print("Enter Student ID: ");
                    int id = input.nextInt();
                    System.out.print("Enter Student class: ");
                    int Class = input.nextInt();
                    Students.students.add(new Students(name,id,Class));
                    System.out.print("Do you want to enter the student's marks?(Yes/No)");
                    want = input.next().toLowerCase().charAt(0);
                    if(want=='y'){
                        System.out.print("Enter student ID: ");
                        ID = input.nextInt();
                        System.out.print("Enter passkey:");
                        String passkey=input.next();
                        for (Students st:Students.students){
                            if (st.ID==ID){
                                st.setMarks(passkey);
                                isValid=true;
                                break;
                            }
                            isValid=false;
                        }
                    }
                    if (!isValid){
                        System.out.println("invalid ID");
                    }
                }
                case 2 -> {
                    System.out.println("Enter student ID:");
                    int id=input.nextInt();
                    for (Students stu: Students.students){
                        if(stu.ID==id){
                            stu.display();
                            System.out.print("Do you want to see the student's marks?(Yes/No)");
                            want = input.next().toLowerCase().charAt(0);
                            if(want=='y'){
                                System.out.print("Enter student ID: ");
                                ID = input.nextInt();
                                if (stu.ID==ID){
                                    stu.getMarks();
                                    isValid=true;
                                    break;
                                }
                                isValid = false;
                            }
                        }
                    }
                    if (!isValid){
                        System.out.println("invalid ID");
                    }
                }
                case 3 -> {
                    System.out.println("show all student details:");
                    for (Students stu: Students.students){
                        stu.display();
                    }
                }
                case 4 -> {
                    System.out.print("Enter student ID: ");
                    ID = input.nextInt();
                    System.out.print("Enter passkey:");
                    String passkey=input.next();
                    for (Students st:Students.students){
                        if (st.ID==ID){
                            st.setMarks(passkey);
                            isValid=true;
                            break;
                        }
                        isValid=false;
                    }if (!isValid){
                        System.out.println("invalid ID");
                    }
                }
                case 5 -> System.out.println("Ranking list: ");
                case 6 -> System.out.println("stats of students");
                case 7 -> {
                    System.out.println("exit");
                    x=0;
                }
                default -> System.out.println("Enter valid choice");
            }
            x--;
        }


    }
}

//hello from git-hub
//hi from meee
