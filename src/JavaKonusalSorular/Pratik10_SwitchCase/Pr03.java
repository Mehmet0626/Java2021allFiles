package JavaKonusalSorular.Pratik10_SwitchCase;

import java.util.Scanner;

public class Pr03 {

	public static void main(String[] args) {
		// Kullanicidan gun ismini alip
		// haftaici veya hafta sonu yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen gun ismi giriniz : ");
		String gunIsmi=scan.next().toLowerCase();
		
		switch(gunIsmi) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("Haftaici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("Haftasonu");
			break;
		default:
		System.out.println("Lutfen gecerli gun ismi giriniz");
		
		scan.close();
		}

	}

}
