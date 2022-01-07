package factory;

public class XyzCard implements  CardProvider{
    @Override
    public void swipe(float amt) {

    }

    @Override
    public String getBank() {
        return "xyz";
    }
}
