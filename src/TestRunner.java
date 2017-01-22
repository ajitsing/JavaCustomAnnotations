import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public void runTests(Object test) throws InvocationTargetException, IllegalAccessException {
        Method[] allMethods = test.getClass().getDeclaredMethods();
        for (Method method : allMethods) {
            executeMethod(test, method);
        }
    }

    private void executeMethod(Object test, Method method) throws InvocationTargetException, IllegalAccessException {
        if (method.isAnnotationPresent(MyTest.class)) {
            method.invoke(test);
        }
    }
}
