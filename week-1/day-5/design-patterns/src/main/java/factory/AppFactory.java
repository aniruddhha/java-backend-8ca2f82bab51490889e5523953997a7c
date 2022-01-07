package factory;


public class AppFactory  {

    public Factory getFactory(String type) {
        if(type.equals("card")) return CardFactory.newInstance();
        if(type.equals("coin")) return CoinFactory.newInstance();
        return null;
    }
}
