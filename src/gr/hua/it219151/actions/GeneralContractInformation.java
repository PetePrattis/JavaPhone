package gr.hua.it219151.actions;

import gr.hua.it219151.Main;
import gr.hua.it219151.contracts.Contract;
import gr.hua.it219151.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneralContractInformation {

    public void showInformation(User loggedUser){
        System.out.println("Welcome to Contract Information Page!");

        Scanner scanner = new Scanner(System.in); //reads user's input
        String userTypeInput = "";

        while(true) {
            System.out.println("Pick 'a' to show Active Contracts, " +
                    "'b' to Show Total Discount, " +
                    "'c' to Show General User Statistics " +
                    "and 'd' to go back to User Profile Page.");

            userTypeInput = scanner.nextLine();
            while (!userTypeInput.equals("a") && !userTypeInput.equals("b") && !userTypeInput.equals("c") && !userTypeInput.equals("d")){ // check for valid user input
                System.out.println("This is not a valid option, pick again!");
                userTypeInput = scanner.nextLine();
            }
            if(userTypeInput.equals("a")){
                ShowActiveContracts showActiveContract = new ShowActiveContracts();
                showActiveContract.printContracts(loggedUser);
            }
            else if(userTypeInput.equals("b")){//todo check if user has contracts
                CalculateTotalDiscountImplementation calculateTotalDiscountImplementation = new CalculateTotalDiscountImplementation();
                System.out.println("Total Discount "+loggedUser.getDiscount());
                loggedUser.setDiscount(0);
                List<Contract> userContracts = new ArrayList<>();
                userContracts = getUserContarcts(loggedUser);
                int totaldiscount = 0;
                totaldiscount += calculateTotalDiscountImplementation.discountByUserType(loggedUser, userContracts);
                totaldiscount += calculateTotalDiscountImplementation.discountForLandline(userContracts);
                totaldiscount += calculateTotalDiscountImplementation.discountByPaymentmethod(userContracts);
                totaldiscount += calculateTotalDiscountImplementation.discountForEContract(userContracts);

                if(totaldiscount >= 45){
                    loggedUser.setDiscount(45);
                }
                else{
                    loggedUser.setDiscount(totaldiscount);
                }
                System.out.println("Total Discount "+totaldiscount);
            }
            else if(userTypeInput.equals("c")){
                //todo show general statistics implementation
            }
            else{
                break;
            }

        }

    }

    private List<Contract> getUserContarcts(User loggedUser) {
        Main m = new Main();
        List<Contract> savedContracts = m.allContracts;

        List<Contract> userContracts = new ArrayList<>();
        for(Contract contract: savedContracts){
            if(contract.getAFM().equals(loggedUser.getAFM())){// todo check for non zero usage values
                userContracts.add(contract);
            }
        }
        return userContracts;
    }

}
