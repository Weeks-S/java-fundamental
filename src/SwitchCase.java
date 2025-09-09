public class SwitchCase {
    public static void main(String[] args) {
        int hari = 1;
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak ditemukan");
        }
        switch (hari) {
            case 1 -> System.out.println("Senin");
            case 2 -> System.out.println("Selasa");
            case 3 -> System.out.println("Rabu");
            case 4 -> System.out.println("Kamis");
            case 5 -> System.out.println("Jumat");
            case 6 -> System.out.println("Sabtu");
            case 7 -> System.out.println("Minggu");
            default -> System.out.println("Hari tidak ditemukan");
        }
        String day = switch (hari){
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Hari tidak ditemukan";
        };
        System.out.println(day);

        Boolean libur = (hari >= 6);

        if (!libur) {
            System.out.println("Hari Kerja");
            switch (hari) {
                case 1 -> System.out.println("Senin");
                case 2 -> System.out.println("Selasa");
                case 3 -> System.out.println("Rabu");
                case 4 -> System.out.println("Kamis");
                case 5 -> System.out.println("Jumat");
                default -> System.out.println("Hari tidak ditemukan");
            }
        } else {
            System.out.println("Hari Libur");
            switch (hari) {
                case 6  -> System.out.println("Sabtu");
                case 7 -> System.out.println("Minggu");
                default -> System.out.println("Hari tidak ditemukan");
            }
        }

    }
}
