package Full_Implementation;

public class Payment {
    public int total_cost;
    public Payment(){
        total_cost =0;
    }
    public float makePayment(float cost){
        System.out.println("Payment completed. Total Cost = "+cost);
        return cost;
    }
}
