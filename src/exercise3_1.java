public class exercise3_1 {
    public static void main(String[] args) {
        Readjsonfile readfile = new Readjsonfile();

        String stringvalues = readfile.readjson();
        System.out.println("values based on the key: " + stringvalues);
    }
}
