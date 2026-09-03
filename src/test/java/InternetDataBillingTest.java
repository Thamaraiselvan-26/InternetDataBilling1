import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InternetDataBillingTest {

    @Test
    void testBasicPlan() {
        double usage = 8;
        double limit = 10;
        double charge = 300;

        double extraCharge = 0;

        if (usage > limit) {
            extraCharge = (usage - limit) * 20;
        }

        double totalBill = charge + extraCharge;

        assertEquals(300, totalBill);
    }

    @Test
    void testStandardPlan() {
        double usage = 15;
        double limit = 20;
        double charge = 500;

        double extraCharge = 0;

        if (usage > limit) {
            extraCharge = (usage - limit) * 20;
        }

        double totalBill = charge + extraCharge;

        assertEquals(500, totalBill);
    }

    @Test
    void testPremiumPlan() {
        double usage = 40;
        double limit = 50;
        double charge = 800;

        double extraCharge = 0;

        if (usage > limit) {
            extraCharge = (usage - limit) * 20;
        }

        double totalBill = charge + extraCharge;

        assertEquals(800, totalBill);
    }

    @Test
    void testExtraUsageCharge() {
        double usage = 25;
        double limit = 20;
        double charge = 500;

        double extraCharge = (usage - limit) * 20;
        double totalBill = charge + extraCharge;

        assertEquals(600, totalBill);
    }
}
