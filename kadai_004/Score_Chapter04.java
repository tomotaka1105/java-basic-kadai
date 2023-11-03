package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		String[] name = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = 0;
		double ave = 0.0;

		for( int i = 0; i < name.length; i++ ) {
			System.out.println( name[i] + "さんは" + score[i] + "点");
		}

		for (int n = 0; n < score.length; n++) {
			sum = sum + score[n];
		}

		ave = sum / score.length;
		System.out.println("平均点は" + ave + "点です。");

	}

}
