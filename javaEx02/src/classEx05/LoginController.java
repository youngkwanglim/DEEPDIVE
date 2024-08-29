package classEx05;

import java.util.HashMap;

public class LoginController {
    LoginDAO dao = new LoginDAO();

    public boolean loginCheck(String id, String pass) {
        //HashMap 생성 : id, passwd
        HashMap<String, String> map = new HashMap<>();
        map.put(LoginDAO.KEY_ID, id);
        map.put(LoginDAO.KEY_PW, pass);

        // DAO에게 HashMap 전달 : DAO의 메서드 호출하면서 인자로 전달
        return dao.loginCheck(map);
    }
}
