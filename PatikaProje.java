import java.util.Arrays;

public class PatikaProje {

	public static void main(String[] args) {
		int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
		int[] array2 = {};
		int count;
		
		System.out.println("Dizi : " + Arrays.toString(array));
		System.out.println("Tekrar Sayıları");
		
		for (int i : array) {
			if (!inArray2(i, array2)) {
				array2 = Arrays.copyOf(array2, array2.length + 1);
				array2[array2.length - 1] = i;
			}
		}
		
		for (int i : array2) {
			count = 0;
			for (int j : array) {
				if (i == j) count++;
			}
			System.out.println(i + " sayısı " + count + " kere tekrar edildi.");
		}
	}

	private static boolean inArray2(int i, int[] array2) {
		for (int x : array2) {
			if (x == i) return true;
		}
		return false;
	}



}
