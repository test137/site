import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = br.readLine()) != null) {
            if (s.isEmpty() || s.equals("0"))
                break;
            int g = Integer.parseInt(s);
            if (g <= 1) {
                System.out.println(0);
            } else {
                System.out.println(getMaxNum(g));
            }
        }
    }

    private static int getMaxNum(int g) {
        int maxNum = 0;
        while (g > 2) {
            maxNum += g / 3;
            g = g / 3 + g % 3;
        }
        if (g == 2) {
            return ++maxNum;
        }
        return maxNum;
    }
}