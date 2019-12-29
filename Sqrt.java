
public class Sqrt {
	 public int mySqrt(int x) {
	
	  	 long p = 0;
		 long r = x;
		 
		 while(p+1 < r)
		 {
			 long q = (p+r)/2;
			 
			 if(q * q == x)
			 {
				 return (int)q;
			 } else if(q * q < x)
			 {
				 p = q;
			 } else
			 {
				 r = q;
			 }
		 }
		 
		 if(r * r == x)
		 {
			 return (int)r;
		 }
		 return (int)p; 
	 }
	 
}
