public class LazyMan {
    private static LazyMan ourInstance = new LazyMan();

    public static LazyMan getInstance() {
        return ourInstance;
    }

    private LazyMan() {
    }
}
