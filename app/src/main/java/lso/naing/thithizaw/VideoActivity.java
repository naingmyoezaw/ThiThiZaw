package lso.naing.thithizaw;

import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    int charlength=0;
    TextView textV;

    String test="ဆရာမေလး\n\n\n"+


            "အကေလးေတြက ဘယ္လိုေလးေတာင္\n\n"+

    "လွေနတာလညး္ ဆရာမေလးရယ္\n\n"+

            "ကတာေလးေတြ အရမ္းလွတယ္ေနာ္";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        VideoView vd=(VideoView)findViewById(R.id.videoview);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.vdo;
        vd.setVideoURI(Uri.parse(path));
        MediaController mc = new MediaController(this);
        vd.setMediaController(mc);
        vd.requestFocus();



        textV = (TextView)findViewById(R.id.textview);
        textV.setTextSize(18);
        AnimateText(test);
    }

    private void AnimateText(final CharSequence text)
    {
        if(charlength<text.length()){
            charlength+=1;
            CharSequence mtext=text.subSequence(0, charlength);
            textV.setText(mtext);
        }
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run()
            {
                AnimateText(text);
            }

        },150);

    }
}

