package springintro3;

public class Desktop implements Computer {

	
	public Desktop() {
		System.out.println("Desktop no argument Constructor ... ");
	}
	
	@Override
	public void compile() {
		
		System.out.println("Code Compiled in Desktop....");
	}

}
