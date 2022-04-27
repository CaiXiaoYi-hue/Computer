public class ComputeFactory {

    private final static Sub sub = new Sub();
    private final static Add add = new Add();

    public static computable getcomputable(String symbol) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (computable) Class.forName(symbol).newInstance();

    }
}
