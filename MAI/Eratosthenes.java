package MAI;

public class Eratosthenes {
    public static void main(String[] args) {
        int n, i;
        n = 50;
        int arr[] = new int[n];

        for (i = 2; i < n; i++) {
            arr[i] = i;
        }

        for (i = 2; i < n; i++ ) {
            System.out.println(arr[i]);
        }
    }


}


/*
    Реализовать алгоритм нахождения простых чисел "решето Эратосфена"
    (эта задача попалась мне на интервью в mail.ru, и я ее завалил).
    На википедии есть его подробное словесное описание.
    Суть в том, что выписываются все натуральные числа до n,
    а потом из них последовательно зачеркиваются не-простые числа.
    Алгоритм должен получать на вход это число n, и должен распечатать простые числа.
    Я бы сделал это так: создал бы массив isCrossedOut типа boolean[n+1]
    (чтобы индекс соответствовал числу, +1 нужно т.к. массивы индексируются с 0).
    И потом если число i зачеркивается, делал бы isCrossedOut[i] = true.
*/