import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestMD5 {
    private static MessageDigest instance;

    static {
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        }
    }

    public TestMD5() {

    }

   public static long hash(String key) {

        instance.reset();
        instance.update(key.getBytes());
        byte[] digest = instance.digest();

        long h = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("H val is ="+h);
            h <<= 8;
            System.out.println("h values is "+h+"Digest of i="+digest[i]);
            System.out.println(((int) digest[i]) & 0xFF);
            h |= ((int) digest[i]) & 0xFF;
            System.out.println("h values after & "+h);
        }
        return h;
    }
    public static void main(String args[]) {
        System.out.println("Inside main");
        TestMD5.hash("nothing");
        int j=256;
        System.out.println("See Below");
        System.out.println(j<<=8);
        System.out.println(256*(int)Math.pow(2,8));

    }
}
