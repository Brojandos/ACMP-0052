import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Brojandos.
 * @creation_date: 26.02.2017.
 */
public class Main {
    private static byte l;

    public static void main(String[] args) throws IOException {
        byte[] b = getTicketNumbers();
        System.out.println(b[0] + b[1] + b[2] == b[l - 1] + b[l - 2] + b[l - 3] ? "YES" : "NO");
    }

    private static byte[] getTicketNumbers() throws IOException {
        char[] ticket = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        l = (byte) ticket.length;
        byte[] numbers = new byte[l];
        for (int i = 0; i < l; i++) {
            numbers[i] = Byte.parseByte(String.valueOf(ticket[i]));
        }
        return numbers;
    }
}