package quanlysach2;
import java.util.Scanner;

public class Book {
	private String name;
	private int id;
	private String Language;
	private int giaKM;
	private String Author;
	private String NgaySua;
	private String ISBN;
	
	public Book() {
	}

	

	public Book(String name, int id, String language, int giaKM, String author, String ngaySua, String iSBN) {
		super();
		this.name = name;
		this.id = id;
		this.Language = language;
		this.giaKM = giaKM;
		this.Author = author;
		this.NgaySua = ngaySua;
		this.ISBN = iSBN;
	}

	public static Scanner input_number = new Scanner(System.in);	
	public static Scanner input_string = new Scanner(System.in);
	public void input() {	
		System.out.println("name: ");
		name = input_string.nextLine();
		System.out.println("id: ");
		id = input_number.nextInt();
		System.out.println("Language: ");
		Language = input_string.nextLine();
		System.out.println("price: ");
		giaKM = input_number.nextInt();
		System.out.println("Author ");
		Author = input_string.nextLine();
		System.out.println("publish date: ");
		NgaySua = input_string.nextLine();
		
	}
	
	
	public void display() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", Language=" + Language + ", giaKM=" + giaKM + ", Author="
				+ Author + ", NgaySua=" + NgaySua + ", ISBN=" + ISBN + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}


	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}


	public int getGiaKM() {
		return giaKM;
	}
	public void setGiaKM() {
		this.giaKM = giaKM;
	}

	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}


	public String getNgaySua() {
		return NgaySua;
	}
	public void setNgaySua(String ngaySua) {
		NgaySua = ngaySua;
	}



	public String getISBN() {
		return ISBN;
	}



	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


}