import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double a;
        do {
            System.out.println("nhap gia tri a khac 0:");
            a = scanner.nextDouble();
        }while (a==0);
        System.out.println("nhap gia tri b");
        double b = scanner.nextDouble();
        System.out.println("nhap gia tri c");
        double c =scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta =quadraticEquation.getDelta();
        if(delta<0){
            System.out.println("phuong trinh vo nghiem!");
        }else if(delta==0){
            System.out.println("phuong trinh co nghiem kep: "+quadraticEquation.getRootDouble());
        }else {
            System.out.println("phuong trinh co 2 nghiem la: "+quadraticEquation.getRoot1()+
                    " va "+quadraticEquation.getRoot2());
        }
    }
}
