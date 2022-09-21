package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		  int sayi = 28;
	        boolean isPrime = true;

	        if(sayi<1){
	            System.out.println("Asallığı sorgulanamayan sayı girdiniz.");
	            return;
	        }
	        if(sayi == 1){
	            System.out.println("Sayı asal değildir.");
	        }

	        for (int i=2 ; i<sayi; i++){
	            if(sayi%i==0){
	                isPrime= false;
	            }
	        }

	        if (isPrime){
	            System.out.println("sayınız asal");
	        }else {
	            System.out.println("Sayınız asal değildir.");
	        }


	}

}
