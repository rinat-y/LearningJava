package MAI;

public class Discriminant2 {

    public static double root1 (double a, double b, double c) {
        double D, x1;
        D = b*b - 4 * a * c;
        x1 = (-b + Math.sqrt(D))/(2 * a);

        return x1;
    }

    public static double root2 (double a, double b, double c) {
        double D, x2;
        D = b*b - 4 * a * c;
        x2 = (-b - Math.sqrt(D))/(2 * a);

        return x2;
    }

    public static void main(String[] args) {

        System.out.println(root1(1,3,-4));
        System.out.println(root2(1,3,-4));

        Math.sqrt(9);

    }


}


/*
Создать процедуру, которая решает уравнения вида a * x^2 + b * x + c = 0,
где a, b, c - целые числа, задаются литералами внутри этой процедуры.
Решения нужно выводить на консоль, типа "x1 = " + x1 + ", x2 = " + x2, или "no solutions"
Потребуется вычислять квадратный корень из числа.
Для этого можно использовать такой код: Math.sqrt(9) //вернет 3.0
Нужно учесть что любое из a,b,c может быть равно 0, чтобы не нарваться на деление на 0.
*/