package lab7.exercitiu1.interfataImpl;

import lab7.exercitiu1.interfata.ConversieCalcul;
import lab7.exercitiu1.model.Payment;

import lab7.exercitiu1.model.Currency;




public class ConversieCurrencyImpl implements ConversieCalcul {

    @Override
    public double conversieValutaToEur(Payment payment) {
        switch (payment.getCurrency()){
            case RON:
                return payment.getAmount()*0.2;
            case EUR:
                return payment.getAmount();
            case USD:
                return payment.getAmount()*0.9;
            case GBP:
                return payment.getAmount()*1.2;
            case TRY:
                return payment.getAmount()*0.18;
            default:
                return payment.getAmount();
        }
    }

}
