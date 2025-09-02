import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var book1 = new Book();
        var book2 = new Book("Programacion en java", "Pedro Martinez", 900);
        var book3 = new Book("Learn English", "John Doe",
         500, LocalDate.of(2015,10,21), "Englisch School", "Aprendizaje");
        
         System.out.println(book1.givemeYourTitle());
         System.out.println(book2.givemeYourTitle());
         System.out.println(book3.givemeYourTitle());

         System.out.println(book1);
         System.out.println(book2);
         System.out.println(book3);

         var person = new Person ("Cesar", "Diaz");
    }
}
