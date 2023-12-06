package franxx.code.year;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Y2015 {
    @Test
    void day1() throws FileNotFoundException {
        File file = new File("input/day1"); // replace with your file name
        Scanner scanner = new Scanner(file);

        int floor = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '(') {
                    floor++;
                } else if (line.charAt(i) == ')') {
                    floor--;
                }
            }

        }

        System.out.println(floor);

        scanner.close();
    }

    @Test
    void day2() {
        // 2x3x4
        /*
          Fortunately, every present is a box (a perfect right rectangular prism),
          which makes calculating the required wrapping paper for each gift a little
          easier: find the surface area of the box,
          which is 2*l*w + 2*w*h + 2*h*l. The elves also need a
          little extra paper for each present: the area of the smallest side.
         */
    }
}
