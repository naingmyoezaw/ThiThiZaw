package lso.naing.thithizaw;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    ImageView iv;
    ImageButton btn1, btn2;
    int current = 0;
    MediaPlayer mp;

    int[] image = {R.drawable.img1, R.drawable.img2,
            R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6,
            R.drawable.img7, R.drawable.img8,
            R.drawable.nmz2, R.drawable.nmz12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mp=new MediaPlayer();
        mp=MediaPlayer.create(ImageActivity.this,R.raw.song5);
        mp.start();
        iv = (ImageView) findViewById(R.id.imageView2);

        btn1 = (ImageButton) findViewById(R.id.imageButton);
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
    }

    public void preClick(View v) {
        current--;
        if (current == 0) {
            btn1.setEnabled(false);
            btn1.setImageResource(R.drawable.prev_unselect);
        }
        if (current == 3) {
            btn2.setEnabled(true);
            btn2.setImageResource(R.drawable.next_select);
        }
        iv.setImageResource(image[current]);
    }

    public void nextClick(View v) {
        current++;
        if (current == 4) {
            btn2.setEnabled(false);
            btn2.setImageResource(R.drawable.next_unselect);
        }
        if (current == 1) {
            btn1.setEnabled(true);
            btn1.setImageResource(R.drawable.prev_select);
        }
        iv.setImageResource(image[current]);
    }

    @Override
    public void onBackPressed() {
        mp.stop();
        super.onBackPressed();
    }
}
