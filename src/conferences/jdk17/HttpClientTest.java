package conferences.jdk17;

public class HttpClientTest {
    public static void main(String[] args) {
        StackWalker walker = StackWalker
                .getInstance(
                        StackWalker.Option.RETAIN_CLASS_REFERENCE
                );

        walker.forEach(
                stackFrame -> System.out.println(stackFrame.getClassName())
        );
    }
}
