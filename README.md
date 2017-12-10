# Sky Technical Test - Agile Testing

Sky Sports is the biggest broadcaster for live sporting events in the UK and covers a wide variety of sports, such as football, cricket, golf, tennis, darts, rugby union, rugby league, wrestling, boxing, and NFL.

Sky Sports Web Team have recently delivered a brand new homepage at http://www.skysports.com. The aim of this test is to provide automated test coverage for the newly built homepage.

## Setup

### Pre-requisites

- Maven
- Java 1.8+

### Running the Tests

- Unzip the Tech Test
- Download the latest chromedriver from https://sites.google.com/a/chromium.org/chromedriver/ and extract the contents within the `drivers` directory
- Open `Terminal/Command Prompt` in the project directory
- Simply run the following to execute the tests:

```bash
mvn clean test
```

## Task

### Part 1

- All of the `cucumber` classes are not resolving, fix the project setup so that existing tests compile and run successfully.

### Part 2

There is only one scenario in `homepage.feature`:

```cucumber
Scenario: I should be able to navigate to homepage
  Given I navigate to skysports homepage
  Then I should see the skysports logo
```

- Extend `homepage.feature` and implement further scenarios for the top 5 most important features on the homepage.

Please try to complete as much as you can in the 2 hours, we're not looking for everything to be done correctly.

The more interesting thing is seeing how you approach this, what your thought process is, how well you can interpret code, and also your source code management abilities.

## Submission

Once you have completed the 2 hours, please zip the project directory excluding the `drivers` directory and reply to the email with this attached.

Please do not push/create a Pull Request, these will be rejected/closed.
