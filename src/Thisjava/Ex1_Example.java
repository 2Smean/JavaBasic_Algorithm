package Thisjava;
import java.util.Scanner;
public class Ex1_Example {
    public static void main(String args[]) {
        System.out.println("이름, 도시, 나이, 체중, 독신여부를 입력하세요");
        Scanner sc=new Scanner(System.in);
            String name=sc.next();
            String city=sc.next();
            int age=sc.nextInt();
            double weight=sc.nextDouble();
            boolean isSingle=sc.nextBoolean();

            System.out.print("이름은"+name+",");
            System.out.print("사는 도시는"+city+",");
            System.out.print("나이는"+age+",");
            System.out.print("체중은"+weight+",");
            System.out.println("독신여부는"+isSingle);
            





        }




    }

