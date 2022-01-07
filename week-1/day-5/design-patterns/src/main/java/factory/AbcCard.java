package factory;

public class AbcCard implements CardProvider {
    @Override
    public void swipe(float amt) {

    }

    @Override
    public String getBank() {
        return "abc";
    }
}
