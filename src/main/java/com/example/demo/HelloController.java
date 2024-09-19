package com.example.demo;

import com.example.demo.model.Procent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
        @FXML
        private Label amountCheck;
        @FXML
        private Label tips15;
        @FXML
        private Label tips10;
        @FXML
        private Label tips3;
        @FXML
        private TextField totalSum;

        @FXML
        public void initialize() {
            applyLabelStyles();
        }

        private void applyLabelStyles() {
            // Применение стилей к Label
            tips15.getStyleClass().add("my-label");
            tips10.getStyleClass().add("my-label");
            tips3.getStyleClass().add("my-label");
        }

        private Procent procent = new Procent(0);

        @FXML
        protected void tips15() {
            tips15.setText(procent.toString(procent.countSum(Integer.parseInt(totalSum.getText()), 15)));
        }

        @FXML
        protected void tips10() {
            tips10.setText(procent.toString(procent.countSum(Integer.parseInt(totalSum.getText()), 10)));
        }

        @FXML
        protected void tips3() {
            tips3.setText(procent.toString(procent.countSum(Integer.parseInt(totalSum.getText()), 3)));
        }



        @FXML
        protected void onHelloButtonClick() {
//        counter.plusK();
//        welcomeText.setText(counter.toString());
        }

        @FXML
        protected void neHelloButtonClick() {
//        counter.minusK();
//        welcomeText.setText(counter.toString());

        }

    }