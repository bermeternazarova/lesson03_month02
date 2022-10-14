public class AmountException extends  Exception{
    private Double remainingAmount;

    public AmountException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
    public  double returnMoney(){
        remainingAmount=remainingAmount-2000.0;
        return remainingAmount; }

}
