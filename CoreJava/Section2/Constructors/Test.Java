//constructor overloading

class Test{
	int x;
	float y;
	Test(){
		this(y);
		this.x = 70;
		this.y = 100.21f;
		System.out.println(y);
	}
	Test(float y){
		System.out.println("Hello");
		System.out.println(this.y);
		System.out.println(this.x);
	}
	Test(int x , float y)
	{
		this();
		System.out.println(x);
		System.out.println(this.x);
		System.out.println("Hello");
	}
	
	public static void main(String[]args){
		Test d = new Test(20, (float) 50.76d);
	}
}
