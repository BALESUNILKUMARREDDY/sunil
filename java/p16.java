 class p16 extends Exception{

p16(int c) {

System.out.println("\n\n\tMy own exception:"+c); }

public static void main(String args[]) {

try{

throw new p16(5); }

catch(Exception e) { System.out.println(); }

}

}