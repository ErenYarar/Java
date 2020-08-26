public class Main
{
    public static void main(String[] args)
    {
	    int num1 = 220;
	    int num2 = 284;
	    int total1 = 0;
	    int total2 = 0;

	    for (int i = 0; i < num1; i++)
        {
            if (num1 % i == 0)
            {
                total1 = total1 + 1;
            }
        }

        for (int i = 0; i < num2; i++)
        {
            if (num2 % i == 0)
            {
                total2 = total2 + 1;
            }
        }

        if (num1 == total2 && num2 == total1)
        {
            System.out.println("Bu iki sayi arkadaştır.");
        }
        else
        {
            System.out.println("Bu iki sayi arkadas değildir.");
        }
    }
}
