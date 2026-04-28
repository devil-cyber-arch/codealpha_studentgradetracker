import java.util.Scanner;
import java.util.ArrayList;

public class Students {

    Scanner sc=new Scanner(System.in);
    public static ArrayList<Students> students = new ArrayList<>();
    String Name;
    int ID,Class,MAX;
    float mark1,mark2,mark3,mark4,mark5,mark6;
    float percent,highest;
    String Passkey="Vikas@123";

    Students(String name,int id,int Class){
        this.Name=name;
        this.ID=id;
        this.Class=Class;

    }
    void display(){
        System.out.println("Name: "+Name+"\n"+"ID: "+ID+"\n"+"Class: "+Class+"\n");
    }
    void setMarks(String passkey){
        if(passkey.equals(Passkey)) {
            System.out.print("Enter the Max score/subject");
            this.MAX = sc.nextInt();
            System.out.print("Enter marks: \n subject1: ");
            this.mark1 = sc.nextInt();
            System.out.print("subject2: ");
            this.mark2 = sc.nextInt();
            System.out.print("subject3: ");
            this.mark3 = sc.nextInt();
            System.out.print("subject4: ");
            this.mark4 = sc.nextInt();
            System.out.print("subject5: ");
            this.mark5 = sc.nextInt();
            System.out.print("subject6: ");
            this.mark6 = sc.nextInt();
        }
        else {
            System.out.println("you entered the wrong passkey");
        }
    }
    void getMarks(){
        System.out.println("Name: "+Name);
        System.out.printf("Subject1: %.2f\nSubject2: %.2f\nSubject3 %.2f\nSubject4 %.2f\nSubject5: %.2f\nSubject6: %.2f\n",mark1,mark2,mark3,mark4,mark5,mark6);
        percent = ((mark1+mark2+mark3+mark4+mark5+mark6)/(MAX*6))*100;
        System.out.printf("Percentage: %.2f",percent);

        System.out.println();
    }

}
