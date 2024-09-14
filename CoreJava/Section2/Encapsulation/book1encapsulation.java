class Book
{
	private int book_id;
	private String book_name;
	private int book_price;
	
	Book(String book_name,int book_id,int book_price){
		this.book_id = book_id;
		this.book_name = book_name;
		setbook_price(book_price);
	}
	public int getbook_id(){
		return book_id;
	}
	public String getbook_name(){
		return book_name;
	}
	public int getbook_price(){
		return book_price;
	}
	public void setbook_name(String name){
		System.out.println("---Not Possible to Modify---");
	}
	public void setbook_id(int id){
		System.out.println("---Not Possible to Modify---");
	}
	public void setbook_price(int book_price){
		this.book_price = book_price;
	}
	public void displayDetails(){
		System.out.println("#######");
		System.out.println("Book Name: " + book_name + " , with Book ID : "+ book_id +" and Book Price : "+book_price + " rupees" );
		
	}
	public static void main(String[] args){
		Book DeepWork = new Book("DeepWork by Cal New Port ",3435,354);
		Book Stats = new Book ("Statistics by Robert S.White ",566,788);
		Book Webdesign = new Book("Learning Web Design by JnR",231, 1823);
		
		DeepWork.displayDetails();
		Stats.displayDetails();
		Webdesign.displayDetails();
		
		DeepWork.setbook_id(354);
		DeepWork.setbook_name("denWork");
	}
}	