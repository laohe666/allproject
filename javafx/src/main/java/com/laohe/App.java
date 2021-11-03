package com.laohe;

import com.laohe.view.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App extends AbstractJavaFxApplicationSupport
{
    public static void main( String[] args )
    {
        launch(App.class, LoginView.class,args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("短信爆破,作者阿毛QQ:255771111");
        super.start(stage);
    }
}
