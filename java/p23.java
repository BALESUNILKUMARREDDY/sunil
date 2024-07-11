class p23 {
    public static void main(String[] args) { 
        String s1 = "Hello"; 
        String ss = "hello"; 
        String s2 = "Helloween"; 

        System.out.println("s1.equals(ss) : " + s1.equals(ss)); 
        System.out.println("s1.regionMatches(1, s2, 1, 4) : " + s1.regionMatches(1, s2, 1, 4)); 
        System.out.println("s1.indexOf('z') : " + s1.indexOf('z')); 

        StringBuffer s = new StringBuffer("Helloween"); 
        s.setCharAt(0, 'z');
        System.out.println("s.setCharAt(0, 'z') : " + s);
    }
}
