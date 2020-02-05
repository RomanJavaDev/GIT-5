
import java.util.HashMap;
import java.util.Map;
import java.io.*;


public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String s;

        while ((s = fr.readLine()) != null) {
            String[] arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                try  {
                    int n = Integer.parseInt(arr[i]);
                    for (Map.Entry<Integer, String> pair : map.entrySet()) {
                        if (pair.getKey().equals(n)) {
                            arr[i] = pair.getValue();
                        }
                    }

                } catch (NumberFormatException e) {}

            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        fr.close();
    }
}

