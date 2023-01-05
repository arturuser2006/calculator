package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;

import com.example.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    ActivityMainBinding binding;
    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        binding.buttonSeven.setOnClickListener(v -> {
            viewModel.onSevenClick();
        });

        binding.buttonEight.setOnClickListener(v -> {
            viewModel.onEightClick();
        });

        binding.buttonNine.setOnClickListener(v -> {
            viewModel.onNineClick();
        });

        binding.buttonFour.setOnClickListener(v -> {
            viewModel.onFourClick();
        });

        binding.buttonFive.setOnClickListener(v -> {
            viewModel.onFiveClick();
        });

        binding.buttonSix.setOnClickListener(v -> {
            viewModel.onSixClick();
        });

        binding.buttonThree.setOnClickListener(v -> {
            viewModel.onThreeClick();
        });

        binding.buttonTwo.setOnClickListener(v -> {
            viewModel.onTwoClick();
        });

        binding.buttonOne.setOnClickListener(v -> {
            viewModel.onOneClick();
        });

        binding.buttonZero.setOnClickListener(v -> {
            viewModel.onZeroClick();
        });

        binding.buttonClear.setOnClickListener(v -> {
            viewModel.onClearClick();
        });

        binding.buttonDel.setOnClickListener(v -> {
            viewModel.onDeleteClick();
        });

        binding.buttonPercent.setOnClickListener(v -> {
            try {
                viewModel.onPercentClick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        binding.buttonDiv.setOnClickListener(v -> {
            try {
                viewModel.onDivClick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        binding.buttonMul.setOnClickListener(v -> {
            try {
                viewModel.onMulClick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        binding.buttonMinus.setOnClickListener(v -> {
            try {
                viewModel.onMinClick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        binding.buttonPlus.setOnClickListener(v -> {
            try {
                viewModel.onPlusClick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        binding.buttonEquals.setOnClickListener(v -> {
            try {
                viewModel.onEqualsClick();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        binding.buttonDot.setOnClickListener(v -> {
            viewModel.onDotClick();
        });

        setContentView(binding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();

        viewModel.number.observe(this, s -> {
            binding.editText.setText(s);
            binding.textView.setText(viewModel.history.getValue());
        });

        viewModel.operator.observe(this, s -> {

        });
    }
}