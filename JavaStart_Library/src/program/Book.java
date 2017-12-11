package program;

class Book {
	
	String title;
	String author;
	int releaseDate;
	int pages;
	String publisher;
	String isbn;
	
	Book(	String bookTitle,
			String bookAuthor,
			int bookRelease,
			int bookPages,
			String bookPublisher,
			String bookIsbn) {
		title = bookTitle;
		author = bookAuthor;
		releaseDate = bookRelease;
		pages = bookPages;
		publisher = bookPublisher;
		isbn = bookIsbn;
	}
	
	void printInfo() {
		System.out.println("       Tytu�: " + this.title);
		System.out.println("       Autor: " + this.author);
		System.out.println("Data wydania: " + this.releaseDate);
		System.out.println(" Ilo�� stron: " + this.pages);
		System.out.println("     Wydawca: " + this.publisher);
		System.out.println("        ISBN: " + this.isbn);
		System.out.println();
	}
	
}