package seclass.qc.edu.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TipCalculatorActivity extends AppCompatActivity {

    EditText checkAmountValue, fifteenPercentTipValue, twentyPercentTipValue, twentyFivePercentTipValue;
    EditText partySizevalue, fifteenPercentTotalTipValue, twentyPercentTotalTipValue, twentyFivePercentTipTotalValue;
    Button buttonCompute;

    int checkAmount, partySize, fifteenPercentTip, twentyPercentTip, twentyFivePercenTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        //get all views
        checkAmountValue = findViewById(R.id.checkAmountValue);

    }
}
