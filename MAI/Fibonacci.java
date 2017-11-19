package MAI;

class Iterative {

    long fibI(long n) {

        int t;

        long arr[] = new long[(int) n];

        for (t = 0; t < n; t++) {
            if (t < 2) {
                arr[t] = t;
            } else arr[t] = arr[t - 1] + arr[t - 2];
        }

        //for (t = 0; t < n; t++) { // если убрать коменты можно увидеть весь ряд до n
        //    System.out.print((t + 1) + " = ");
        //    System.out.println(arr[t]);
        //}

        return arr[(int) (n - 1)];
    }
}

class Fibonacci {

    public static void main(String[] args) {

        Iterative f = new Iterative();

        // n <= 93, иначе переполняется long
        System.out.println(f.fibI(93));
    }
}


/*
    Написать алгоритм вычисления n'ного числа Фибоначчи
    без использования рекурсии (эта задача попалась мне на интервью в НСПК).
    Алгоритм должен быть реализован в виде метода,
    получающий на вход число n, и возвращающее на выходе соответствующее число Фибоначчи.
    В javadoc'е указать максимальное значение параметра n, не приводящее к переполнению.
*/