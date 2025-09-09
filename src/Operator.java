public class Operator {
    public static void main(String[] args) {
//        Aritmatika
        int x = 11;
        int y = 5;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(x );

//        Penugasan
        int z;
        z = 8;
        z += 2;
        z -= 2;
        z *= 3;
        z /= 2;
        System.out.println(z);

//        Comparison
        int odd = 3;
        int even = 2;
        System.out.println(odd == even); //false
        System.out.println(odd > even); //true
        System.out.println(odd < even); //false
        System.out.println(odd != even); // true

//         Logical Operator
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn || !isAdmin)); // true
        System.out.println("Has access: " + (isLoggedIn && isAdmin)); // false
        System.out.println("Not logged in: " + (!isLoggedIn)); //false

//        Increment & Decrement
        int a = 1;
        a++;
        System.out.println(a); // 2
        a--;
        System.out.println(a); // 1

//        Operator Bitwise


    }
}
