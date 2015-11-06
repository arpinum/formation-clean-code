public class BookRegistry {

	public List<Book> getBooks() {
		return Collections.unmodifiableList(books);
	}

	private List<Book> books = Lists.newArrayList();
}




//

bookRegistry.getBooks().add(book) // throws
