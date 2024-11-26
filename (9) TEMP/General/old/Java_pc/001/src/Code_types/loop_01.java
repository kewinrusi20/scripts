package Code_types;

import java.util.Scanner;

public class loop_01 {

	public static void main(String[] args) {
		 Prova1();
		 Prova2();
		 Prova3();
		 Prova4();

		Scanner sc_selected_task = new Scanner(System.in);

		System.out.println("1: Prova1() \t2: Prova2()");
		System.out.println("3: Prova3() \t4: Prova4()");
		
		System.out.print("Task: ");
		int selected_task = sc_selected_task.nextInt();
		
		System.out.println("");
		
		if (selected_task == 1) {
			System.out.println("== PROVA 1 ==========================\n");
			Prova1();
		} else if (selected_task == 2) {
			System.out.println("== PROVA 2 ==========================\n");
			Prova2();
		} else if (selected_task == 3) {
			System.out.println("== PROVA 3 ==========================\n");
			Prova3();
		} else if (selected_task == 4) {
			System.out.println("== PROVA 4 ==========================\n");
			Prova4();
		}
		
		System.out.println("\n=====================================");
		
		sc_selected_task.close();
	}

	public static void Prova1() {
		Scanner sc = new Scanner(System.in);

		// creating a list of variable (type integer), max 10 items
		int[] nums = new int[10];

		// assigning the first 4 items with predefined values (int)
		nums[0] = 3;
		nums[1] = 55;
		nums[2] = 78;
		nums[3] = 1;

		// assigning a value to the oder items in the list (int)
		for (int i = 4; i <= 9; i++) {
			// getting the number entered in the console
			nums[i] = sc.nextInt();
		}

		// printing each item of the list
		for (int i = 0; i <= 9; i++) {
			System.out.println(nums[i]);
		}

		sc.close();
	}

	public static void Prova2() {
		Scanner sc = new Scanner(System.in);

		// creating a list of variable (type integer), max 10 items
		int[] nums = new int[10];

		// assigning a predefined values to random Integers items
		nums[0] = 3;
		nums[6] = 55;
		nums[4] = 78;
		nums[9] = 1;

		// assigning a value to items that contains 0
		for (int i = 0; i <= 9; i++) {

			// checking if the item at the spot "i" is empty
			if (nums[i] == 0) {
				nums[i] = sc.nextInt();
			}

		}

		// printing each item of the list
		for (int i = 0; i <= 9; i++) {
			System.out.println(nums[i]);
		}

		sc.close();
	}

	public static void Prova3() {

		
		int maxPages = 25;
		String[] book = new String[maxPages];
		// 
		book[0] = "The 100";
		book[1] = "Dare Devil";
		book[2] = "Heidi";
		book[3] = "Lupin";		
		
		for (int currentPage = 0; currentPage < maxPages; currentPage++) {
			if (book[currentPage] == null) {
				book[currentPage] = Integer.toString (currentPage + 1); 
			}
			System.out.println(book[currentPage]);
		};
		
	}

	public static void Prova4() {

		// creating a book with 25 pages
		int maxPages = 25;
		String[] book = new String[maxPages];

		// inserting some films/series in the book (at predefined pages) 
		book[0] = "The 100";
		book[1] = "Dare Devil";
		book[2] = "Heidi";
		book[3] = "Lupin";
		book[15] = "Tenet";
		
		// creating a random counter
		int starterPage = 10;
		
		// creating 2 counter, that count how many pages are empty or filled
		int counterFilledPages = 0;
		int counterEmptyPages = 0;
		
		// looping/iterating throw the pages of the book
		for (int currentPage = 0; currentPage < maxPages; currentPage++) {
			starterPage++; // incrementing the starterPage counter
			
			// checking if the page is empty or filled
			if (book[currentPage] == null) {
				// incrementing this counter if the page is empty
				counterEmptyPages++;
			} else {
				// incrementing this counter if the page is filled
				counterFilledPages++;
			}
			
			// if the page is empty we insert the number contained in "starterPage"
			if (book[currentPage] == null) {
				book[currentPage] = Integer.toString(starterPage); 
			}
			System.out.println(book[currentPage]);
		};
		
		// printing how many pages are empty and filled 
		System.out.println("Empty Pages: "+counterEmptyPages+" | Filled Pages: " + counterFilledPages);
		
	}

	
}
