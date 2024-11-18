package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Holly";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String expectedName = dog.getName();
        Date expectedBirthDate = dog.getBirthDate();
        Integer expectedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, expectedName);
        assertEquals(givenBirthDate, expectedBirthDate);
        assertEquals(givenId, expectedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog(null, null, null);
        //when
        String speak = dog.speak();
        assertEquals("bark!", speak);
    }

        @Test
        public void setBirthDateTest() {
        Dog dog = new Dog(null, null, null);
        dog.setBirthDate(new Date());

        //when
        Date getBirthDate = dog.getBirthDate();
        assertEquals(new Date(), getBirthDate);
    }

        @Test
        public void eatTest() {
        Dog dog = new Dog (null, null, null);
        ArrayList<Integer> eatenMeals = new ArrayList<>();
        //when
        Food food = new Food();
        dog.eat(food);
        int expected = 1;
        int actual = dog.eatenMeals.size();

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

}








