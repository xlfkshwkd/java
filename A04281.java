public class A04281 {

    public static void main(String[] args) {
        final int ROW = 21;
        int a[][]= new int[ROW][ROW];
        for (int i = 0; i < ROW;i++) {
            for (int j = 0; j < i; j++) {
                a[i][j] = i*j;
                System.out.print(i + " * " + j + " = " + i*j + "  ");
            }
            System.out.println();
        }
    }

}