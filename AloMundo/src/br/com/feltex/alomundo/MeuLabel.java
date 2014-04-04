package br.com.feltex.alomundo;

public class MeuLabel {

	public static void main(String[] args) {		
		label1: for (int i = 1; i <= 3; i++) {
			label2: for (int j = 1; j <= 3; j++) {
				label3: for (int k = 1; k <= 3; k++) {
					System.out.print(k);
					if (k == 2){
						break label1;
					}
				}
				System.out.println();
				// line2
			}
			System.out.println();
			// line3
		}		

	}
}
