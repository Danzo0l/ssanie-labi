package custom.matrix;

public class UsualMatrix extends AbstractMatrix {
    private final double[][] matrix;

    public UsualMatrix(int size) {
        super(size, size);
        matrix = new double[size][size];
    }

    public UsualMatrix(int rows, int columns) {
        super(rows, columns);
        matrix = new double[rows][columns];
    }

    public double getElement(int row, int column) {
        return matrix[row][column];
    }

    public void setElement(int row, int column, double value) {
        matrix[row][column] = value;
    }

    public UsualMatrix add(UsualMatrix matrix) {
        return (UsualMatrix) super.add(matrix);
    }

    public UsualMatrix product(UsualMatrix matrix) {
        return (UsualMatrix) super.product(matrix);
    }

    public AbstractMatrix createMatrix(int rows, int columns) {
        return new UsualMatrix(rows, columns);
    }
}