import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Tema{
	public static void main(String[] args){
		System.out.println(rezultatProdus(new int[]{1,2,3,4,5,6}));
		System.out.println(rezultatImpar(new int[]{1,2,3,4,5,6}));
		System.out.println("{" + sirNumereMaiMiciCaN(new int[]{1,1,2,3,4,2,1,2},5) + "}");
		System.out.println(donatiiPanaLaLimita(1000));
		System.out.println(donatiiLimitaDeNumar(3500, 4));
		frazaTaiataPunct("Ce mai faci ma Gheorghe.Da bine mai Ioane.No super.");
	}

	public static int rezultatProdus(int[]a){
		int rezultatInmultire=1;
		for(int c : a){
			rezultatInmultire = rezultatInmultire *c;
		}
		return rezultatInmultire;
	}
	public static int rezultatImpar(int[] a){
		int nrCountImpar=0;
		for(int c:a){
			if((c % 2) !=0){
				nrCountImpar=nrCountImpar+1;
			}
		}
		return nrCountImpar;
	}

	public static String sirNumereMaiMiciCaN(int[] a, int b){
		String rezultat="";
		for(int c :a){
			if(c<b){
				rezultat=rezultat + c +" ";
			}
		}
		rezultat=rezultat.trim();
		return rezultat;
	}

	public static String donatiiPanaLaLimita(int a){
		//String s ="Succes";
		int totalDonatii=0;
		Random random = new Random();
		while(totalDonatii<a){
			totalDonatii = totalDonatii + (random.nextInt(99)+1);
			//System.out.println(totalDonatii); - just to check how it develops;
		}
		return "Succes";
	}

	public static String donatiiLimitaDeNumar(int a, int b){
		String succes="Succes";
		int totalDonatiii=0;
		Random random = new Random();
		int i=1;
		while(i<=b){
			if(totalDonatiii<=a){
				totalDonatiii= totalDonatiii + (random.nextInt(9999)+1);
				System.out.println(totalDonatiii);
			}
			i++;
		}
		return succes;
	}

	public static String[] frazaTaiataPunct(String a){
		String[] frazaTaiata= a.split("\\.");
		for(String x: frazaTaiata){
			System.out.println(x);
		}
		return frazaTaiata;
	}
}
