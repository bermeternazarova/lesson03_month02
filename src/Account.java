public class Account {
    private Double amount= 0.0;

    public Double getAmount() {
        return amount;
    }

    public  void deposit(Double som ){
        if ( amount >= 0.0){
            amount= amount+som;
            System.out.println("�� ��������� ���� ��: " + getAmount() + " som");
        }

    }
    public  void  withDraw (Double som ) throws AmountException {
        if (amount>0){
            amount= amount - som;
            System.out.println("�� �����:  " + som +" som  " + "������� �� �����: " + getAmount()+" som");
        }if (som > getAmount()){
            throw  new AmountException("  �� ����� ������������ �����" ,getAmount());
        }


    }

}
