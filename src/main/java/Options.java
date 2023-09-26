import java.util.HashMap;
import java.util.Map;

public enum Options {
    EXO1_STUDENTS(1),
    EXO2_ARRAYS(2),
    EXO3_PRIME(3);
    private final int value;
    private static final Map<Integer, Options> map = new HashMap<>();

    private Options(int value) {
        this.value = value;
    }

    static {
        for (Options op : Options.values())
            map.put(op.value, op);
    }

    public static Options valueOf(int pageType) {
        return (Options) map.get(pageType);
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\t- Type ").append(value).append(" for : ").append(super.toString());

        return builder.toString();
    }
}
