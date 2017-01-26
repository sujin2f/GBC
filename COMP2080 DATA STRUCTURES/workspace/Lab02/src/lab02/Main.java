package lab02;

public class Main {

	public static void main(String[] args) {
		int n = 1000;
		long startTime = 0;
		long endTime = 0;

		startTime = System.currentTimeMillis();
		int n1 = n(n);
		endTime = System.currentTimeMillis();
		timeDisplay(startTime, endTime);

		startTime = System.currentTimeMillis();
		int n2 = n2(n);
		endTime = System.currentTimeMillis();
		timeDisplay(startTime, endTime);

		startTime = System.currentTimeMillis();
		int n3 = n3(n);
		endTime = System.currentTimeMillis();
		timeDisplay(startTime, endTime);

		// System.out.println(n1);
		// System.out.println(n2);
		// System.out.println(n3);
	}

	private static int n(int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			sum += i;

		return sum;
	}

	private static int n2(int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				sum += i * j;

		return sum;
	}

	private static int n3(int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				for (int k = 0; k < n; k++)
					sum += i * j / (k + 1);

		return sum;
	}

	private static void timeDisplay(long startTime, long endTime) {
		System.out.println("That took " + (endTime - startTime));
	}
}
