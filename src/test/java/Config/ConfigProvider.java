package Config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.openqa.selenium.devtools.v85.database.Database;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.load("profileBase.conf");
    }
    String URL = readConfig().getString("url");
    String MAX_LOGIN = readConfig().getString("users.max.login");
    String MAX_PASSWORD = readConfig().getString("users.max.password");
    String MASSAGE =readConfig().getString("users.max.massage");

    String ARTEM_LOGIN = readConfig().getString("users.artem.login");
    String ARTEM_PASSWORD = readConfig().getString("users.artem.password");
}
