package calculator;

public class LogCalculator implements Calculable {
    private Calculable calculable;
    private Logable logable;
    public LogCalculator(Calculator calculator, Logable logable) {
        this.calculable = calculator;
        this.logable = logable;
    }

    @Override
    public Calculable sum(int arg) {
        logable.log("вызов метода суммы с аргументом " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logable.log("вызов метода умножения с аргументом " + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        logable.log("Результат который запросил пользователь");
        return calculable.getResult();
    }
}
