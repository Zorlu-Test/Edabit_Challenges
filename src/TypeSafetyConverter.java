public class TypeSafetyConverter {

    public static void main(String[] args) {

        long test1 = convert(343432432342324l);
        String test2 = convert("a-b-c-d");
        double test3 = convert(34.4);

        System.out.println("test2 = " + test2);
    }

    /**
     * This method accepts any type of data from excel or other sources and convert convenient type
     */
    public static <T> T convert(T data) {
        if (data instanceof Integer) {
            int intData = ((Integer) data).intValue();
            return (T) Integer.valueOf(intData);
        } else if (data instanceof String) {
            String stringData = data.toString();
            return (T) stringData;
        } else if (data instanceof Boolean) {
            boolean booleanData = ((Boolean) data).booleanValue();
            return (T) Boolean.valueOf(booleanData);
        } else if (data instanceof Long) {
            long longData = ((Long) data).longValue();
            return (T) Long.valueOf(longData);
        } else if (data instanceof Double) {
            double doubleData = ((Double) data).doubleValue();
            return (T) Double.valueOf(doubleData);
        } else if (data instanceof Float) {
            float floatData = ((Float) data).floatValue();
            return (T) Float.valueOf(floatData);
        } else {
            // Handle unsupported types here
            throw new IllegalArgumentException("Unsupported data type: " + data.getClass());
        }
    }


}
