package TestSuites;

import jUnitExamples.AssertJUnitTests;
import jUnitExamples.Ivoice;
import jUnitExamples.ParametrizedTests;
import jUnitExamples.PrintJunitTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        Ivoice.class
)


public class TestInvoiceSuite {
}