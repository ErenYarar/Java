public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ad => ");
        String ad = new String(input.next());
        System.out.print("Soyad => ");
        String soyad = new String(input.next());
        
        System.out.println("Merhaba" + " " + ad + " " + soyad);
        System.out.println(ad.charAt(0) + " . " + soyad.charAt(0) + " . ");
        
        
    }
