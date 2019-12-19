 public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayinizi girin: ");
        float sayi1 = input.nextFloat();
        System.out.print("ikinci sayinizi girin: ");
        float sayi2 = input.nextFloat();
        
        float toplam = sayi1 + sayi2;
        float fark = sayi1 - sayi2;
        float carpim = sayi1 * sayi2;
        float bölüm = sayi1 / sayi2;
        
        System.out.println("**************");
        System.out.println("Hesap makinesi");
        System.out.println("**************");
        
        System.out.println("Toplam: "+ toplam);
        System.out.println("fark: "+ fark);
        System.out.println("carpim: "+ carpim);
        System.out.println("bölüm: "+ bölüm);
    }
