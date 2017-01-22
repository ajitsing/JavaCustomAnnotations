import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public void runTests(Object test) throws InvocationTargetException, IllegalAccessException {
        Method[] allMethods = test.getClass().getDeclaredMethods();
        for (Method method : allMethods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(test);
            }
        }
    }
}
