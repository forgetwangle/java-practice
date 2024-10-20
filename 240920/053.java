package clock;

public class Display {
	public int value=0;
	public int limit=0;
	
	public Display(int limit){
		this.limit=limit;
	}
	
	public void increase(){
		value++;
		if(value==limit) {
			value=0;
		}
	}
	
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		Display d=new Display(24);
		for(;;) {
			d.increase();
			System.out.println(d.getValue());
		}
//		Display m=new Display(60);
		

	}

}
