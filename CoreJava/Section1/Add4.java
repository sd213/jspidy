class Add4{
	public static void main(String[] args){
		System.out.println(add());
	}
	
	public static int add(){
		int a = 30 , b = 20;
		return a+b;
		System.out.println("Return From Statement"); // .\Add3.java:9: error: System.out.println("Return From Statement"); error: compilation failed
	}
}