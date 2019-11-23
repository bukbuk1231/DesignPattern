package avgCalculator;

public class AvgCaclulatorFactory {

    public static AvgCalculator getAvgCalculator(String method) {
        switch (method) {
            case "A4E6":
                return new AvgCalculatorA4E6();
            case "A4E6DropLowest":
                return new AvgCalculatorA4E6DropLowest();
            default:
                return new AvgCalculatorA4E6();
        }
    }

}
