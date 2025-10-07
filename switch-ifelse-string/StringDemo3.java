public class StringDemo3 {
    public static void main(String[] args) {
        int h = 10;
        int h2 = 0b1010101010010;
        int h3 = 0xA54BE22;
        int h4 = 7_00_000;
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        String tt = "Amit";
        tt.toUpperCase();
        // StringBuffer - Legacy Old + Synchronized
        StringBuilder sql = new StringBuilder("select * from products"); // Modern
        String type = "";
        if (type.equals("mobile")) {
            sql = sql.append(" where type= 'mobile'");
        }
        // select * from products where type = 'mobile';
        // select * from products where type = 'mobile' and sim='dual' and ram=8;

    }
}
