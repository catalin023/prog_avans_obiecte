package lab7.exercitiu1.interfata;

import lab7.exercitiu1.model.Payment;

public interface ConversieCalcul {
    double conversieValutaToEur(Payment payment);
    default void calculRata(){}
}
