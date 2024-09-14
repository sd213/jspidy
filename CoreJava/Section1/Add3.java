class Add3{
	public static void main(String[] args){
		System.out.println(add());
	}
	
	public static int add(){
		int a = 30 , b = 20;
		return a+b;
		//return a+b; // .\Add3.java:9: error: unreachable statement  return a+b; error: compilation failed
	}
}