import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, perfect,result=0;
        perfect=result;
        System.out.print("Sayı Gir : ");
        number = sc.nextInt();
        if (number<0){
            System.out.println("Lütfen pozitif sayı giriniz!");
        }else {
            for (int i =1; i<number;i++){
                if (number%i==0){
                    perfect+=i;
                }
            }
            if (perfect==number){
                System.out.println(number+" sayısı mükemmel sayıdır.");
            }else {
                System.out.println(number+" sayısı mükemmel sayı değildir.");
            }
        }

    }
}
