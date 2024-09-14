




class ConstructorMain{
	public static void main (String [] args){
		Constr c = new Constr(10,20);
		System.out.println("x: " +c.x);
		System.out.println("y: " +c.y);
		
	}
}

class Constr{
	int x;
	int y;
	Constr(int x , int y){
		this.x = x;
		this.y = y;
	}
}


