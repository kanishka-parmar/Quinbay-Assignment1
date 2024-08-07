package Ch_17.Exercise.Pg_634;

//Question:-
/*
Code Magnets:
A working Java program is scrambled up on the fridge. Can you reconstruct the code snippets to make a working Java program that produces the
output listed below?

Output:-
% java PingingClient
Networking established
09:27:06 Sent ping 0
09:27:07 Sent ping 1
09:27:08 Sent ping 2
09:27:09 Sent ping 3
09:27:10 Sent ping 4
09:27:11 Sent ping 5
09:27:12 Sent ping 6
09:27:13 Sent ping 7
09:27:14 Sent ping 8
09:27:15 Sent ping 9
 */

//Solution:-

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.time.format.FormatStyle;
import java.util.concurrent.TimeUnit;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.LocalDateTime.now;
import static java.time.format.DateTimeFormatter.ofLocalizedTime;

public class PingingClient {
    public static void main(String[] args) {
        InetSocketAddress server = new InetSocketAddress("127.0.0.1", 5000);
        try (SocketChannel channel = SocketChannel.open(server)) {
            PrintWriter writer = new PrintWriter(Channels.newWriter(channel, UTF_8));
            System.out.println("Networking established");
            for (int i = 0; i < 10; i++) {
                String message = "ping " + i;
                writer.println(message);
                writer.flush();
                String currentTime = now().format(ofLocalizedTime(FormatStyle.MEDIUM));
                System.out.println(currentTime + " Sent " + message);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Output:-
/*
PS G:\Quinbay-Assignment1\Ch_17\Exercise\Pg_634> javac PingingClient.java
PS G:\Quinbay-Assignment1\Ch_17\Exercise\Pg_634> java PingingClient.java 
Networking established
11:47:55 pm Sent ping 0
11:47:56 pm Sent ping 1
11:47:57 pm Sent ping 2
11:47:58 pm Sent ping 3
11:47:59 pm Sent ping 4
11:48:01 pm Sent ping 5
11:48:02 pm Sent ping 6
11:48:03 pm Sent ping 7
11:48:04 pm Sent ping 8
11:48:05 pm Sent ping 9
 */