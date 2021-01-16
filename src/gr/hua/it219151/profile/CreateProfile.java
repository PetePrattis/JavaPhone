package gr.hua.it219151.profile;


import gr.hua.it219151.Main;
import gr.hua.it219151.enums.UserType;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateProfile {

    //the list of all users
    public static List<User> savedUsers = new ArrayList<>();

    public User createUser(){ //function that gathers user's information and returns a new User object
        System.out.println("Welcome to Create User Page!");

        savedUsers = Main.allUsers;

        Scanner scanner = new Scanner(System.in); //reads user's input

        System.out.println("Give first name:");
        String fname = scanner.nextLine();

        System.out.println("Give last name:");
        String lname = scanner.nextLine();

        String rexExAfm = "^[0-9]{9}$";
        String afm = "";
        while(true){
            System.out.println("Give AFM:");
            afm = scanner.nextLine();
            boolean unique = true;
            if(afm.matches(rexExAfm)){
                for(User user: savedUsers){
                    if(user.getAFM().equals(afm)){
                        unique = false;
                        System.out.println("This AFM already exists in our system!");
                    }
                }
                if(unique){
                    break;
                }
            }
            else{
                System.out.println("This is an invalid AFM, please give 9 digit number!");
            }
        }

        System.out.println("Give Address:");
        String address = scanner.nextLine();

        System.out.println("Give ID Number:");
        String id = scanner.nextLine();

        System.out.println("Pick user Type, 'a' for Normal, 'b' for Student and 'c' for Professional:");
        String userTypeInput = scanner.nextLine();
        while (!userTypeInput.equals("a") && !userTypeInput.equals("b")  && !userTypeInput.equals("c") ){ // check for valid user input
            System.out.println("This is not a valid option, pick again!");
            userTypeInput = scanner.nextLine();
        }
        UserType usertype;
        if(userTypeInput.equals("a")){
            usertype = UserType.NORMAL;
        }
        else if(userTypeInput.equals("b")){
            usertype = UserType.STUDENT;
        }
        else{
            usertype = UserType.PROFESSIONAL;
        }

        String regExEmail = "^(.+)@(.+)$";
        String email = "";
        while(true){
            System.out.println("Give email:");
            email = scanner.nextLine();
            if(email.matches(regExEmail)){
                break;
            }
            else{
                System.out.println("This is an invalid Email Address!");
            }
        }

        String password = "pass" + afm;


        User newUser = new User(fname,lname,afm,address,id,usertype,email,password,0);

        return newUser;
    }
}
