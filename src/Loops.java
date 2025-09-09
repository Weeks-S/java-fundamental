public class Loops {
    public static void main(String[] args) {
//        For Loops
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
//        for(int i = 0; i < hari.length; i++){
//            System.out.println("Ini Hari " + hari[i]);
//        }
//        While Loops
        int i = 0;
        while(i < hari.length){
            System.out.println("Ini Hari " + hari[i]);
            i++;
        }
//        Do-While
        int j = 0;
        do{
            System.out.println(i == 7 ? "Hari tidak ditemukan" : "Ini Hari " + hari[i]);
            i++;
        } while (i <= hari.length);
    }
}
