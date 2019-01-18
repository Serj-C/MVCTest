package mvcTest;

public class MVCCalculator {
    public static void main(String[] args) {
        // This is a test comment
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }
}
