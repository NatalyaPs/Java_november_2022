package Ex003Math.Mathematics.Exceptions;

public class UnacceptableValueException extends MathematicsException { // UnacceptableValueException == Неприемлемое значение исключения
    public UnacceptableValueException(String msg) {
        super(msg);
    }
}
