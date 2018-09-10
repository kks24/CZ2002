import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strList;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print ("\nHow many strings do you want to sort? ");
		size = scan.nextInt();
		strList = new String[size];
		System.out.println ("\nEnter the string...");
		for (int i = 0; i < size; i++)
			strList[i] = scan.nextLine();
			Sorting.selectionSort(strList);
			System.out.println ("\nYour string in sorted order...");
		for (int i = 0; i < size; i++)
			System.out.print(strList[i] + " ");
		System.out.println ();

	}

}
