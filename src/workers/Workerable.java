package workers;

import exceptions.ParamNotPresentException;
import exceptions.SomethingIsMissingException;

/**
 * The interface Workerable.
 */
public interface Workerable {

    /**
     * Do work.
     *
     * @param params the params
     * @throws SomethingIsMissingException the something is missing exception
     * @throws ParamNotPresentException    the param not present exception
     */
    void doWork(String... params) throws SomethingIsMissingException, ParamNotPresentException;
}
