package gr.hua.it219151;

import gr.hua.it219151.contracts.Contract;
import gr.hua.it219151.enums.*;
import gr.hua.it219151.profile.CreateProfile;
import gr.hua.it219151.profile.UserProfile;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //the list of all users
    public static List<User> allUsers = new ArrayList<>();

    //the list of all contracts
    public static List<Contract> allContracts = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to JavaPhone Application!");

        //Initial Users
        User u1 = new User("Stavroula","Pratti","1234567890","Address 1","ID 123456789", UserType.STUDENT, "stav@mail.com","pass1234567890",0);
        User u2 = new User("Despoina","Pratti","1234567891","Address 2","ID 123456780", UserType.NORMAL, "desp@mail.com","pass1234567891",0);
        User u3 = new User("Panagiotis","Prattis","1234567892","Address 3","ID 123456781", UserType.PROFESSIONAL, "pan@mail.com","pass1234567892",0);

        //Insert initial users
        allUsers.add(u1);
        allUsers.add(u2);
        allUsers.add(u3);

        //Initial Contracts
        Contract c1 = new Contract("", ContractType.MOBILE, "", "1234567890", "", 0, "2021-1-14", ContractDuration.ONEYEAR, 15,true, PaymentMethod.CREDIT, NetworkSpeed.DATA,0,0);
        Contract c2 = new Contract("", ContractType.MOBILE, "", "1234567890", "", 0, "2021-1-14", ContractDuration.ONEYEAR, 15,true, PaymentMethod.CREDIT, NetworkSpeed.DATA,0,0);

        allContracts.add(c1);
        allContracts.add(c2);

        Scanner scanner = new Scanner(System.in); //reads user's input

        String userInput = ""; //saves user's input



        //infinite loop that runs app
        while (true){
            System.out.println("Pick an action, insert 'a' to create profile, " +
                    "insert 'b' to login " +
                    "or insert 'c' to logout ");

            userInput = scanner.nextLine(); //read user input

            while (!userInput.equals("a") && !userInput.equals("b")  && !userInput.equals("c") ){ // check for valid user input
                System.out.println("This is not a valid option, pick again!");
                userInput = scanner.nextLine();
            }

            if(userInput.equals("a")){ //check which action was selected
                CreateProfile createProfile = new CreateProfile(); // create instance of CreateProfile class
                allUsers.add(createProfile.createUser());

            }
            else if(userInput.equals("b")){
                Login login = new Login();
                UserProfile userProfile = new UserProfile();
                User loggedUser = login.loginUser();
                if (loggedUser != null)
                    userProfile.userActions(loggedUser);
            }
            else{
                break;
            }

        }
        System.out.println("Thank you for using JavaPhone!");
    }
}
