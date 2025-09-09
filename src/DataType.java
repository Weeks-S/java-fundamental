public class DataType  {
    public static void main(String[] args) {
//      a.byte
        byte byt = -128;
        byte byt1 = 127;
        byte byt2 = 0;
        byt = 99;
        final byte testDataType = byt;
        byt = 100;
        System.out.println("testDataType = " + testDataType);
        System.out.println(byt2 + byt1 + byt);

//       b. short
//       c. int
//       d. long
        long _long = 2102035801002312345L;
        System.out.println(_long);
        System.out.printf("%,d", _long);
//       e. float & double
        float _float = 123.456f;
        System.out.println(_float);
//       f. char
        char _char = 'a';
        char _char1 = '\u5ac1';
        System.out.println(_char1);
        System.out.println(_char);
//       g. boolean

//        NON-PRIMITIVE VARIABLE
//        a.String
        String nama = "Sagas ArZAaq SatWikA";
        System.out.println(nama);
        System.out.println(nama.toLowerCase());
        System.out.println(nama.toUpperCase());

        System.out.println(nama.getClass().getSimpleName());
    }
}
