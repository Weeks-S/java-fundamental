public class TypeConversion {
    public static void main(String[] args) {
        byte num = 120;
        short snum= num;
        int inum= snum;
        long lnum= inum;
        System.out.println(lnum);

        short x = 256;
        byte a = (byte)x;
        System.out.println(a);

        float fnum= 2.82309f;
        int xnum = (int)fnum;
        System.out.println(xnum);
        double dnum = 3.14151012039934920;
        System.out.println(dnum);
    }
}
