package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createCat;
import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createDog;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //given
        String name = "Holly";
        Date date = new Date();
        //when
        Dog dog = createDog("Holly", new Date());

        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(date, dog.getBirthDate());

    }
    @Test
    public void createCatTest() {
        //given
        String name = "Olive";
        Date date = new Date();

        //when
        Cat cat = createCat("Olive", new Date());

        Assert.assertEquals(name, cat.getName());
        Assert.assertEquals(date, cat.getBirthDate());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
