package gr.hua.it219151.actions;

import gr.hua.it219151.Main;
import gr.hua.it219151.contracts.Contract;
import gr.hua.it219151.enums.UserType;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DeleteContract {

    //the list of all contracts
    public static List<Contract> savedContracts = new ArrayList<>();

    public void removeContract(User loggedUser){
        System.out.println("Welcome to Remove Contract Page!");

        savedContracts = Main.allContracts;

        List<Contract> userContracts = new ArrayList<>();
        for(Contract contract: savedContracts){
            if(contract.getAFM().equals(loggedUser.getAFM())){
                userContracts.add(contract);
            }
        }

        if(userContracts.isEmpty()){
            System.out.println("You don't have any contracts!");
        }
        else{
            int counter = 0;
            for(Contract contract: userContracts){
                System.out.println(counter+". Id: " + contract.getContractID() + " Contract Type: " + contract.getType() + " Phone Number " + contract.getPhoneNumber());
                counter++;
            }
            System.out.println("Pick Contract to delete by inserting the corresponding number!");
            Scanner scanner = new Scanner(System.in); //reads user's input
            boolean valid;
            int contractIndex = 1;
            do {
                try {
                    valid = false;
                    contractIndex = scanner.nextInt(); // sc is an object of scanner class
                } catch (InputMismatchException e) {
                    scanner.next();
                    valid = true;
                    System.out.println("Please Input a number!");
                }
            } while (valid);
            contractIndex = contractIndex - 1;
            if(contractIndex >= 0 && contractIndex <= userContracts.size()) {
                Contract contractDelete = userContracts.get(contractIndex);

                System.out.println("Pick 'a' to Delete Contract or 'b' to Deactivate Contract:");
                String userInput = scanner.nextLine();
                while (!userInput.equals("a") && !userInput.equals("b")){ // check for valid user input
                    System.out.println("This is not a valid option, pick again!");
                    userInput = scanner.nextLine();
                }
                UserType usertype;
                if(userInput.equals("a")){
                    Main.allContracts.remove(contractDelete);
                    System.out.println("Contract deleted!");
                }
                else{
                    contractDelete.setFreeMinutes(0);
                    System.out.println("Contract deactivated!");
                }
            }
            else{
                System.out.println("No such Contract!");
            }
        }

    }
}
