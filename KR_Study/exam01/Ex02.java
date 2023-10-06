package exam01;

public class Ex02 {
    public static void main(String[] args) {
        double h1 = 1.5;
        double d = 20.0;
        double angle = 60.0;

        double Radians = Math.toRadians(angle);
        double h = Math.tan(Radians) * d;

        double tower = h + h1; 


        System.out.println("건물의 높이: " + tower + " 미터");
    }
}

