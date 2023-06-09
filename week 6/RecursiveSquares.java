public class RecursiveSquares {

    // Draws a square centered on (x, y) of the given side length
    // with a light gray background and black border.
    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length / 2.0);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length / 2.0);
    }

    // Draws a recursive square pattern of order n, centered on (x, y)
    // of the given side length.
    public static void draw(int n, double x, double y, double length) {
        if (n > 0) {
            draw(n - 1, x - (length / 2.0), y + (length / 2.0), length / 2.0);
            draw(n - 1, x + (length / 2.0), y + (length / 2.0), length / 2.0);
            drawSquare(x, y, length);
            draw(n - 1, x - (length / 2.0), y - (length / 2.0), length / 2.0);
            draw(n - 1, x + (length / 2.0), y - (length / 2.0), length / 2.0);
        }
    }

    // Takes an integer command line argument n and draws a recursive
    // square pattern of integer of order n, centered on (0.5, 0.5) with side length 0.5
    public static void main(String[] args) {
        double x0 = 0.5, y0 = 0.5, sideLength = 0.5;
        int n = Integer.parseInt(args[0]);
        draw(n, x0, y0, sideLength);
    }
}
