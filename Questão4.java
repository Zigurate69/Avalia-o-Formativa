package AVFormativa;

public class Questão4 {

	public static void main(String[] args) {

		int bingo[] = new int [20];

		for(int i=0; i<20; i++) {
				bingo[i] = (int)Math.round(Math.random()*100);
				System.out.println(bingo[i]);
		}

	}
}