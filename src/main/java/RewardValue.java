public class RewardValue {

    private final double cashValue;
    private final int miles;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        miles = (int)(cashValue / 0.0035);
    }

    public RewardValue(int miles){
        this.miles = miles;
        cashValue = miles * 0.0035;
    }


    public int getMilesValue() {
        return miles;
    }

    public double getCashValue(){
        return cashValue;
    }
}
