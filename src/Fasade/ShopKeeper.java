package Fasade;

public class ShopKeeper {
    private MobileShop iphone;

    private MobileShop blackberry;

    public ShopKeeper(){
        iphone= new IPhone();

        blackberry=new BlackBerry();
    }
    public void sellIPhone(){
        iphone.modelNo();
        iphone.price();
    }

    public void sellBlackberry(){
        blackberry.modelNo();
        blackberry.price();
    }
}