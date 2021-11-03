package com.laohe.alter;

import com.laohe.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Li XunHuan
 * @version 5.0.0
 * created at 2021/11/3 22:01
 * copyright @2021 李寻欢
 */
public class ViewAlter extends Application {

    private static ViewAlter viewAlter = null;

    /**
     * 私有化构造方法
     * */
    private ViewAlter() {}

    /**
     * 获取单例对象
     * */
    public static synchronized ViewAlter getViewAlter() {
        if (viewAlter == null) {
            ViewAlter viewAlter = new ViewAlter();
            ViewAlter.viewAlter = viewAlter;
            return viewAlter;
        }
        return viewAlter;
    }
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("执行 start方法");
        stage = primaryStage;
        stage.setTitle("主页");
        gotoMainView();
        stage.show();

    }

    /**
     * 跳转到主页
     * */
    public void gotoMainView() throws IOException {
        System.out.println("执行跳转到主页视图方法");
        MainController mainController = (MainController) replaceScenContent("/view/Main.fxml");
        mainController.setApp(ViewAlter.getViewAlter());
    }

    /**
     * 替换场景
     * */
    private Initializable replaceScenContent(String fxml) throws IOException {
        System.out.println("执行替换场景方法");
        FXMLLoader loader = new FXMLLoader();
        InputStream in = ViewAlter.class.getResourceAsStream(fxml);
        System.out.println(in);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(ViewAlter.class.getResource(fxml));
        AnchorPane pane = loader.load(in);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.sizeToScene();
        System.out.println(stage.getTitle());
        in.close();
        return loader.getController();
    }


}
