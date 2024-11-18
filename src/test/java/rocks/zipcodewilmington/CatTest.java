package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }


    @Test
    public void setNameTest() {
        //given
        Cat cat = new Cat(null, null, null);
        cat.setName("Kitty");

        //when
        String getNameResult = cat.getName();
        assertEquals("Kitty", getNameResult);
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat(null, null, null);
        //when
        String speak = cat.speak();
        assertEquals("meow!", speak);
    }

    @Test
    public void setBirthDateTest() {
        Cat cat = new Cat(null,null,null);
        cat.setBirthDate(new Date());

        //when
        Date getBirthDate = cat.getBirthDate();
        assertEquals(new Date(), getBirthDate);
    }

    @Test
    public void eatTest() {
        Cat cat = new Cat(null, null, null);
        ArrayList<Integer> eatenMeals = new ArrayList<>();
        //when
        Food food = new Food();
        cat.eat(food);
        int expected = 1;
        int actual = cat.eatenMeals.size();

        assertEquals(expected, actual);
    }

    @Test
    public void getIDTest() {
        //given
        Cat cat = new Cat(null, null, 5);
        //when
        Integer expected = 5;
        Integer Id = cat.getId();

        //when
        assertEquals(expected, Id);

    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
}
