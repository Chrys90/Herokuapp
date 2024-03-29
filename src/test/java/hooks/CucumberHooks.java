package hooks;

import Suporte.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void setUp(){
        Driver.navegador(System.getProperty("browser"));
    }

    @After
    public static void encerrarNavegador(){
        Driver.fecharNavegador();
    }
}
