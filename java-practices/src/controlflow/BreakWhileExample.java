package controlflow;

public class BreakWhileExample {

	public static void main(String[] args) {

		// while loop
		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				// using break statement
				i++;
				break;// it will break the loop /// 1 2 3 4
			}
			System.out.println(i);
			i++;
		}
	}
}

// diable break
// 1 2 3 4 6 7 8 9 10