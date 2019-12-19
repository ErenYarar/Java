public static void main(String[] args) throws FileNotFoundException
    {
        File dosya = new File("C:/data.txt");
        PrintWriter output = new PrintWriter(dosya);
        output.print("Hello World");
        output.close();
    } 
