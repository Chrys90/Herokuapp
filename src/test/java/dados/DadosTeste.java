package dados;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DadosTeste {


    private static Properties getProp() throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/dados/dados.properties");
        prop.load(file);
        return prop;

    }

    public static String getAbTestingParagrafo() throws IOException {
        return getProp().getProperty("abtest.paragrafo");
    }

}
