public static void main(String[] args) 
    {               
        /*
        1->bakiye görüntüleme
        2-> para yatırma
        3-> para cekme
        4->
        
        */    
        
        Scanner input = new Scanner(System.in);            
        int bakiye = 1000;
        
        
        while(true)
        {
            System.out.println("İslemi giriniz: ");
            String islem = new String(input.next());
            if(islem.equals("1"))
            {
                System.out.println("İslem 1'i sectiniz...");
                System.out.println("Bakiye hesaplanıyor...");
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if(islem.equals("2"))
            {
                System.out.println("İşlem 2'yi seçtiniz..");
                System.out.print("Miktar giriniz: ");
                int miktar = input.nextInt();
                if(miktar > 3000)
                {
                    System.out.println("3000'den fazla para yatıramazsınız..");
                    break;
                }
                bakiye += miktar;
                System.out.println("Bakiye: " + bakiye);
                
            }
            else if(islem.equals("3"))
            {
                System.out.println("İşlem 3'ü seçtiniz..");
                System.out.print("Çekeceginiz miktarı giriniz: ");
                int miktar = input.nextInt();
                if(bakiye - miktar < 0)
                {
                    System.out.println("Sıfırın altında para cekemezsiniz...");
                    break;
                }
                bakiye -= miktar;
                System.out.println("Bakiye: " + bakiye);
            }
            else if(islem.equals("q"))
            {
                System.out.println("Çıkılıyor...");
                break;
            }
            else
            {
                System.out.println("Hatalı işlem secimi");
                break;
            }
            
        }
                
                
                
        
   }
