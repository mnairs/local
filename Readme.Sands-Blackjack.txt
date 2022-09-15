Steps to execute the project
-------------------------------

1. Download the zip file and extract
2. Move to maven directory
cd cucumber-java-skeleton-main\maven
3. Run the maven command to get dependencies (update the directory c:\apache-maven-3.8.6 to where the maven is locally installed)
c:\apache-maven-3.8.6\bin\mvn.cmd dependency:resolve
4. Run the maven to run the tests (update the directory c:\apache-maven-3.8.6 to where the maven is locally installed)
c:\apache-maven-3.8.6\bin\mvn.cmd clean test  
5. Test results
Out of 11 tests, 3 will fail as the expected outcomes have been intentionally given wrong to show failed test cases.

Project files:

cucumber-java-skeleton-main
--- maven/src/main/java/io/cucuumber/skelton/Blackjack.java (this evaluates the outcome of the given cards)

--- maven/test/java/io/cucumber/skeleton/RunCucumberTest.java -- Junit5 Test Runner
--- maven/test/java/io/cucumber/skeleton/StepDefinition.java -- step definitions
--- maven/test/resource/io/cucumber/skeleton/blackjack.feature -- blackjack feature file

The base template has been downloaded from 
https://github.com/cucumber/cucumber-java-skeleton

Sample run output:

PS C:\Downloads\cucumber-java-skeleton-main\maven> C:\Downloads\apache-maven-3.8.6-bin\apache-maven-3.8.6\bin\mvn.cmd clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< cucumber:cucumber-java-skeleton >-------------------
[INFO] Building Cucumber-Java Skeleton 0.0.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ cucumber-java-skeleton ---
[INFO] Deleting C:\Downloads\cucumber-java-skeleton-main\maven\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ cucumber-java-skeleton ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Downloads\cucumber-java-skeleton-main\maven\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ cucumber-java-skeleton ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Downloads\cucumber-java-skeleton-main\maven\target\classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ cucumber-java-skeleton ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:testCompile (default-testCompile) @ cucumber-java-skeleton ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Downloads\cucumber-java-skeleton-main\maven\target\test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:3.0.0-M7:test (default-test) @ cucumber-java-skeleton ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running io.cucumber.skeleton.RunCucumberTest

Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:9
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards 2,2, expected outcome is Split,Hit.
  Then Player should expect "Split,Hit" for cards "2,2"   # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:10
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards 2,3, expected outcome is Hit.
  Then Player should expect "Hit" for cards "2,3"         # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:11
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards A,A, expected outcome is Split,Hit.
  Then Player should expect "Split,Hit" for cards "A,A"   # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:12
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards J,A11, expected outcome is Blackjack.
  Then Player should expect "Blackjack" for cards "J,A11" # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                         # io/cucumber/skeleton/blackjack.feature:13
  Given These are the following cards dealt to the player   # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards A11,A11, expected outcome is Split,Hit.
  Then Player should expect "Split,Hit" for cards "A11,A11" # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                        # io/cucumber/skeleton/blackjack.feature:14
  Given These are the following cards dealt to the player  # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards A11,10, expected outcome is Blackjack.
  Then Player should expect "Blackjack" for cards "A11,10" # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:15
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards A,3, expected outcome is Hit.
  Then Player should expect "Hit" for cards "A,3"         # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:16
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards A1,5, expected outcome is Hit.
  Then Player should expect "Hit" for cards "A1,5"        # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)

Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:17
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards 3,3, expected outcome is Hit.
  Then Player should expect "Hit" for cards "3,3"         # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)
      org.opentest4j.AssertionFailedError: expected: <Split,Hit> but was: <Hit>
        at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
        at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
        at org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:177)
        at org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:1141)
        at io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(StepDefinitions.java:19)
        at ?.Player should expect "Hit" for cards "3,3"(classpath:io/cucumber/skeleton/blackjack.feature:5)


Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:18
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards 7,5, expected outcome is Split.
  Then Player should expect "Split" for cards "7,5"       # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)
      org.opentest4j.AssertionFailedError: expected: <Hit> but was: <Split>
        at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
        at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
        at org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:177)
        at org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:1141)
        at io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(StepDefinitions.java:19)
        at ?.Player should expect "Split" for cards "7,5"(classpath:io/cucumber/skeleton/blackjack.feature:5)


Scenario Outline: Blackjack dealing                       # io/cucumber/skeleton/blackjack.feature:19
  Given These are the following cards dealt to the player # io.cucumber.skeleton.StepDefinitions.these_are_the_following_cards_dealt_to_the_player()
Expected: For two cards A11,A, expected outcome is Blackjack.
  Then Player should expect "Blackjack" for cards "A11,A" # io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(java.lang.String,java.lang.String)
      org.opentest4j.AssertionFailedError: expected: <Hit> but was: <Blackjack>
        at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
        at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
        at org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:177)
        at org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:1141)
        at io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(StepDefinitions.java:19)
        at ?.Player should expect "Blackjack" for cards "A11,A"(classpath:io/cucumber/skeleton/blackjack.feature:5)

[ERROR] Tests run: 11, Failures: 3, Errors: 0, Skipped: 0, Time elapsed: 0.247 s <<< FAILURE! - in io.cucumber.skeleton.RunCucumberTest
[ERROR] Sands project tests - Blackjack dealing - Examples.Sands project tests - Blackjack dealing - Examples - Example #9  Time elapsed: 0.016 s  <<< FAILURE!
org.opentest4j.AssertionFailedError: expected: <Split,Hit> but was: <Hit>
        at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
        at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
        at org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:177)
        at org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:1141)
        at io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(StepDefinitions.java:19)
        at ?.Player should expect "Hit" for cards "3,3"(classpath:io/cucumber/skeleton/blackjack.feature:5)

[ERROR] Sands project tests - Blackjack dealing - Examples.Sands project tests - Blackjack dealing - Examples - Example #10  Time elapsed: 0.008 s  <<< FAILURE!
org.opentest4j.AssertionFailedError: expected: <Hit> but was: <Split>
        at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
        at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
        at org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:177)
        at org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:1141)
        at io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(StepDefinitions.java:19)
        at ?.Player should expect "Split" for cards "7,5"(classpath:io/cucumber/skeleton/blackjack.feature:5)

[ERROR] Sands project tests - Blackjack dealing - Examples.Sands project tests - Blackjack dealing - Examples - Example #11  Time elapsed: 0.009 s  <<< FAILURE!
org.opentest4j.AssertionFailedError: expected: <Hit> but was: <Blackjack>
        at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
        at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
        at org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
        at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:177)
        at org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:1141)
        at io.cucumber.skeleton.StepDefinitions.the_player_ealer_gives_twp_cards_to_the_player(StepDefinitions.java:19)
        at ?.Player should expect "Blackjack" for cards "A11,A"(classpath:io/cucumber/skeleton/blackjack.feature:5)

[INFO] 
[INFO] Results:
[INFO]
[ERROR] Failures: 
[ERROR]   expected: <Hit> but was: <Split>
[ERROR]   expected: <Hit> but was: <Blackjack>
[ERROR]   expected: <Split,Hit> but was: <Hit>
[INFO]
[ERROR] Tests run: 11, Failures: 3, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.584 s
[INFO] Finished at: 2022-09-10T21:14:16-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M7:test (default-test) on project cucumber-java-skeleton: There are test failures.
[ERROR]
[ERROR] Please refer to C:\Downloads\cucumber-java-skeleton-main\maven\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
PS C:\Downloads\cucumber-java-skeleton-main\maven> 
