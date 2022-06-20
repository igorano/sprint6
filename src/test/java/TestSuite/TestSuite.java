package TestSuite;

import jUnitExamples.AssertJUnitTests;
import jUnitExamples.ParametrizedTests;
import jUnitExamples.PrintJunitTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({AssertJUnitTests.class, PrintJunitTests.class, ParametrizedTests.class})


public class TestSuite {
}