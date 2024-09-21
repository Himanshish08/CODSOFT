import java.text.DecimalFormat;
import java.util.*;
public class Task3 {
    public static void main(String args[]){
        double rupee,dollar,pound,code,euro,KWD;
        DecimalFormat f=new DecimalFormat("##,###");
        Scanner sc=new Scanner(System.in);
        System.out.println("...........CURRENCY CONVERTOR............");
        System.out.println("Enter the currency code:");
        System.out.println("1.) Rupee\n2.) Dollar\n3.) Pound\n4.)Euro");
        code=sc.nextInt();
        if(code==1) {
            System.out.println("Enter amount in rupees:");
            rupee = sc.nextDouble();
            dollar = rupee * 0.012;
            System.out.println("Dollar:" + f.format(dollar));
            pound = rupee * 0.009;
            System.out.println("Pound:" + f.format(pound));
            euro=rupee * 0.011;
            System.out.println("Euro:" + f.format(euro));
        }
        else if(code==2){
            System.out.println("Enter amount in dollar:");
            dollar = sc.nextDouble();
            rupee = dollar * 83.465;
            System.out.println("Rupees:" + f.format(rupee));
            pound = dollar * 0.751;
            System.out.println("Pound:"+f.format(pound));
            euro= dollar * 0.896;
            System.out.println("Euro:"+f.format(euro));
        }
        else if(code==3){
            System.out.println("Enter amount in Pound:");
            pound = sc.nextDouble();
            rupee = pound * 111.75;
            System.out.println("Rupees:" + f.format(rupee));
            dollar = pound* 1.332;
            System.out.println("Dollar:"+f.format(dollar));
            euro=dollar * 1.193;
            System.out.println("Euro:"+f.format(euro));
        }
        else if(code==4){
            System.out.println("Enter amount in Euro:");
            euro = sc.nextDouble();
            rupee = euro * 93.202;
            System.out.println("Rupees:" + f.format(rupee));
            dollar = euro * 1.117;
            System.out.println("Dollar:"+f.format(dollar));
            pound=euro * 0.838;
            System.out.println("Euro:"+f.format(pound));
        }
        else{
            System.out.println("Invalid code!");
        }
    }
}
