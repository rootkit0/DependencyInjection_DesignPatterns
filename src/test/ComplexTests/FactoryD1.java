package ComplexTests;

import common.DependencyException;
import complex.Factory;
import Implementations.ImplementationD1;

public class FactoryD1FactoryD1 implements Factory {
    @Override
    public Object create(Object... parameters) throws DependencyException {
        int i;
        try {
            i = (int) parameters[0];
        }catch (ClassCastException | ArrayIndexOutOfBoundsException ex){
            throw new DependencyException(ex);
        }
        return new ImplementationD1(i);
    }
}
