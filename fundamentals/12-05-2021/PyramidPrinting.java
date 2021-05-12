package javalearing;

public class PyramidPrinting {
	int rows = 6, column = 6;

	PyramidPrinting(int rows, int column) {
		this.rows = rows;
		this.column = column;
	}

	public void print() {
		for (int i = 0; i <= rows; i++) {

			for (int j = rows - i; j > 0; j--) {
				// printing spaces
				System.out.print(" ");
			}
			for (int j = 0; j <= i - 2; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();

		}
	}

	public static void main(String[] args) {

		PyramidPrinting obj = new PyramidPrinting(8, 8);
		obj.print();
	}
