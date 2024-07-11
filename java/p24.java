class p24 
{ 
	public static void main(String args[])throws 
	Exception 
	{ 
		ProcessBuilder r = new ProcessBuilder("notepad.exe","fileio.txt");
		r.start(); 
	} 
}