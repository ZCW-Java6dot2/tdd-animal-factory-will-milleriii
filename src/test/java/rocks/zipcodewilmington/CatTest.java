package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    private Cat cat;

    @Before
    public void setup() {
        this.cat = new Cat();
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expectedName = "Nighty";
        cat.setName(expectedName);

        // then
        Assert.assertEquals(expectedName, cat.getName());
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expectedSound = "meow!";



        // then
        Assert.assertEquals(expectedSound, cat.speak());
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Date expectedDate = new Date();
        cat.setBirthDate(expectedDate);

        // then
        Assert.assertEquals(expectedDate, cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // given
        String givenName = "Zula";
        Date givenDate = new Date();
        Integer givenId = 0;


        // when
        Cat cat = new Cat(givenName, givenDate, givenId);
        Food catFood = new Food();
        cat.eat(catFood);
        int expectedMeal = 1;


        // then
        Assert.assertEquals(java.util.Optional.of(expectedMeal), cat.getNumberOfMealsEaten());
    }

    //TODO - Create a test for Integer getId
    @Test
    public void getIdTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer expectedId = 0;
        Assert.assertEquals(expectedId, cat.getId());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void implementTest() {
        // given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // then
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // then
        Assert.assertTrue(cat instanceof Mammal);
    }



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
        Assert.assertEquals(givenName, retrievedName); //
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
