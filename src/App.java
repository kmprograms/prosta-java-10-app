import java.util.Random;

public class App {
    /*
        Napisz program, w którym dla przykładowej tablicy liczb całkowitych, obliczysz stosunek sumy tych
        elementów, które jednocześnie znajdują się w napisie przekazanym jako argument metody do sumy tych
        elementów, które nie znajdują się tym napisie.
    */

    static double getRatio(int[] numbers, String expression) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Numbers array is null or empty");
        }

        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Expression is null or empty");
        }

        var sumIn = 0;
        var sumOut = 0;

        for (var number : numbers) {
            if (expression.contains(String.valueOf(number))) {
                sumIn += number;
            } else {
                sumOut += number;
            }
        }

        if (sumOut == 0) {
            throw new IllegalStateException("No numbers contained in the expression");
        }

        System.out.println(sumIn);
        System.out.println(sumOut);
        return sumIn / (double)sumOut;
    }


    public static void main(String[] args) {
        var numbers = new int[] {12, 23, 32, 76, 55, 98};
        var expression = "kmprograms1232";
        var ratio = getRatio(numbers, expression);
        System.out.printf("Ratio = %.2f%n", ratio);
    }
}
