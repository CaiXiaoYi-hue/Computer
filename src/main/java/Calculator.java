public class Calculator {

    public int compute(int num1, int num2,char symbol) {
        computable computable = ComputeFactory.getcomputable(symbol);
        return computable.compute(num1,num2);
    }
}
