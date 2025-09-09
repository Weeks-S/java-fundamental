public class IfElseStatement {
    public static void main(String[] args) {
        String userName = "Week-s";
        String password = "Wik12";

        Boolean checkUserName = userName.equals("Week-s");
        Boolean checkPassword = password.equals("Wik123");

        Boolean loginSuccess = checkUserName && checkPassword;

        if(loginSuccess){
            System.out.println("Welcome " +  userName);
        } else {
            System.out.println("Invalid username or password");
        }

//        Ternary
        System.out.println(loginSuccess ? "Welcome " +  userName : "Incorrect username or password");


    }
}
