package factory;

public class Atm {

    public CardProvider swipe(String bank) {
        CardProvider card = CardFactory.getCard(bank);
        card.swipe(150);
        return card;
    }
}
