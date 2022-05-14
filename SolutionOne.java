import java.util.Scanner;

public class SolutionOne {

    public static void main(String[] args) {

        String directions;
        Scanner scanner = new Scanner(System.in);
        directions = scanner.next();

        // curr = 0

        int vertical = 0, horizontal = 0;

        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'N') {
                vertical++;
            } else if (directions.charAt(i) == 'S') {
                vertical--;
            } else if (directions.charAt(i) == 'E') {
                horizontal++;
            } else if (directions.charAt(i) == 'W') {
                horizontal--;
            }
        }

        System.out.println(vertical == 0 && horizontal == 0);


    }
}
