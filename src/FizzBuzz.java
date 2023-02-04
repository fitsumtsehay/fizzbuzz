//Given a number n, for each integer i in the range
//        from 1 to n inclusive, print one value per line as
//        follows:
//        • If i is a multiple of both 3 and 5, print FizzBuzz.
//        • If i is a multiple of 3(but not 5), print Fizz.
//        • If i is a multiple of 5(but not 3), print Buzz.
//        • If i is not a multiple of 3 or 5, print the value of i

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100;

        // loop for 100 times
        for (int i=1; i<=n; i++)
        {
            //number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in
            // place of the number
                if (i%3==0 && i%5==0)

                    System.out.println("FizzBuzz");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i%5==0)
                System.out.println("Buzz");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i%3==0)
                System.out.println("Fizz");

            else // print the numbers
                System.out.println(i);
        }
    }
}

