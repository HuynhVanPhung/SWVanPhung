package vn.edu.ntu.phung.swvanphung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText edtTen = findViewById(R.id.edtTen), edtNS;
    Button btnXN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
    }

    private void addViews()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNS = findViewById(R.id.edtNS);
        btnXN = findViewById(R.id.btnXN);

    }


}
