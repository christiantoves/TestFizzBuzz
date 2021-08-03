public class TestFizzBuzz {
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();

        System.out.print(tester.fizzBuzz(9));
        System.out.print(tester.fizzBuzz(10));
        System.out.print(tester.fizzBuzz(15));
        System.out.print(tester.fizzBuzz(16));
        System.out.print(tester.fizzBuzz(2));

        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }
    }
}