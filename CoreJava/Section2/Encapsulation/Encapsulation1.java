class Encapsulation{
	private int number;
	public int getter(){
		return number;
	}
	Encapsulation(int value){
		setter(value);
	}
	public void setter(int value){
		if(value % 5==0){
			this.number = value;
		}
		else{
			System.out.println("Not possible");
		}
	}
	
	public static void main(String[] args){
		Encapsulation e1 = new Encapsulation(6);
		Encapsulation e2 = new Encapsulation(5);
		Encapsulation e3 = new Encapsulation(10);
		System.out.println(e1.getter());
		System.out.println(e2.getter());
		System.out.println(e3.getter());
		
		
	}
}