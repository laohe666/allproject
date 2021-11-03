package com.laohe.controller;

import com.laohe.alter.ViewAlter;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
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
    private ViewAlter viewAlter = ViewAlter.getViewAlter();

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
        viewAlter.gotoMainView();
    }

    /**
     *
     * */
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }
}
