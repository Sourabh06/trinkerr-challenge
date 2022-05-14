import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SolutionTwo {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        long ans = 0L;
        ArrayList<String> inputArray = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            inputArray.add(scanner.next());
        }

        // [3,30,9] => 9330
        // 3,9,30 -> 3930,9330,3093
//        3309,3093,9303
        // sort,
        Collections.sort(inputArray);

        // 9,30,91,90, 99 => 99 9 91 90 30 or 9 99 91 90 30
        // 8,30,91,90, 99 => 99 91 90 30 8
        String temp = "";
        HashMap<Integer, String> tempMap = new HashMap<>(10);
        for (int i = 0; i < inputArray.size(); i++) {
            temp = inputArray.get(i);
            for (int j = inputArray.size() -1; j >= 0; j--) {
                if (!inputArray.get(j).equals(temp))
                    temp += inputArray.get(j);
            }
            tempMap.put(i, temp);
        }
        int loc = -1;
        for (int i = 0; i < tempMap.size(); i++) {
            long aLong = Long.parseLong(tempMap.get(0));
            if (aLong > ans) {
                ans = aLong;
                loc = i;
            }

        }

        System.out.println(tempMap.get(loc));

    }
}
