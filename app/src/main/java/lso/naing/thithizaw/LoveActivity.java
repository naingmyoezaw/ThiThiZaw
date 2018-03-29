package lso.naing.thithizaw;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class LoveActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn=(Button)findViewById(R.id.btnview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder alert=new AlertDialog.Builder(LoveActivity.this);
                alert.setTitle("Love GirlFriend");
                final View view1 = LayoutInflater.from(LoveActivity.this).inflate(R.layout.custom_dialog, null);
                alert.setPositiveButton("ထြက္မည္", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alert.setView(view1);
                alert.show();

            }
        });
    }
}
