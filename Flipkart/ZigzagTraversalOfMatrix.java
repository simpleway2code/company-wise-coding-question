class ZigzagTraversalOfMatrix {
	static final int row = 5;
	static final int col = 4;

	// to find min between two integers
	static int min(int a, int b)
	{
		return (a < b) ? a : b; 
	}

	// to find min of 3 integers
	static int min(int a, int b, int c)
	{
		return min(min(a, b), c);
	}

	// to find max of 2 integers
	static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}

	// function to print matrix in diagonal
	static void diagonalOrder(int matrix[][])
	{

		for (int line = 1;
			line <= (row + col - 1);
			line++) {

			int start_col = max(0, line - row);

			int count = min(line, (col - start_col),
							row);

			for (int j = 0; j < count; j++)
				System.out.print(matrix[min(row, line)
										- j- 1][start_col + j]
								+ " ");

			System.out.println();
		}
	}

	//function to print a matrix
	static void printMatrix(int matrix[][])
	{
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.print("\n");
		}
	}

	// Main Function
	public static void main(String[] args)
	{
		int M[][] = {
			{ 1, 2, 3, 4 },	 { 5, 6, 7, 8 },
			{ 9, 10, 11, 12 }, { 13, 14, 15, 16 },
			{ 17, 18, 19, 20 },
		};
		System.out.print("Given matrix is \n");
		printMatrix(M);

		System.out.print(
			"\nDiagonal printing of matrix is \n");
		diagonalOrder(M);
	}
}

