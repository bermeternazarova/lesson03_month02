public class Account {
    private Double amount= 0.0;

    public Double getAmount() {
        return amount;
    }

    public  void deposit(Double som ){
        if ( amount >= 0.0){
            amount= amount+som;
            System.out.println("Вы выполнили счет на: " + getAmount() + " som");
        }

    }
    public  void  withDraw (Double som ) throws AmountException {
        if (amount>0){
            amount= amount - som;
            System.out.println("Вы сняли:  " + som +" som  " + "Остаток на счету: " + getAmount()+" som");
        }if (som > getAmount()){
            throw  new AmountException("  НА СЧЕТУ НЕДОСТАТОЧНО ДЕНЕГ" ,getAmount());
        }


    }

}
