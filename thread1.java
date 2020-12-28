public class Main
{
    public static void main(String[] args)
    {
        Islem v1 = new Islem("Ilk: ");
        Thread t1 = new Thread(v1);

        Islem v2 = new Islem("Son: ");
        Thread t2 = new Thread(v2);

        t1.start();
        t2.start();
    }
}

class Islem implements Runnable{
    String name;

    public Islem(String name)
    {
        this.name = name;
        System.out.println(name + " Olusturuldu");
    }

    @Override
    public void run()
    {
        try{
            for (int i = 5;i > 0;i--){
                System.out.println(this.name + " " + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(this.name + " hata olustu");
        }
        System.out.println(name + " islemi Bitti");
    }
}
