import java.util.Scanner;

public class Scores
{
    private final static Scanner SCAN = new Scanner(System.in);
    private final static int COUNT = 5;

    public static void main(String[] args)
    {
        int[] iScores = new int[COUNT];
        int iSum = 0;

        for (int i = 0; i < COUNT; i++)
            iSum += iScores[i] = PromptInt(String.format("Enter the value for %d: ", (i + 1)));

        System.out.println(String.format("Average: %f", (iSum * 1.0) / COUNT));
    }

    protected static int PromptInt(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextInt())
        {
            System.out.flush();

            System.out.print("Enter a number: ");

            SCAN.next();
        }

        return SCAN.nextInt();
    }
}
