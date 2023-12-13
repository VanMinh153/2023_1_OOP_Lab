package hust.soict.hedspi.aims.transaction;

public class Transaction {
    private String transaction_ID;
    private String card_owner;
    private int transaction_amount;
    private String transaction_message;
    private float transaction_balance;
    private String transaction_date;
    
    // Getter
    public String getTransaction_ID() {
        return transaction_ID;
    }

    public String getCard_owner() {
        return card_owner;
    }

    public int getTransaction_amount() {
        return transaction_amount;
    }

    public String getTransaction_message() {
        return transaction_message;
    }

    public float getTransaction_balance() {
        return transaction_balance;
    }

    public String getTransaction_date() {
        return transaction_date;
    }
}
