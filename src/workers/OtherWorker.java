package workers;

import exceptions.ParamNotPresentException;

/**
 * The type Other worker.
 */
public class OtherWorker implements Workerable {

    @Override
    public void doWork(String... params) throws ParamNotPresentException {
        if(params.length == 0){
            throw new ParamNotPresentException();
        }

        System.out.println("Hello from workers.OtherWorker!");
    }
}
