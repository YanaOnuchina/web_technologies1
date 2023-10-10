package task9;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    Basket basket = new Basket(new ArrayList<>(List.of(new Ball("blue", 12), new Ball("green", 182),
            new Ball("red", 812), new Ball("blue", 1), new Ball("yellow", 456))));

    @Test
    public void blueBallCalculationTest(){
        assertEquals(2, basket.calculateBlueBalls());
    }

    @Test
    public void weightCalculationTest(){
        assertEquals(1463, basket.calculateBasketWeight());
    }

    @Test
    public void sortTest(){
        basket.sortBasket();
        ArrayList<Ball> correctOrder = new ArrayList<>(List.of(new Ball("blue", 1), new Ball("blue", 12),
                new Ball("green", 182), new Ball("yellow", 456), new Ball("red", 812)));
        assertTrue(basket.equals(correctOrder));
    }


}