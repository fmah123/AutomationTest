Selenium-Cucumber automation assessement solution: 

To run this test you need the latest version of intellij and compiler set to JDK 11. To find compiler settings go File > settings > compiler > Java Compiler 
and change Target bytecode version to 11. Set project SDK and language level to 11 this is found in File > Project Structure > Project change Project SDK to 11 and Project Language Level
to 11. Then change module language level by going on Project Structure > Modules this is where you can find Language level which needs to be change to 11.

Note: Compile and run the CucumberTestsRunner class file found under src > test > java > runner. 

The project has selenium webdriver auto managed by the bonigarcia webdriver manager dependancy.

