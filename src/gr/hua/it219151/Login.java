package gr.hua.it219151;

import gr.hua.it219151.profile.CreateProfile;
import gr.hua.it219151.profile.UserProfile;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    //the list of all users
    public static List<User> savedUsers = new ArrayList<>();

    public User loginUser(){
        System.out.println("Welcome to Login Page!");

        Main m = new Main();
        savedUsers = m.allUsers;

        Scanner scanner = new Scanner(System.in); //reads user's input

        String userInput = ""; //saves user's input

        while(true){
            System.out.println("Give AFM:");
            String afm = scanner.nextLine();

            System.out.println("Give Password:");
            String password = scanner.nextLine();

            for(User user: savedUsers){
                if(user.getAFM().equals(afm) && user.getPassword().equals(password)){
                    return user;
                }

            }
            System.out.println("Wrong Credentials! Press 'a' to try Login again " +
                    "or 'b' to go back to Main Page!");
            userInput = scanner.nextLine();
            while (!userInput.equals("a") && !userInput.equals("b")){ // check for valid user input
                System.out.println("This is not a valid option, pick again!");
                userInput = scanner.nextLine();
            }

            if(userInput.equals("b")){ //check which action was selected
                break;

            }
        }
        System.out.println("Back to Main Page!");
        return null;


    }
}
