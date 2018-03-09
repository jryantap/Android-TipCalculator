package seclass.qc.edu.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TipCalculatorActivity extends AppCompatActivity {

    EditText checkAmountValue, fifteenPercentTipValue, twentyPercentTipValue, twentyFivePercentTipValue;
    EditText partySizeValue, fifteenPercentTotalTipValue, twentyPercentTotalTipValue, twentyFivePercentTipTotalValue;
    Button buttonCompute;

    int checkAmount, partySize, fifteenPercentTip, twentyPercentTip, twentyFivePercenTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        //get all views
        checkAmountValue = findViewById(R.id.checkAmountValue);
        partySizeValue = findViewById(R.id.partySizeValue);
        buttonCompute = findViewById(R.id.buttonCompute);
        //tip values
        fifteenPercentTipValue = findViewById(R.id.fifteenPercentTipValue);
        twentyPercentTipValue = findViewById(R.id.twentyPercentTipValue);
        twentyFivePercentTipValue = findViewById(R.id.twentyFivePercentTipValue);
        //total values
        fifteenPercentTotalTipValue = findViewById(R.id.fifteenPercentTotalValue);
        twentyPercentTotalTipValue = findViewById(R.id.twentyPercentTotalValue);

        buttonCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = checkAmountValue.getText().toString();
                String party = partySizeValue.getText().toString();

                
            }
        });



    }
}
