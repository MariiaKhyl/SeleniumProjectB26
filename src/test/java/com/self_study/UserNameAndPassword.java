package com.self_study;

public class UserNameAndPassword {
    public static void main(String[] args) {


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = scanner.next();
        System.out.println("Please enter your password");
        String password = scanner.next();

        if ((username.equals("mariiakhyl")) && (password.equals("mariiakhyl"))) {
            System.out.println("Logged in successfully");
        } else if (!(username.equals("mariiakhyl")) && (!password.equals("mariiakhyl"))) {
            System.out.println("Wrong input");
        } else if ((username.equals("mariiakhyl")) && (!password.equals("mariiakhyl"))) {
            System.out.println("Wrong input");
        } else if (!(username.equals("mariiakhyl")) && (password.equals("mariiakhyl"))) {
            System.out.println("Wrong input");
        }

        */

    }
    public static String usernamePassword(String username, String password){

        if ((username.length()>=15 && username.length() <= 8) && (password.length() >=15 && password.length()<=8)){

            if (username.equals("mariiaKhyl") && password.equals("mariiaKhyl")){
                return "Login passed";
            }else{
                return "Wrong entry";
            }

        }

return "something";
    }



}
