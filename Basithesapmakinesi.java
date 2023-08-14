
package basithesapmakinesi;

import java.util.Scanner;

public class Basithesapmakinesi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************");
        
        String islemler = "1. Toplama islemi\n"
                        + "2. Cikarma islemi\n"
                        + "3. Carpma islemi\n"
                        + "4. Bolme islemi";
        
        System.out.println(islemler); 
        System.out.println("********************************");
        System.out.println("islemi secin");
        int a;
        int b;
         String islem = scanner.nextLine();
         
         switch(islem){
             case "1":
                 System.out.println("Birinci Sayi: ");
                 a = scanner.nextInt();
                 System.out.println("İkinci Sayi: ");
                 b = scanner.nextInt();
                 System.out.println("Sayilarin toplami: " + (a+b));
                 break;
             case "2":
                 System.out.println("Birinci Sayi: ");
                 a = scanner.nextInt();
                 System.out.println("ikinci Sayi: ");
                 b = scanner.nextInt();
                 System.out.println("Sayilarin farki: " + (a-b));
                 break;
             case "3":
                 System.out.println("Birinci Sayi: ");
                 a = scanner.nextInt();
                 System.out.println("ikinci Sayi: ");
                 b = scanner.nextInt();
                 System.out.println("Sayilarin carpimi: " + (a*b));
                 break;
             case "4":
                 System.out.println("Birinci Sayi: ");
                 a = scanner.nextInt();
                 System.out.println("ikinci Sayi: ");
                 b = scanner.nextInt();
                 System.out.println("Sayilarin bolumu: " + (a/b));
                 break;
}
           
                   
             
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
    
}
