public static void main(String[] args) 
    {
    
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayinizi girin: ");
        float sayi1 = input.nextFloat();
        System.out.print("ikinci sayinizi girin: ");
        float sayi2 = input.nextFloat();
        
        float ortalama = (sayi1 + sayi2) / 2;
        
        System.out.println("Ortalama: "+ ortalama);
               
    }
