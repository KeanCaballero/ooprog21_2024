public class Fibonacci { 

public static int fibonacci(int n){

if (n == 0){

return 0;
} else if (n == 1){
return 1;
} else {

return fibonacci(n - 1) + fibonacci(n - 2);

}
}

public static void main (String [] args){
System.out.println(fibonacci(0));
System.out.println(fibonacci(1));
System.out.println(fibonacci(2));
System.out.println(fibonacci(3));
System.out.println(fibonacci(4));
System.out.println(fibonacci(5));
System.out.println(fibonacci(6));
System.out.println(fibonacci(7));
System.out.println(fibonacci(8));
System.out.println(fibonacci(9));
System.out.println(fibonacci(10));

}
}

//0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34
//1   2   3   4   5   6   7   8     9   10
//}
//}
//}
//public static void main (string [] args){
//int (<= 0);
//if 0 
//else 
//return fibonacci(n - 1) + fibonacci(n - 2);
//}

