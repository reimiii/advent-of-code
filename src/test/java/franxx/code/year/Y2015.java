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
//        int position = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '(') {
                    floor++;
                } else if (line.charAt(i) == ')') {
                    floor--;
                }

                if (floor == -1) {
                    System.out.println("First Position : " + (i + 1));
                    break;
                }
            }

        }

        System.out.println(floor);

        scanner.close();
    }

    @Test
    void day2() throws FileNotFoundException {
        // 2x3x4
        /*
          Fortunately, every present is a box (a perfect right rectangular prism),
          which makes calculating the required wrapping paper for each gift a little
          easier: find the surface area of the box,
          which is 2*l*w + 2*w*h + 2*h*l. The elves also need a
          little extra paper for each present: the area of the smallest side.
          They have a list of the dimensions (length l, width w, and height h)
         */
        File file = new File("input/day2"); // replace with your file name
        Scanner scanner = new Scanner(file);

        int lineCount = 0;
        int sum = 0;
        int sumTwo = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] xes = line.trim().split("x");

            int[] dimensions = new int[xes.length]; // 3

            for (int i = 0; i < xes.length; i++) {
                dimensions[i] = Integer.parseInt(xes[i]);
            }

            System.out.println(dimensions[0]);
            System.out.println(dimensions[1]);
            System.out.println(dimensions[2]);

            int l = dimensions[0];
            int w = dimensions[1];
            int h = dimensions[2];

            int minLW = 2 * (l + w);
            int minWH = 2 * (w + h);
            int minHL = 2 * (h + l);

            int min = Math.min(Math.min(minLW, minWH), minHL);
            System.out.println("Shortest distance: " + min);

            int wrap = l * w * h;
            int total = min + wrap;

            System.out.println("min: " + min);
            System.out.println("wrap: " + wrap);
            System.out.println("total: " + total);
            final int number = 2;

            int lw = dimensions[0] * dimensions[1];
            int wh = dimensions[1] * dimensions[2];
            int hl = dimensions[2] * dimensions[0];

            int lowest = lw;

            if (wh < lowest) {
                lowest = wh;
            }

            if (hl < lowest) {
                lowest = hl;
            }

            int square = (number * lw) + (number * wh) + (number * hl);

            sum += (square + lowest);
            sumTwo += total;
            System.out.println("low: " + lowest);

            System.out.println("=======================");
            lineCount++;
        }

        System.out.println("part 1 - sum: " + sum);
        System.out.println("Part 2 : " + sumTwo);
        System.out.println("ALL LINE: " + lineCount);
        scanner.close();
    }
}
