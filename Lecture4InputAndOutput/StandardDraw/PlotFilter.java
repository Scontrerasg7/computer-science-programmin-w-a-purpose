public class PlotFilter {
    public static void main(String[] args) {
        double xmin = StdIn.readDouble();
        double ymin = StdIn.readDouble();
        double xmax = StdIn.readDouble();
        double ymax = StdIn.readDouble();

        StdDraw.setXscale(xmin, xmax);
        StdDraw.setXscale(ymin, ymax);

        StdDraw.setPenRadius(0.01);

        while (!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();

            StdDraw.point(x, y);

        }
    }
}