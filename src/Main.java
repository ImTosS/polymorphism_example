import exceptions.ParamNotPresentException;
import exceptions.SomethingIsMissingException;
import workers.OtherWorker;
import workers.Workerable;

/**
 * The type Main.
 */
public class Main {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String... args){

        try {
            final Workerable worker = WorkerProvider.getInstance(OtherWorker.class);
            worker.doWork("@");
        } catch (ClassNotFoundException | SomethingIsMissingException | ParamNotPresentException e) {
            e.printStackTrace();
        }

    }
}
