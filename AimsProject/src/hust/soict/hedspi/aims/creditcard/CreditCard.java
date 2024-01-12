package hust.soict.hedspi.aims.creditcard;

public class CreditCard {
    private String card_number;
    private String cardholder_name;
    private String expiration_date;
    private int CVV;
    private float current_balance;
    private float credit_limit;
    
    // Getter
    public String getCard_number() {
        return card_number;
    }

    public String getCardholder_name() {
        return cardholder_name;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public int getCVV() {
        return CVV;
    }

    public float getCurrent_balance() {
        return current_balance;
    }

    public float getCredit_limit() {
        return credit_limit;
    }
    
}
