public class contohVariabel {
    
    public static void main(String[] args){
        String hobby="bermain basket";
        char jenisKelamin='L';
        boolean isPandai=true;
        byte umur=20;
        double $ipk=3.24, tinggi=1.78;

        System.out.println(hobby);
        System.out.println("apakah saya pandai?" + isPandai);
        System.out.println("jenis kelamin" + jenisKelamin);
        System.out.println("umurku saat ini" + umur);
        System.out.println(String.format("saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));

    }
}
