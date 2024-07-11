import java.lang.System;

class p6 { 
    public static void main(String args[]) { 
        int x = 10, y = 5, z = 1; 
        
        System.out.println("\nARITHMETIC OPERATORS:-\n\n"); 
        System.out.println("\tx + y = " + (x + y)); 
        System.out.println("\tx - y = " + (x - y)); 
        System.out.println("\tx * y = " + (x * y)); 
        System.out.println("\tx / y = " + (x / y)); 
        System.out.println("\tx % y = " + (x % y)); 
        System.out.println("\tx++ = " + (x++)); 
        System.out.println("\t--x = " + (--x)); 
        
        System.out.println("\nLOGICAL OPERATORS:-\n\t"); 
        System.out.println("\t(x == 10 || y == 1) = " + ((x == 10) || (y == 1))); 
        System.out.println("\t(x == 10 && y == 1) = " + ((x == 10) && (y == 1))); 
        System.out.println("\tx != y = " + (x != y)); 
        
        System.out.println("\nRELATIONAL OPERATORS:-\n\t"); 
        if (x > y && x > z) { 
            System.out.println("\tLargest number is " + x); 
        } else if (y > z && y > x) { 
            System.out.println("\tLargest number is " + y); 
        } else { 
            System.out.println("\tLargest number is " + z); 
        }
        
        System.out.println("\nBITWISE LOGICAL OPERATORS:-\n\t"); 
        System.out.println("\tx | y = " + (x | y)); 
        System.out.println("\tx & y = " + (x & y)); 
        System.out.println("\tx ^ y = " + (x ^ y)); 
        System.out.println("\t~x = " + (~x)); 
    } 
}
