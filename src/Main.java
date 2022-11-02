import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Triangle triangle=new Triangle();
        System.out.print("Write a:");
        triangle.a = scanner.nextDouble();
        System.out.print("Write b:");
        triangle.b = scanner.nextDouble();
        System.out.print("Write c:");
        triangle.c = scanner.nextDouble();
        triangle.area(triangle.a, triangle.b, triangle.c);


    }
}