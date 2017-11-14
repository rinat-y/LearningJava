package MAI;

public class Discriminant {
    public static void main(String[] args) {
        double a, b, c, D;

        a = 1;
        b = 9;
        c = -22;

        D = (b * b) - (4 * a * c);

        if (c == 0 & b != 0) {
            System.out.println("x1 = " + 0);
            System.out.println("x2 = "+ (- b / a));
        }

        else if (c != 0 & b == 0) {
             if (c < 0 & a >0) {
                System.out.println("x1 = " + (Math.sqrt(-c / a)));
                System.out.println("x2 = " + (-Math.sqrt(-c / a)));
             } else if (c > 0 & a < 0) {
                        System.out.println("x1 = " + (Math.sqrt(-c / a)));
                        System.out.println("x2 = " + (-Math.sqrt(-c / a)));
                    } else System.out.println("корней нет");
        }

        else if (b == 0 & c == 0) {
            System.out.println("x1 = x2 = 0");
        }

        else if (b != 0 & c != 0) {
            if (D > 0) {
                System.out.println ("x1 = " + (-b + Math.sqrt(D)) / (2 * a));
                System.out.println ("x2 = " + (-b - Math.sqrt(D)) / (2 * a));

            }else if (D == 0){
                System.out.println("x1 = x2 = " + (-b / (2 * a)));
            }else System.out.println("корней нет");

        }
    }
}
