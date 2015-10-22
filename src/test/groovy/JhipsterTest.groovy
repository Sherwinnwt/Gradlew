import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class JhipsterTest extends GebReportingTest {

    @Test
    void canGetToJhipsterHomePage() {
        to JhipsterHomePage

        }

}
