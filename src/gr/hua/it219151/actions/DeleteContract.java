package gr.hua.it219151.actions;

import gr.hua.it219151.Main;
import gr.hua.it219151.contracts.Contract;
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

        List<Contract> userContracts = new ArrayList<>();
        for(Contract contract: savedContracts){
            if(contract.getAFM().equals(loggedUser.getAFM())){// todo check for non zero usage values
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
            int contractIndex = 0;
            do {
                try {
                    valid = false;
                    contractIndex = scanner.nextInt(); // sc is an object of scanner class
                } catch (InputMismatchException e) {
                    scanner.next();
                    valid = true;
                    System.out.println("Please Input a number!");
                }
            } while (valid == true);
            Contract contractDelete = userContracts.get(contractIndex);
            Main m = new Main();
            m.allContracts.remove(contractDelete);
            System.out.println("Contract deleted!");
        }

    }
}
