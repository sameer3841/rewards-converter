public class RewardValue {

    private final double cashValue;
    private final double miles;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        miles = cashValue / 0.0035;
    }

    public RewardValue(int miles){
        this.miles = miles;
        cashValue = miles * 0.0035;
    }


    public double getMilesValue() {
        return miles;
    }

    public double getCashValue(){
        return cashValue;
    }
}
