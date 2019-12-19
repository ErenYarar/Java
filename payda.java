 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Pay: ");
    float pay = input.nextFloat();
    System.out.print("Payda: ");
    float payda = input.nextFloat();
    
    
    if(payda == 0)
    {
        System.out.println("payda 0 olamaz..");
    }
    else
    {
        float sonuc = pay / payda;
        System.out.println("Sonuc:"+sonuc);
    }
} 
