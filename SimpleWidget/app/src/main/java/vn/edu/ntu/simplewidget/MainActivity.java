package vn.edu.ntu.simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ten, ngaysinh,sothichkhac;
    RadioGroup radioGroup;
    Button xn;
    CheckBox film, nhac,cafe,athome,cooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ten = (EditText) findViewById(R.id.name);
        ngaysinh = (EditText) findViewById(R.id.birthday);
        sothichkhac = (EditText) findViewById(R.id.favourite);

        film = (CheckBox) findViewById(R.id.xemphim);
        nhac = (CheckBox) findViewById(R.id.nghenhac);
        cafe = (CheckBox) findViewById(R.id.cf);
        athome = (CheckBox) findViewById(R.id.onha);
        cooking = (CheckBox) findViewById(R.id.nauan);

        xn = (Button) findViewById(R.id.XacNhan);
        radioGroup = (RadioGroup)  findViewById(R.id.radioGroup);

        xn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noichuoi ="";
                noichuoi += "Tên của bạn: "+ten.getText().toString();
                noichuoi += "\nNgày sinh của bạn: "+ngaysinh.getText().toString();

                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.name : noichuoi +="\nGiới tính là nam"; break;
                    case R.id.birthday : noichuoi +="\nGiới tính là nữ"; break;
                }

                noichuoi +="\nSở thích: ";

                if (film.isChecked())
                {
                    noichuoi+= film.getText().toString() +" - ";
                }
                if (nhac.isChecked())
                {
                    noichuoi+= nhac.getText().toString() +" - ";
                }
                if (cafe.isChecked())
                {
                    noichuoi+= cafe.getText().toString() +" - ";
                }
                if (athome.isChecked())
                {
                    noichuoi+= athome.getText().toString() +" - ";
                }
                if (cooking.isChecked())
                {
                    noichuoi+= cooking.getText().toString() +" - ";
                }

                noichuoi+=sothichkhac.getText().toString();

                Toast.makeText(getApplicationContext(),noichuoi,Toast.LENGTH_LONG).show();
            }
        });

    }
}
