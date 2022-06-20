package TestSuites;

import jUnitExamples.AssertJUnitTests;
import jUnitExamples.Order;
import jUnitExamples.ParametrizedTests;
import jUnitExamples.PrintJunitTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        Order.class
)


public class TestOrderSuite {
}