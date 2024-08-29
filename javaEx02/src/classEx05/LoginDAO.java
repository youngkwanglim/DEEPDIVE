package classEx05;

import java.util.HashMap;

public class LoginDAO {
    public static final String KEY_ID = "id";
    public static final String KEY_PW = "passwd";

    private String memId;
    private String memPw;

    public LoginDAO() {
        memId = "abcd";
        memPw = "1234";
    }

    public boolean loginCheck(HashMap<String, String> map) {
        if(map.get(KEY_ID).equals(memId) &&
                map.get(KEY_PW).equals(memPw)) {
            System.out.println("아이디와 패스워드가 일치");
            return true;
        } else {
            System.out.println("아이디와 패스워드가 불일치");
            return false;
        }
    }
}
