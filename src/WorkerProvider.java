import workers.ClientWorker;
import workers.OtherWorker;
import workers.Workerable;

/**
 * The type Worker provider.
 */
public class WorkerProvider {

    /**
     * Gets instance.
     *
     * @param clazz the clazz
     * @return the instance
     * @throws ClassNotFoundException the class not found exception
     */
    static Workerable getInstance(Class clazz) throws ClassNotFoundException {

        final String currentClass = clazz.getSimpleName();

        if(currentClass.equalsIgnoreCase(ClientWorker.class.getSimpleName())){
            return new ClientWorker();
        }

        if(currentClass.equalsIgnoreCase(OtherWorker.class.getSimpleName())){
            return new OtherWorker();
        }

        final String message = new StringBuilder("The class: ").append(currentClass).toString();
        throw new ClassNotFoundException(message);
    }
}
