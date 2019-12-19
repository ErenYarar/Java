public static void main(String[] args)
    {
   
        Scanner input = new Scanner(System.in);
        int sayı = 1;
        int toplam = 0;
        
        System.out.println("Dilediğiniz kadar tamsayı girin");
        System.out.println("Girişi 0 girerek sonlandırın");
        
        while(sayı != 0)
        {
            System.out.print("sayı=> ");
            sayı = input.nextInt();
            toplam += sayı;
        }
        System.out.println("Toplam: "+ toplam);
        
        
    }
