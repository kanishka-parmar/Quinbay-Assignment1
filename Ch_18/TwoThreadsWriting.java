//Question:-
/*
BE the JVM(pg 668)
The Java file on this page represents a complete source file. Your job is to play JVM and determine what the output would
be when the program runs. How might you fix it, making sure the output is correct every time?
 */

//Code:-

/* 
import java.util.*;
import java.util.concurrent.*;
public class TwoThreadsWriting {
public static void main(String[] args) {
ExecutorService threadPool = Executors.newFixedThreadPool(2);
Data data = new Data();
threadPool.execute(() -> addLetterToData('a', data));
threadPool.execute(() -> addLetterToData('A', data));
threadPool.shutdown();
}
private static void addLetterToData(char letter, Data data) {
for (int i = 0; i < 26; i++) {
data.addLetter(letter++);
try {
Thread.sleep(50);
} catch (InterruptedException ignored) {}
}
System.out.println(Thread.currentThread().getName() + data.getLetters());
System.out.println(Thread.currentThread().getName()
+ " size = " + data.getLetters().size());
}
}
final class Data {
private final List<String> letters = new ArrayList<>();
public List<String> getLetters() {return letters;}
public void addLetter(char letter) {
letters.add(String.valueOf(letter));
}}

*/

//Solution:-

/*
The above code gives following different output each time we run it.

1)pool-1-thread-1[a, A, B, C, c, D, d, e, E, f, F, G, H, h, i, I, J, j, k, K, l, L, m, M, n, N, o, O, p, P, q, Q, r, R, s, S, t, T, u, U, v, V, w, W, x, X, y, Y, z, Z]      
  pool-1-thread-2[a, A, b, B, C, D, E, e, f, G, g, h, H, I, i, J, j, k, L, l, M, m, N, n, O, o, p, P, Q, q, r, s, S, t, U, u, V, w, W, X, x, Y, Z, z]
  pool-1-thread-1 size = 44
  pool-1-thread-2 size = 44

2.)pool-1-thread-1[a, A, B, C, c, D, d, e, E, f, F, G, H, h, i, I, J, j, k, K, l, L, m, M, n, N, o, O, p, P, q, Q, r, R, s, S, t, T, u, U, v, V, w, W, x, X, y, Y, z, Z]      
   pool-1-thread-1 size = 50
   pool-1-thread-2[a, A, b, B, C, D, E, e, f, G, g, h, H, I, i, J, j, k, L, l, M, m, N, n, O, o, p, P, Q, q, r, s, S, t, U, u, V, w, W, X, x, Y, Z, z]
   pool-1-thread-1 size = 44
   pool-1-thread-2 size = 44
 */

/*
Problems with the Code:
1.)Concurrency Issue: The addLetter method is not thread-safe. When multiple threads access this method concurrently, it may lead to race conditions.
2.)Output Ordering: The order of the output from the two threads is non-deterministic, which might not be what we want.

Solution: 
To fix the concurrency issue, we can use synchronization. Also ensure the output is predictable by managing thread execution more carefully.

If this method is synchronized, only one thread at a time can write to the data, and therefore no updates will be lost.
This will not work if there's a DIFFERENT thread reading at the same time as one of these threads are writing.

*/

//Updated code:-

import java.util.*;
import java.util.concurrent.*;

public class TwoThreadsWriting {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Data data = new Data();
        threadPool.execute(() -> addLetterToData('a', data));
        threadPool.execute(() -> addLetterToData('A', data));
        threadPool.shutdown();
    }

    private static void addLetterToData(char letter, Data data) {
        for (int i = 0; i < 26; i++) {
            data.addLetter(letter++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println(Thread.currentThread().getName() + data.getLetters());
        System.out.println(Thread.currentThread().getName()
                + " size = " + data.getLetters().size());
    }
}

final class Data {
    private final List<String> letters = new ArrayList<>();

    public List<String> getLetters() {
        return letters;
    }

    public synchronized void addLetter(char letter) { // Synchronized
        letters.add(String.valueOf(letter));
    }
}

// Output:-
/*
  We get following output each time we run it:
  
PS G:\Quinbay-Assignment1\Ch_18> java TwoThreadsWriting.java
pool-1-thread-1[a, A, B, b, c, C, D, d, E, e, f, F, g, G, h, H, I, i, j, J, K, k, L, l, m, M, N, n, O, o, p, P, q, Q, R, r, S, s, T, t, u, U, V, v, W, w, x, X, y, Y, z, Z]       
pool-1-thread-2[a, A, B, b, c, C, D, d, E, e, f, F, g, G, h, H, I, i, j, J, K, k, L, l, m, M, N, n, O, o, p, P, q, Q, R, r, S, s, T, t, u, U, V, v, W, w, x, X, y, Y, z, Z]       
pool-1-thread-1 size = 52
pool-1-thread-2 size = 52

PS G:\Quinbay-Assignment1\Ch_18> java TwoThreadsWriting.java
pool-1-thread-2[a, A, B, b, C, c, d, D, e, E, F, f, g, G, H, h, i, I, J, j, k, K, L, l, m, M, n, N, O, o, P, p, Q, q, r, R, S, s, t, T, u, U, V, v, W, w, x, X, y, Y, z, Z]
pool-1-thread-1[a, A, B, b, C, c, d, D, e, E, F, f, g, G, H, h, i, I, J, j, k, K, L, l, m, M, n, N, O, o, P, p, Q, q, r, R, S, s, t, T, u, U, V, v, W, w, x, X, y, Y, z, Z]
pool-1-thread-2 size = 52
pool-1-thread-1 size = 52
 */