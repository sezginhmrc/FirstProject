package Repl_And_Practice;

public class WhileLoopPractice {
    public static void main(String[] args) {

        int monkey = 6;

        while (monkey > 0) {
            --monkey;
            System.out.println(monkey + " little monkeys jumping on the bed,\n" +
                    "One fell down and bumped his head,\n" +
                    "Mama called the doctor and the doctor said,\n" +
                    "No more monkeys jumping on the bed!");
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;  // continue skips current iteration which is fine above .
            }
            System.out.println("even numbers : " + i);
            int i1 = 0;
            while (i1 < 5) {

                System.out.println("Rows : " + i1);
                i1++;
            }

        }


    }
}
