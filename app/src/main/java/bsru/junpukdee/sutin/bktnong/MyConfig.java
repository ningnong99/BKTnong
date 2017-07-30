package bsru.junpukdee.sutin.bktnong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by NongDay on 7/30/2017.
 */

public class MyConfig {

    private String ip = "";
    private String port = "";
    private String login = "http://\"+ip+\":\"+port+\"/project/android/user_get.php";

    public String getLogin(){
        return login;
    }

}
