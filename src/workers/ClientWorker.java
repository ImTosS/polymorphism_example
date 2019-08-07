package workers;

import exceptions.SomethingIsMissingException;

/**
 * The type Client worker.
 */
public class ClientWorker implements Workerable {

    @Override
    public void doWork(String... params) throws SomethingIsMissingException {
        if(params.length == 0){
            throw new SomethingIsMissingException();
        }

        System.out.println("Hello from workers.ClientWorker!");
    }
}
