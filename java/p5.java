import java.util.Arrays;
class p5 
{ 
	public static void main(String args[]) 
	{ 
		String s[][]=new String[4][]; 
		s[0]=new String[1]; 
		s[1]=new String[2]; 
		s[2]=new String[3];
		s[3]=new String[4];
		for(int i=0;i<s.length;i++) 
		for(int j=0;j<i+1;j++) 
		s[i][j]="***"; 
		for(int i=0;i<s.length;i++) 
		{ 
			for(int j=0;j<i+1;j++) 
			System.out.print(" "+s[i][j]); 
			System.out.println(); 
		} 
	} 
} 
