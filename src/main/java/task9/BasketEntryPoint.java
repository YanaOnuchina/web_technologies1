package task9;

public class BasketEntryPoint {

    public static void main(String[] args){
        Basket basket = new Basket(10);
        System.out.println("Basket contains:" + basket);
        System.out.println("Basket weight: " + basket.calculateBasketWeight());
        System.out.println("Blue balls number: " + basket.calculateBlueBalls());
    }

}
