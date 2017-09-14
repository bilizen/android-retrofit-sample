package retrofit.api.com.apiretrofit;

/**
 * Created by rodrigo on 14/09/17.
 */

public class PostUser {
    private String Account;
    private String Password;

    public PostUser(String account, String password) {
        Account = account;
        Password = password;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
