public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("=> ");
        int a = input.nextInt();
        System.out.println("=> ");
        int b = input.nextInt();
        System.out.println("İşlemini seç-> ");
        String islem = new String(input.next());
        
        switch(islem){
            case "1":
                System.out.println("1 işlemi seçildi");
                System.out.println("Toplama yapılıyor...");
                System.out.println(a + " + " + b + " = " + (a+b)); break;
            case "2":
                System.out.println("2 işlemi seçildi");
                System.out.println("Cıkarma yapılıyor...");
                System.out.println(a + " - " + b + " = " + (a-b)); break;
            case "3":
                System.out.println("3 işlemi seçildi");
                System.out.println("Carpma yapılıyor...");
                System.out.println(a + " * " + b + " = " + (a*b)); break;
            case "4":
                System.out.println("4 işlemi seçildi");
                System.out.println("Bölme yapılıyor...");
                System.out.println(a + " / " + b + " = " + (a/b)); break;
            default: System.out.println("Hatalı işlem"); break;
        }               
    }
