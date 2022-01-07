package factory;

public class Atm {

    public CardProvider swipe(String bank) {
        CardProvider card = CardFactory.getCard(bank);
        card.swipe(150);
        return card;
    }

    public CoinProvider pay(String bank) {
        CoinProvider coin = CoinFactory.getCoin("abc");
        coin.currentPrice();
        return  coin;
    }

    public void usingAppFactory() {

        AppFactory factory = new AppFactory();
        CardFactory cardFactory = (CardFactory) factory.getFactory("card");

        CoinFactory coinFactory = (CoinFactory) factory.getFactory("coin");
    }
}
