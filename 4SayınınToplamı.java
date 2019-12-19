public static void main(String[] args)
    {
   
        Scanner input = new Scanner(System.in);
        int sayı = 0;
        int toplam = 0;
        
        for (int i = 0; i < 4; i++) 
        {
            System.out.print("Sayı=> ");
            sayı = input.nextInt();
            toplam = toplam + sayı;
            
        }
        System.out.println("Toplam: "+toplam);
        
        
    } 
