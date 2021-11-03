package com.laohe.controller;

import com.laohe.alter.ViewAlter;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.Initializable;

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

    private ViewAlter viewAlter;

    /**
     *
     * */
    public void setApp(ViewAlter viewAlter) {
        this.viewAlter = viewAlter;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
