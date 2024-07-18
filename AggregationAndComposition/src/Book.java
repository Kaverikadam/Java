
public class Book {
	String author;
	Page pg=new Page("SQL");
	Book(String author){
		this.author=author;
	}
	void readBook() {
		System.out.println("Reading book by written "+author);
	}
}
