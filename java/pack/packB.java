package pack;
public class packB{
	int y=1000;
	void show() {
		System.out.println("No modfifier");
	}
	public void pub(){
		System.out.println("public	"+y);
	}
	public void pri(){
		System.out.println("private	"+y);
	}
	public void prot(){
		System.out.println("protected	"+y);
	}
}
