public class User {
    public static void main(String[] args) throws AmountException {
      /*  int a = 2;
        int b = 0;
        try {
            Integer x = a / b;

        } catch (Exception vc) {
            System.out.println(vc.getMessage());
            System.out.println(" its a defect");
        } finally {
            System.out.println("ваш код  рухнул");
        }
        calculate(1.0);


    }
    public static void calculate ( Double credits){
        if (credits >0){
            System.out.println("stop");
        }else {
            throw new RuntimeException("run");
        }
*/
    Account account = new Account();
    account.deposit(20000.0);
   // account.withDraw(6000.0);

    try {while (account.getAmount()!=2000.0){
        account.withDraw(6000.0);
    }
     }catch (AmountException a ){
        System.out.println("Операция недоступна,недостаточно средств на счету: " +account.getAmount()+" som");
    }


    AmountException amountException = new AmountException("monte" , 2000.0);
        System.out.println( "Вы сняли: "+account.getAmount()+" som" +" Остаток на счету: "+amountException.returnMoney()+" som");

    }

}
