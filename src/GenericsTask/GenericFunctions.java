package GenericsTask;

public class GenericFunctions<T> {

    Integer[] intArray = {10, 20, 50};
    String[] stringArray = {"Apple", "Google", "Microsoft"};

    public <T> void printArray (T[] Arrays) {
        for (T element : Arrays)
            System.out.printf("%s ", element);
        System.out.println();
    }
}
