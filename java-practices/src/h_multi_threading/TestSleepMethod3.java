package h_multi_threading;

public class TestSleepMethod3 {

	public static void main(String argvs[]) {

		// we can also use throws keyword followed by
		// exception name for throwing the exception
		try {
			for (int j = 0; j < 5; j++) {
				// it throws the exception IllegalArgumentException
				// as the time is -ive which is -100
				Thread.sleep(-100);
				System.out.println(j);
			}
		} catch (Exception expn) {

			System.out.println(expn);
		}
	}
}