import java.sql.SQLOutput;

public class Tema{
	public static void main(String[] args){
		System.out.println(rezultatProdus(new int[]{1,2,3,4,5,6}));
	}

	public static int rezultatProdus(int[]a){
		int rezultatInmultire=1;
		for(int c : a){
			rezultatInmultire = rezultatInmultire *c;
		}
		return rezultatInmultire;
	}
}
