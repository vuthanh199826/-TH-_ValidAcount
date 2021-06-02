public class Main {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println(account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println(account + " is valid: " + isvalid);
        }
    }
}
