package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

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
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void setBirthDateTest(){
        //Given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Date expectedDate = new Date();
        dog.setBirthDate(expectedDate);

        //Then
        Assert.assertEquals(expectedDate, dog.getBirthDate());
    }
    @Test
    public void speakTest(){
        //Given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String expectedSound = "bark!";

        //Then
        Assert.assertEquals(expectedSound, dog.speak());
    }
    @Test
    public void eatTest(){
        //Given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Food dogFood = new Food();
        dog.eat(dogFood);
        int expectedMeal = 1;

        //Then
        Assert.assertEquals(java.util.Optional.of(expectedMeal), dog.getNumberOfMealsEaten());
    }
    @Test
    public void getIdTest(){
        //Given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Integer expectedId = 0;
        //Then
        Assert.assertEquals(expectedId, dog.getId());
    }
    @Test
    public void implementTest(){
        //Given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        //Then
        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void inheritanceTest(){
        //Given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        //Then
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void constructorTest(){
        //Given (dog data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        //When (a dog is retrieved)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        //Then (we expect the data given to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }
}
