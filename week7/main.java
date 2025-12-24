package week7;

public class main
{
     public static void main(String[] args)
        {
            Book b1 = new Book();
            b1.Price= 100;
            b1.author="collen Hover";
            b1.genra = "Horror";
            b1.Title="IT";
           
    System.out.println(b1.Price);
    System.out.println(b1.author);
    System.out.println(b1.genra);
    System.out.println(b1.Title);
    
            Book b2= new Book();
            b2.Price= 300;
            b2.author="JK rowling";
            b2.genra = "Comedy";
            b2.Title = "harry pottor";
    System.out.println(b2.Price);
    System.out.println(b2.author);
    System.out.println(b2.genra);
    System.out.println(b2.Title);
    
        }
}