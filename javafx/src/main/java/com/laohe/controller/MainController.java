package com.laohe.controller;


import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Li XunHuan
 * @version 5.0.0
 * created at 2021/11/3 21:19
 * copyright @2021 李寻欢
 */
@FXMLController
public class MainController implements Initializable {

    /**
     * 开始爆破按钮
     * */
    @FXML
    private Button startBtn;

    /**
     * 上面的输入框
     * */
    @FXML
    private TextField textOne;

    @FXML
    private TextField textTwo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * 将下面的内容放入上面
     * */
    public void downToUp() {
        textOne.setText(textTwo.getText());
    }
}
