
public class book {

	public static void main(String[] args) {
		char[] p ={'1','9'};
		MyInteger user = new MyInteger("17");
		System.out.println(user.isEven());
		System.out.println(user.isOdd());
		System.out.println(user.isPrime());
		System.out.println(MyInteger.isEven(4));
		System.out.println(MyInteger.isOdd(4));
		System.out.println(MyInteger.isPrime(4));
		MyInteger.value = 19;
		System.out.println(MyInteger.isEven(user));
		System.out.println(MyInteger.isOdd(user));
		System.out.println(MyInteger.isPrime(user));
		MyInteger user2 = new MyInteger(p);
		System.out.println(MyInteger.isEven(user2));
		System.out.println(MyInteger.isOdd(user2));
		System.out.println(MyInteger.isPrime(user2));
		
	}

}
class MyInteger {
	static int value;
	MyInteger(){
		value = 1;
	}
	MyInteger(int newvalue) {
		value = newvalue;
	}
	MyInteger(String a) {
		value = Integer.parseInt(a);
	}
	MyInteger(char[] b){
		value = Integer.parseInt(String.valueOf(b));
	}
	boolean isEven() {
		return isEven(value); 
	}
	boolean isOdd() {
		return isOdd(value);
	}
	boolean isPrime() {
     return isPrime(value);
    }
	static boolean isEven(int value2) {
		if (value2 % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isOdd(int value2) {
		if (value % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	static boolean isPrime(int value2) {
        if(value<=1)
        {
            return false;
        }
       for(int i=2;i<=value/2;i++)
       {
           if((value%i)==0)
               return  false;
       }
       return true;
   }
	static boolean isEven(MyInteger value3) {
		return isEven(value);
	}
	static boolean isOdd(MyInteger value3) {
		return isOdd(value);
	}
	static boolean isPrime(MyInteger value3) {
     return isPrime(value);
        }
     boolean equals(int value2) {
    	 if (isEven(value) == isEven(value2)) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
     }
     boolean equals(MyInteger value2) {
    	 if (isEven(value) == isEven(value2)) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
     }

	void parseInt(char[] b) {
		value = Integer.parseInt(String.valueOf(b));
		
	}
	void parseInt(String a) {
		value = Integer.parseInt(a);
		
	}
	void setValue(int newValue, String a, String b){
		value = newValue;
		value = Integer.parseInt(a);
		value = Integer.parseInt(String.valueOf(b));
	}
}
