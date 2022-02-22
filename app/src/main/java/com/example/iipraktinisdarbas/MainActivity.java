package com.example.iipraktinisdarbas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.iipraktinisdarbas.utils.ElementsCalculator.getCharsCount;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;
    EditText edUserInput;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        ArrayList<String> selectionOptionList = new ArrayList<>();
        selectionOptionList.add("Words");
        selectionOptionList.add("Chart");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, selectionOptionList);
        // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.array.selection_options, android.R.layout.single_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateonClick (View view) {
        EditText edUserInput = this.findViewById(R.id.edUserInput);
        TextView tvOutput = findViewById(R.id.tvOutput);
        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();
        if (selection.equalsIgnoreCase("Charts")) {
            int count = getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
    }

}