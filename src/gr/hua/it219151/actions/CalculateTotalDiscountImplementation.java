package gr.hua.it219151.actions;

import gr.hua.it219151.contracts.Contract;
import gr.hua.it219151.enums.ContractType;
import gr.hua.it219151.enums.PaymentMethod;
import gr.hua.it219151.enums.UserType;
import gr.hua.it219151.users.User;

import java.util.List;

public class CalculateTotalDiscountImplementation implements CalculateTotalDiscount{
    @Override
    public int discountByUserType(User loggedUser, List<Contract> userContracts) {
        int contractCount = userContracts.size();
        int discount = 0;
        if(loggedUser.getUserType().equals(UserType.NORMAL)){
            for(int i = 0; i <= contractCount; i++){
                discount +=5;
            }
            if(discount >= 15){
                discount = 15;
            }
        }
        else if(loggedUser.getUserType().equals(UserType.PROFESSIONAL)){
            for(int i = 0; i <= contractCount; i++){
                discount +=10;
            }
        }
        else{
            for(int i = 0; i <= contractCount; i++){
                discount +=15;
            }
        }

        return discount;
    }

    @Override
    public int discountForLandline(List<Contract> userContracts) {
        int discount = 0;
        for(Contract c: userContracts){
            if(c.getType().equals(ContractType.LANDLINE) && c.getFreeMinutes() >= 1000){
                discount += 11;
            }
        }
        return discount;
    }

    @Override
    public int discountByPaymentmethod(List<Contract> userContracts) {
        int discount = 0;
        for(Contract c: userContracts){
            if(c.getPaymentType().equals(PaymentMethod.CREDIT) || c.getPaymentType().equals(PaymentMethod.DEBIT)){
                discount += 5;
            }
        }
        return discount;
    }

    @Override
    public int discountForEContract(List<Contract> userContracts) {
        int discount = 0;
        for(Contract c: userContracts){
            if(c.isEContract()){
                discount += 2;
            }
        }
        return discount;

    }
}
