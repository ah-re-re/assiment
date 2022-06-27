package quanlysach2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Athor extends Book{
	
	ArrayList<Book> arrBooks = new ArrayList<>();
	private String author;
	private String language;
	private float price;
	private static float PriceMin;
    private static float PriceMax;
	
	public Athor() {
	}
	
	public static Scanner input_number = new Scanner(System.in);	
	public static Scanner input_string = new Scanner(System.in);
	
	static void filterbyauthor(ArrayList<Book> arrBooks, String a) {
		for (int i = 0; i < arrBooks.size(); i++)
			if ( arrBooks.get(i).getAuthor().equalsIgnoreCase(a)) {
				System.out.println(arrBooks.get(i).toString());
			}else
				System.out.println("erro");
	}

	static void filterbylanguage(ArrayList<Book> arrBooks, String b) {
		for (int i = 0; i < arrBooks.size(); i++)
			if ( arrBooks.get(i).getAuthor().equalsIgnoreCase(b)) {
				System.out.println(arrBooks.get(i).toString());
			}else
				System.out.println("erro");
	}
	static void filterbyprice(ArrayList<Book> arrBooks) {
		  /** lọc giản sẩn theo giá
         *  cho người dùng nhập vào giá sản phẩn tối thiểu và tối đa
         *  - kiểm tra xem có cuốn sách nào nằm trong khoảng này không
         *     + có thì in ra danh sách
         *     + Không có thì thông báo ra màn hình
         */

        //giá tối thiểu
        do {
            try {
                System.out.print("Enter the Minimum price: ");
                PriceMax = Float.parseFloat(input_number.nextLine());

                //giá tối thiểu phải lớn hơn hoặc bằng 0, nếu nhỏ hơn 0 thì thông báo lối
                if (PriceMin < 0) {
                    System.out.println("\nMinimum price must be greater than or equal to 0");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Maximum Price must be some type float ");
                System.out.print("Enter the Minimum price: ");
                PriceMax = Float.parseFloat(input_number.nextLine());
                if (PriceMin < 0) {
                    System.out.println("\nMinimum price must be greater than or equal to 0");
                }
            }

        } while (PriceMin < 0); 
        //giá tối thiểu lơn hơn hoặc bằng 0 thì thoát vòng lặp , nếu không thì yêu câu nhập lại

        //giá tối đa
        do {
            try {
                System.out.print("Enter the Maxmum price: ");
                PriceMax = Float.parseFloat(input_number.nextLine());

                //Gia tối đa phải lớn hơn giá tối thiểu nếu không thì thông báo lối
                if (PriceMax < PriceMin) {
                    System.out.println("\nThe maximum price must be greater than the minimum price");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Maximum Price must be some type float ");
                System.out.print("Enter the Maxmum price: ");
                PriceMax = Float.parseFloat(input_number.nextLine());
                if (PriceMax < PriceMin) {
                    System.out.println("\nThe maximum price must be greater than the minimum price");
                }
            }
        }while (PriceMax < PriceMin);
        //giá tối đa lơn hơn giá tối thiểu thì thoát vòng lặp , nếu không thì yêu câu nhập lại

        int count = 0;

        boolean flag = false;
        for (Book book : arrBooks) {
            if (book.getGiaKM() > PriceMin && book.getGiaKM() < PriceMax) {
                count++;
                flag = true;
                if (count == 1) {
                    System.out.println("\nBooks with prices between "+PriceMin+" and "+PriceMax+" are: ");
                }
                System.out.println("+---+---------------+----------+---------------+------------+-------------+--------------+----------+"); 
                System.out.format ("| %d |%-15s|%-10s|%-15s|%-12s|%-13s|%-14s|%-10s|\n",count,book.getName() ,book.getId() ,book.getAuthor(),book.getLanguage(),(book.getGiaKM()+" đ"),book.getNgaySua(),book.getISBN());
                System.out.println("+---+---------------+----------+---------------+------------+-------------+--------------+----------+");
            }
        }
        if (flag == false) {
            System.out.println("\nThere are no books priced from "+PriceMin+"đ to "+PriceMax+"đ");
        }
        
    }
	public static void Order_by_price_desc (ArrayList<Book> Books) {
		List <Book> list = new ArrayList<Book>(Books) ;
		Collections.sort(list, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getGiaKM() - o1.getGiaKM());
			}
			
		});
		 
		 int count  = 0;
	        System.out.println("+---+---------------+----------+---------------+------------+-------------+--------------+----------+");
	        System.out.println("|STT|      Name     |    ID    |   Athor name  |  Language  |    Price    | Publish date |   ISBN   |");
	        System.out.println("+---+---------------+----------+---------------+------------+-------------+--------------+----------+");
	        for (Book o : list) {
	            count++;
	            System.out.format ("| %d |%-15s|%-10s|%-15s|%-12s|%-13s|%-14s|%-10s|\n",count,o.getName() ,o.getId() ,o.getAuthor(),o.getLanguage(),(o.getGiaKM()+" đ"),o.getNgaySua(),o.getISBN());
	            System.out.println("+---+---------------+----------+---------------+------------+-------------+--------------+----------+");
	        }}

        
	
	public void display() {
		System.out.println(toString());
	}	
	

	static void menubooks() {
		System.out.println("====================================================");
		System.out.println("1.insert a new book         | 2.update a book");
		System.out.println("====================================================");
		System.out.println("3.delete a book             | 4.display all");
		System.out.println("5.exit` and tools");
	}
	static void menutools() {
		System.out.println("====================================================");
		System.out.println("1.filter by author         | 2.filter by language");
		System.out.println("====================================================");
		System.out.println("3.filter by price          | 4.order by  price ");
	}
	
}
