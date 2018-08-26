public class Main
{
	public static void main(String args[]) {
		Library library = new Library();
		Book legends = new Book("legends", "contents");
		Book missingPlane = new Book("Missing Plane", "contents");
		Book deathlyHallows = new Book("Deathly Hallows", "contents");
		library.addBook(legends);
		library.addBook(missingPlane);
		library.addBook(deathlyHallows);
		library.bookList();
		library.removeBook(deathlyHallows);
		library.bookList();
		library.findBook(legends);
		library.findBook(deathlyHallows);
	}
}