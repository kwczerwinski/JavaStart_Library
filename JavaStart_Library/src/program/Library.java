package program;
public class Library {

	public static void main(String[] args) {
		final String appName = "Biblioteka v0.2";
		  
		Book book1 = new Book();
        book1.title = "W pustyni i w puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 2010;
        book1.pages = 296;
        book1.publisher = "Greg";
        book1.isbn = "9788373271890";
  
        System.out.println(appName);
        System.out.println("\nKsi��ki dost�pne w bibliotece:\n");
        System.out.println("       Tytu�: " + book1.title);
        System.out.println("       Autor: " + book1.author);
        System.out.println("Data wydania: " + book1.releaseDate);
        System.out.println(" Ilo�� stron: " + book1.pages);
        System.out.println("     Wydawca: " + book1.publisher);
        System.out.println("        ISBN: " + book1.isbn);
	}

}