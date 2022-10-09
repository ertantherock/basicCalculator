package basicCalculator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz: ");
		a = input.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		b = input.nextInt();
		
		System.out.println("**********************************");
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
		System.out.println("**********************************");
		System.out.print("Seçiminiz: ");
		select = input.nextInt();
		
		if (select == 1) {
			System.out.println("Toplama İşleminizin sonucu: " + (a + b));
		} else if (select ==2) {
			System.out.println("Çıkarma İşleminizin sonucu: " + (a-b));
		} else if (select == 3) {
			System.out.println("Çarpma İşleminizin sonucu: "+ (a*b));
		} else if(select == 4) {
			if(b==0) {
				System.out.println("Bir sayı 0 a bölünemez!");
			}else {
				System.out.println("Bölme İşleminizin sonucu: " + (a/b));
			}			
		}else  {
			System.out.println("Geçersiz bir işlem yaptınız!");
		}
		
	}

}
