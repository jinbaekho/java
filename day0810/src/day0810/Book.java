package day0810;

public class Book {
	private String title;
	private String author;
	private String description;


	public Book() {}

	public Book(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("1:%s 2:%s 3:%s",this.title,this.author,this.description);
	}
	
	public class Book02 {
		private String title02;
		private String author02;
		private String description02;
		
		public Book02() {}
		public Book02 ti02(String title02) {
			this.title02=title02;
			return this;
		}
		public Book02 au02(String author02) {
			this.author02=author02;
			return this;
		}
		public Book02 de02(String description02) {
			this.description02=description02;
			return this;
		}
		public Book02 build() {
			return new Book02(this.title02,this.author02,this.description02);
		}
	
	}                   
}
