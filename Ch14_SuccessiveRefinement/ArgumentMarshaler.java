// Listing 14-3
public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}