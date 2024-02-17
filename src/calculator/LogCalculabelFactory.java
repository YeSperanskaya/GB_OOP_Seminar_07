package calculator;

import java.util.logging.Logger;

public class LogCalculabelFactory implements ICalculableFactory{
    private Logable logable;
    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logable);
    }

    public LogCalculabelFactory(Logable logable) {
        this.logable = logable;
    }
}
