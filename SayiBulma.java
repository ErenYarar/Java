import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[]{1,2,3,4,7,8,9,0};
        System.out.println("Num: ");
        int search = input.nextInt();
        //int search = 4;
        boolean isThere = false;

        for (int num : nums)
        {
            if (num == search)
            {
                isThere = true;
                break;
            }
        }
        if (isThere)
        {
            System.out.println("Aranan sayi dizide mevcuttur.");
        }
        else
        {
            System.out.println("Aranan sayi dizide mevcut değildir.");
        }
    }
}
