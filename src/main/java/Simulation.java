public class Simulation {

    public static void main(String[] args) {

        Dice dice = new Dice(2);
        Bins results = new Bins(2, 12);

        Integer myRoll;


        for (Integer i = 0; i < 1000000; i++) {

            myRoll = dice.tossAndSum();

            results.incrementBin(myRoll);

        }

        results.printOut();

    }















//    Simulation sim = new Simulation(2, 10000);

//sim.runSimulation();

//sim.printResults();



/**

    public class TestPerson {
        @Test
        public void testDefaultConstructor() {
            // Given
            String expectedName = "";
            Integer expectedAge = Integer.MAX_VALUE;

            // When
            Person person = new Person();

            // Then
            String actualName = person.getName();
            Integer actualAge = person.getAge();

            Assert.assertEquals(expectedName, actualName);
            Assert.assertEquals(expectedAge, actualAge);
        }


*/



//    Dice dice = new Dice(2); // for craps
//    Dice dice = new Dice(5); // for yatzee

//    Integer toss = dice.tossAndSum();





}
