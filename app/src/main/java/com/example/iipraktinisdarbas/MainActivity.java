package com.example.iipraktinisdarbas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.iipraktinisdarbas.utils.ElementsCalculator.getCharsCount;

import com.example.iipraktinisdarbas.utils.ElementsCalculator;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;
    EditText edUserInput;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvOutput = findViewById(R.id.tvOutput);

        ArrayList<String> selectionOptionsList = new ArrayList<>();
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.spinner_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {

        String userInputText = edUserInput.getText().toString();
        String selection = this.ddSelection.getSelectedItem().toString();
        int resId = R.string.char_selection;

        Toast.makeText(this,String.valueOf(resId), Toast.LENGTH_SHORT).show();

        String resValue = getResources().getString(R.string.char_selection);
        Toast.makeText(this,String.valueOf(resValue), Toast.LENGTH_SHORT).show();

        if (selection.equalsIgnoreCase(getResources().getString(R.string.char_selection))) {
            int count = ElementsCalculator.getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
        if (selection.equalsIgnoreCase(getResources().getString(R.string.numbers_selection))) {
            tvOutput.setText(String.valueOf(ElementsCalculator.getNumbersCount(userInputText)));
        }
        if (selection.equalsIgnoreCase(getResources().getString(R.string.words_selection))) {
            int count = ElementsCalculator.getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(ElementsCalculator.getWordsCount(userInputText)));
        }
    }
}