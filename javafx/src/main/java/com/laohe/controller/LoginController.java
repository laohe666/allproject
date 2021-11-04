package com.laohe.controller;


import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Li XunHuan
 * @version 5.0.0
 * created at 2021/11/3 20:56
 * copyright @2021 李寻欢
 */
@FXMLController
public class LoginController implements Initializable {
    @FXML
    AnchorPane pane1;

    /**
     * 登陆按钮
     * */
    @FXML
    private Button loginBtn;

    /**
     * 用户名
     * */
    @FXML
    private TextField usernameText;

    /**
     * 密码
     * */
    @FXML
    private TextField passwordText;

    /**
     * 初始化方法
     * */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize方法");
    }

    /**
     * 登陆方法
     * */
    public void login() throws IOException {
        String username = usernameText.getText();
        String password = passwordText.getText();
        for (int i = 0; i < 10000; i++ ) {
            usernameText.setText(String.valueOf(i));
        }
//        FXMLLoader loader = new FXMLLoader();
//        InputStream in = LoginController.class.getResourceAsStream("/view/Main.fxml");
//        loader.setBuilderFactory(new JavaFXBuilderFactory());
//        loader.setLocation(LoginController.class.getResource("/view/Main.fxml"));
//        AnchorPane pane = loader.load(in);
//        Scene scene = new Scene(pane);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.sizeToScene();
//        stage.setTitle("爆破字典");
//        in.close();
//        stage.show();
    }

}
