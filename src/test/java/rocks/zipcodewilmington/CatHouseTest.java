package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.add;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    Cat puck = new Cat("Puck", new Date(), 20);

    @Test
    public void addCatTest() {
        CatHouse.add(puck);

        Integer expectedSize = 1;
        Integer actualSize = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeCatTest(){
        CatHouse.remove(puck);
        Integer expectedSize = 0;
        Integer actualSize = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedSize, actualSize);
    }


    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
