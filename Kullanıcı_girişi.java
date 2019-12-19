public static void main(String[] args) 
    {            
        Scanner input = new Scanner(System.in);
        
        String kullanıcı="eren";
        String sifre = "1234";
        int hak = 3;
        
        
        while(true){
        
        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullanıcı_adı = new String(input.next());
        System.out.print("Parolanızı giriniz: ");
        String parola = new String(input.next());
            
        
            
        if(kullanıcı.equals(kullanıcı_adı) && sifre.equals(parola))
        {
            System.out.println("Hosgeldiniz..");             
            break;
        }
        else
        {
            System.out.println("Kullanıcı adınız ve ya şifreniz yanlış");
            hak -= 1;
            System.out.println("Kalan hakkınız: " + hak);                
        }
        
        if(hak == 0)
        {
            System.out.println("Hakkınız bitmiştir");
            break;
        }
                
                
    }          
        
   }
