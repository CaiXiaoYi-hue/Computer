public class ComputeFactory {

    private final static Sub sub = new Sub();
    private final static Add add = new Add();

    public static computable getcomputable(char symbol){
        switch (symbol){
            case '+':
                return add;
            case '-':
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }
}
