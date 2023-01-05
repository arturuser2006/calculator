package com.example.calculator;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {
    static MutableLiveData<String> number = new MutableLiveData<>();
    private double numOne;
    private double numTwo;
    static MutableLiveData<String> operator = new MutableLiveData<>();
    static MutableLiveData<String> history = new MutableLiveData<>();

    static {
        number.setValue("");
        operator.setValue("");
        history.setValue("");
    }

    public void onSevenClick() {
        number.setValue(number.getValue() + "7");
    }

    public void onEightClick() {
        number.setValue(number.getValue() + "8");
    }

    public void onNineClick() {
        number.setValue(number.getValue() + "9");
    }

    public void onFourClick() {
        number.setValue(number.getValue() + "4");
    }

    public void onFiveClick() {
        number.setValue(number.getValue() + "5");
    }

    public void onSixClick() {
        number.setValue(number.getValue() + "6");
    }

    public void onOneClick() {
        number.setValue(number.getValue() + "1");
    }

    public void onTwoClick() {
        number.setValue(number.getValue() + "2");
    }

    public void onThreeClick() {
        number.setValue(number.getValue() + "3");
    }

    public void onZeroClick() {
        number.setValue(number.getValue() + "0");
    }

    public void onClearClick() {
        number.setValue("");
    }

    public void onPercentClick() throws Exception{
        operator.setValue("%");
        setNumOne(Double.parseDouble(number.getValue()));
        number.setValue("");
    }

    public void onDivClick() throws Exception{
        operator.setValue("/");
        setNumOne(Double.parseDouble(number.getValue()));
        number.setValue("");
    }

    public void onMulClick() throws Exception{
        operator.setValue("*");
        setNumOne(Double.parseDouble(number.getValue()));
        number.setValue("");
    }

    public void onMinClick() throws Exception{
        operator.setValue("-");
        setNumOne(Double.parseDouble(number.getValue()));
        number.setValue("");
    }

    public void onPlusClick() throws Exception{
        operator.setValue("+");
        setNumOne(Double.parseDouble(number.getValue()));
        number.setValue("");
    }

    public void onDotClick() {
        number.setValue(number.getValue() + ".");
    }

    public void onEqualsClick() throws Exception{
        setNumTwo(Double.parseDouble(number.getValue()));
        history.setValue(history.getValue() + numOne + " " + operator.getValue() + " " + numTwo + " = ");

        switch (operator.getValue()) {
            case "%":
                numOne = (numOne * numTwo) / 100;
                break;
            case "/":
                numOne = numOne / numTwo;
                break;
            case "*":
                numOne = numOne * numTwo;
                break;
            case "-":
                numOne = numOne - numTwo;
                break;
            case "+":
                numOne = numOne + numTwo;
                break;
        }

        history.setValue(history.getValue() + numOne + "\n");
        number.setValue(Double.toString(numOne));
    }

    public void onDeleteClick() {
        String str = "";
        String[] array = number.getValue().split("");
        for (int i = 0; i < number.getValue().length() - 1; i++) {
            str += array[i];
        }

        assert (str != null);
        number.setValue(str);
    }

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }
}
