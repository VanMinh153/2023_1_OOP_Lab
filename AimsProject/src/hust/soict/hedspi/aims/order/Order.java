package hust.soict.hedspi.aims.order;

public class Order {
    private static final float VAT = 10;
    private String delivery_information;
    private String delevery_instructions;
    private float total_cost_before_VAT;
    private float total_cost_after_VAT;
    private float delivery_fee;
    // Getter
    public static float getVAT() {
        return VAT;
    }

    public String getDelivery_information() {
        return delivery_information;
    }

    public String getDelevery_instructions() {
        return delevery_instructions;
    }

    public float getTotal_cost_before_VAT() {
        return total_cost_before_VAT;
    }

    public float getTotal_cost_after_VAT() {
        return total_cost_after_VAT;
    }

    public float getDelivery_fee() {
        return delivery_fee;
    }
}
