import java.util.*;
public class Task2 {
    public static void main(String args[]){
        //There are 6 subjects
        System.out.println(".........STUDENT GRADE CALCULATOR.......");
        System.out.println("Grade criteria is as follows:");
        System.out.println("1.) 100>=Percentage>=95 = Grade A+");
        System.out.println("2.) 95>Percentage>=85 = Grade A");
        System.out.println("3.) 85>Percentage>=70 = Grade B");
        System.out.println("4.) 70>Percentage>=50 =Grade C");
        System.out.println("5.) 50>Percentage>=33 = Grade D");
        System.out.println("6.) 33>Percentage>=0 = Fail");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks in each subjects given below out of 100:");
        System.out.println("Maths:");
        int m1=sc.nextInt();
        System.out.println("Chemistry:");
        int m2=sc.nextInt();
        System.out.println("Physics:");
        int m3=sc.nextInt();
        System.out.println("Physical Education:");
        int m4=sc.nextInt();
        System.out.println("English:");
        int m5=sc.nextInt();
        System.out.println("Hindi:");
        int m6=sc.nextInt();
        int obtained_marks=m1+m2+m3+m4+m5+m6;
        int avg_percentage=(obtained_marks/6);
        String grade="";
        if(avg_percentage>=95 && avg_percentage<=100){
            grade="A+";
        }
        else if(avg_percentage>=85 && avg_percentage<95){
            grade="A";
        }
        else if(avg_percentage>=70 && avg_percentage<85){
            grade="B";
        }
        else if(avg_percentage>=50 && avg_percentage<70){
            grade="C";
        }
        else if(avg_percentage>=33 && avg_percentage<50){
            grade="D";
        }else{
            grade="FAIL";
        }
        System.out.println(".....RESULT.....");
        System.out.printf("Total Marks Obtained:%d\n",obtained_marks);
        System.out.printf("Average Percentage: %d",avg_percentage);
        System.out.println("%");
        System.out.printf("Grade : %s",grade);
    }

}
