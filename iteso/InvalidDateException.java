package iteso;

public class InvalidDateException extends RuntimeException
{
    private int invalid_arg;
    
    public InvalidDateException(int invalid_arg)
    {
        super("InvalidDateExcetpion");
        this.invalid_arg = invalid_arg;
    }

    public String toString()
    {
        return String.format("%s Invalid Date Found - Argument %d not valid", super.getMessage(), this.invalid_arg);
    }
}
