package factory;

public class AbcCoin implements CoinProvider{
    @Override
    public float currentPrice() {
        return 10.26f;
    }

    @Override
    public String coinName() {
        return "abc";
    }
}
