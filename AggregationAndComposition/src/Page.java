
public class Page {
	String content;
	
	Page(String content){
		this.content=content;
		
	}
	void writeContent() {
		System.out.println("Writting content inside the "+content+" book");
	}

}
