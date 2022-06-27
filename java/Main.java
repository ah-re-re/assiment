package quanlysach2;
import java.util.ArrayList;
import quanlysach2.Book;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static Scanner input_number = new Scanner(System.in);
	private static Scanner scanner;
	
	public static void main (String[] args) {
		Athor athor = new Athor();
		int choose = 0;
		int n;
		ArrayList<Book> arrBooks = new ArrayList<>();
		 
		Scanner input = new Scanner(System.in);
		do {
			menubooks();
		
			choose = Integer.parseInt(input.nextLine());			
			switch(choose) {
				case 1:
					System.out.println("insert a new book ");
					n = Integer.parseInt(input.nextLine());
					for(int i = 0; i<n; i++) {
						Book book = new Book();
						book.input();
						
						arrBooks.add(book);
					}
					continue;
				case 2:
					System.out.println("update a book ");
					n = Integer.parseInt(input.nextLine());
					for(int i = 0; i<n; i++) {
						Book book = new Book();
						book.input();							
						arrBooks.set(i, book);
					}
					continue;
				case 3:
					System.out.println("delete a book ");
					n = Integer.parseInt(input.nextLine());
					for(int i = 0; i<n; i++) {
						Book book = new Book();
						book.input();				
						arrBooks.remove(book);
					}
					continue;
				case 4:
					for ( Book book : arrBooks) {
						book.display();
					}
					
						
					continue;
				
					
				case 5:
					if(arrBooks.size() == 0) {
						System.out.println("\nEmpty list.............!\nInsert a new book to use the tools\n");
						  do {
	                            try {
	                                // rồi yêu câu người dùng nhập 0 để quay lại
	                                System.out.print("Enter 0 go back: ");
	                                choose = Integer.parseInt(input_number.nextLine());
	                            } catch (Exception e) {
	                                System.out.println("\nError: " + e.getMessage());
	                                System.out.println("Choice must be some type integer");
	                                System.out.print("\nEnter 0 go back: ");
	                                choose = Integer.parseInt(input_number.nextLine());
	                            }
	                            /** choice chỉ được bằng 0
	                            * bằng 0 thì break
	                            *  nếu khác 0 : thì thông báo lỗi và nhập lại đến khi nào bằng 0 thì thôi
	                            */
	                            if (choose != 0) {
	                                System.out.println("\nInvalid Choice.");
	                            }
	                        } while (choose != 0);
	                   
			}  else {
				do {
					menutools();
					try {
                        System.out.print("\nEnter your choice: ");
                        choose = Integer.parseInt(input_number.nextLine());
                    } catch (Exception e) {
                        System.out.println("\nError: " + e.getMessage());
                        System.out.println("Choice must be some type integer");
                        System.out.print("\nRe-enter your choice: ");
                        choose = Integer.parseInt(input_number.nextLine());
                    }if (choose == 0) break;
                    switch (choose) {
                    case 1: {
                        System.out.println("\\n filter by author \\n");
                        String y;		        
						y = scanner.nextLine();
                        Athor.filterbyauthor(arrBooks, y);
                        do {
                            try {
                                // rồi yêu câu người dùng nhập 0 để quay lại
                                System.out.print("Enter 0 go back: ");
                                
                                choose = Integer.parseInt(input_number.nextLine());
                            } catch (Exception e) {
                                System.out.println("\nError: " + e.getMessage());
                                System.out.println("Choice must be some type integer");
                                System.out.print("\nEnter 0 go back: ");
                                choose = Integer.parseInt(input_number.nextLine());
                            }
                            if (choose != 0) {
                                System.out.println("\nInvalid Choice.");
                            }
                        } while (choose != 0);
                        break;
                    }
                    case 2: {
                        System.out.println("\\n filter by author \\n");
                        String x;
			        	
						x = scanner.nextLine();
                        Athor.filterbylanguage(arrBooks, x);
                        do {
                            try {
                                // rồi yêu câu người dùng nhập 0 để quay lại
                                System.out.print("Enter 0 go back: ");
                                
                                choose = Integer.parseInt(input_number.nextLine());
                            } catch (Exception e) {
                                System.out.println("\nError: " + e.getMessage());
                                System.out.println("Choice must be some type integer");
                                System.out.print("\nEnter 0 go back: ");
                                choose = Integer.parseInt(input_number.nextLine());
                            }
                            if (choose != 0) {
                                System.out.println("\nInvalid Choice.");
                            }
                        } while (choose != 0);
                        break;
                    }
                    case 3: {
                        System.out.println("\\n filter by author \\n");
                      
                        Athor.filterbyprice(arrBooks);
                        do {
                            try {
                                // rồi yêu câu người dùng nhập 0 để quay lại
                                System.out.print("Enter 0 go back: ");
                                
                                choose = Integer.parseInt(input_number.nextLine());
                            } catch (Exception e) {
                                System.out.println("\nError: " + e.getMessage());
                                System.out.println("Choice must be some type integer");
                                System.out.print("\nEnter 0 go back: ");
                                choose = Integer.parseInt(input_number.nextLine());
                            }
                            if (choose != 0) {
                                System.out.println("\nInvalid Choice.");
                            }
                        } while (choose != 0);
                        break;
                    }
                    case 4: {
                        System.out.println("\n\t\t\t\t   ---- order by price desc ----\n");
                        Athor.Order_by_price_desc(arrBooks);
                        do {
                            try {
                                // rồi yêu câu người dùng nhập 0 để quay lại
                                System.out.print("Enter 0 go back: ");
                                choose = Integer.parseInt(input_number.nextLine());
                            } catch (Exception e) {
                                System.out.println("\nError: " + e.getMessage());
                                System.out.println("Choice must be some type integer");
                                System.out.print("\nEnter 0 go back: ");
                                choose = Integer.parseInt(input_number.nextLine());
                            }
                            if (choose != 0) {
                                System.out.println("\nInvalid Choice.");
                            }
                        } while (choose != 0);
                        break;}
                        default:
                        System.out.println("Goodbye");
                       
                        break;
                    }
				 }while (choose != 5);
            }          
        }
        //Sửa lại điều kiện    
	}while(choose != 5);
                  
                     
                    
                    
		}
	
	static void menubooks() {
		System.out.println("====================================================");
		System.out.println("1.insert a new book         | 2.update a book");
		System.out.println("====================================================");
		System.out.println("3.delete a book             | 4.display all");
		System.out.println("5.exit`");
	}
	static void menutools() {
		System.out.println("====================================================");
		System.out.println("1.filter by author         | 2.filter by language");
		System.out.println("====================================================");
		System.out.println("3.filter by price          | 4.order by price desc");
	}
}
