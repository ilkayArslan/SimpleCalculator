import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1,num2,sonuc;
        int operation;

        Scanner input = new Scanner(System.in);
        System.out.print("Number one please : ");
        num1 = input.nextInt();
        System.out.print("Number two please : ");
        num2 = input.nextInt();
        System.out.println("Toplama için 1 \n Çıkarma için 2  \n Çarpma için 3 \n Bölme için 4 tuşuna basınız");
        operation = input.nextInt();
        switch (operation){
            case 1:
                System.out.println("Toplama işlemi sonucu : "+(num1+num2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu : "+(num1-num2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu : "+(num1*num2));
                break;
            case 4:
                if(num2 != 0) {
                    sonuc = num1 / num2;
                    System.out.println("Bölme işlemi sonucu : " + sonuc);
                }else {
                    System.out.println("İkinci sayı sıfır olamaz");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz");
        }

    }
}