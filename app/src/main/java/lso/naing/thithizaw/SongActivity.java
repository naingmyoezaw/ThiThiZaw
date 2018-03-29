package lso.naing.thithizaw;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class SongActivity extends AppCompatActivity implements android.widget.MediaController.MediaPlayerControl
{

    int[] songs=new int[15];
    int[] images=new int[15];
    int currentsong=0;
    MediaPlayer mp;
    boolean continuous=true;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    ImageView iv;
    android.widget.MediaController mc;
    String status="Stopped";
    boolean indisplaymode=false;

    private String[] songname={"တဖတ္သတ္",
            "ႏွင္း",
            "ခ်စ္ရတဲ့သူ",
            "ရူးေနသလိုပါ",
            "သို့",
            "နင္ရွိမွျပည့္စံုမွာ",
            "ဒီကျဖစ္ခ်စ္လိုက္ရတာ",
            "ၾကင္နာခြင့္မရွိတဲ့ခ်စ္သူ",
            "သူငယ္ခ်င္းထက္ပိုေသာ",
            "အခ်စ္နယ္ကြ်ံ",
            "လမ္းမခြဲပါနဲ့",
            "ငါ့ေနရာ",
            "ရပါတယ္ထြက္သြားပါ",
            "လိမ္လိမ္မာမာေန",
            "အိမ္မျပန္ေတာ့ဘူးလား"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);



        mp=new MediaPlayer();
        updateTitle();

        songs[0] = R.raw.song1;
        songs[1] = R.raw.song2;
        songs[2] = R.raw.song3;
        songs[3] = R.raw.song4;
        songs[4] = R.raw.song5;
        songs[5] = R.raw.song6;
        songs[6] = R.raw.song7;
        songs[7] = R.raw.song8;
        songs[8] = R.raw.song9;
        songs[9] = R.raw.song10;
        songs[10] = R.raw.song11;
        songs[11] = R.raw.song12;
        songs[12] = R.raw.song13;
        songs[13] = R.raw.song14;
        songs[14] = R.raw.song15;


        images[0] = R.drawable.nmz1;
        images[1] = R.drawable.nmz2;
        images[2] = R.drawable.nmz3;
        images[3] = R.drawable.nmz4;
        images[4] = R.drawable.nmz5;
        images[5] = R.drawable.nmz6;
        images[6] = R.drawable.nmz7;
        images[7] = R.drawable.nmz8;
        images[8] = R.drawable.nmz9;
        images[9] = R.drawable.nmz10;
        images[10] = R.drawable.nmz11;
        images[11] = R.drawable.nmz12;
        images[12] = R.drawable.nmz13;
        images[13] = R.drawable.nmz14;
        images[14] = R.drawable.nmz15;

        btn1 = (Button) findViewById(R.id.song1);
        btn2 = (Button) findViewById(R.id.song2);
        btn3 = (Button)findViewById(R.id.song3);
        btn4 = (Button) findViewById(R.id.song4);
        btn5 = (Button) findViewById(R.id.song5);
        btn6 = (Button)findViewById(R.id.song6);
        btn7 = (Button) findViewById(R.id.song7);
        btn8 = (Button)findViewById(R.id.song8);
        btn9 = (Button) findViewById(R.id.song9);
        btn10 = (Button)findViewById(R.id.song10);
        btn11 = (Button)findViewById(R.id.song11);
        btn12 = (Button) findViewById(R.id.song12);
        btn13 = (Button)findViewById(R.id.song13);
        btn14 = (Button) findViewById(R.id.song14);
        btn15= (Button)findViewById(R.id.song15);

        mc=new android.widget.MediaController(this);
        mc.setEnabled(true);
        mc.setMediaPlayer(this);

    }

    public void Display(int index){
        setContentView(R.layout.musicdisplay);
        indisplaymode=true;
        iv=(ImageView)findViewById(R.id.img_view);
        iv.setBackgroundResource(images[index]);
        iv.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View v,MotionEvent me){
                mc.show(10000);
                return true;
            }
        });

        mp.reset();
        mp=MediaPlayer.create(this,songs[index]);
        setController();
        ListenToCompletion(mp);

        mp.start();
        mc.show(10000);
        status="Playing";
    }

    public void SongClick(View v){
        switch(v.getId()){
            case R.id.song1:
                mp.stop();
                currentsong=0;
                Display(currentsong);
                break;

            case R.id.song2:
                mp.stop();
                currentsong=1;
                Display(currentsong);
                break;

            case R.id.song3:
                mp.stop();
                currentsong=2;
                Display(currentsong);
                break;

            case R.id.song4:
                mp.stop();
                currentsong=3;
                Display(currentsong);
                break;

            case R.id.song5:
                mp.stop();
                currentsong=4;
                Display(currentsong);
                break;

            case R.id.song6:
                mp.stop();
                currentsong=5;
                Display(currentsong);
                break;

            case R.id.song7:
                mp.stop();
                currentsong=6;
                Display(currentsong);
                break;

            case R.id.song8:
                mp.stop();
                currentsong=7;
                Display(currentsong);
                break;

            case R.id.song9:
                mp.stop();
                currentsong=8;
                Display(currentsong);
                break;

            case R.id.song10:
                mp.stop();
                currentsong=9;
                Display(currentsong);
                break;

            case R.id.song11:
                mp.stop();
                currentsong=10;
                Display(currentsong);
                break;

            case R.id.song12:
                mp.stop();
                currentsong=11;
                Display(currentsong);
                break;

            case R.id.song13:
                mp.stop();
                currentsong=12;
                Display(currentsong);
                break;

            case R.id.song14:
                mp.stop();
                currentsong=13;
                Display(currentsong);
                break;

            case R.id.song15:
                mp.stop();
                currentsong=14;
                Display(currentsong);
                break;

        }
        updateTitle();
    }

    private void updateTitle() {
        getSupportActionBar().setTitle(songname[currentsong]);
    }


    @Override
    public void onBackPressed() {
        mp.stop();
        status="Stopped";
        if(indisplaymode){
            indisplaymode=false;
            setContentView(R.layout.activity_song);
        }else{
            finish();
        }
    }

    @Override
    public void start() {
        if(status=="Stopped"){
            mp=MediaPlayer.create(this,songs[currentsong]);
            setController();
        }
        mp.start();
        status="Playing";
    }

    @Override
    public void pause() {
        if(status=="Playing"){
            mp.pause();
            status="Paused";
        }
    }

    @Override
    public int getDuration() {
        return mp.getDuration();
    }
    @Override
    public int getCurrentPosition() {
        return mp.getCurrentPosition();
    }
    @Override
    public void seekTo(int i) {
        mp.seekTo(i);
    }
    @Override
    public boolean isPlaying() {
        return mp.isPlaying();
    }
    @Override
    public int getBufferPercentage() {
        return 0;
    }
    @Override
    public boolean canPause() {
        return true;
    }
    @Override
    public boolean canSeekBackward() {

        return true;
    }
    @Override
    public boolean canSeekForward() {

        return true;
    }

    @Override
    public int getAudioSessionId()
    {
        return mp.getAudioSessionId();
    }

    public void playNext(){
        currentsong+=1;
        if(currentsong==15)
            currentsong=0;
        Display(currentsong);

        updateTitle();
    }

    public void playPrevious(){
        currentsong-=1;
        if(currentsong==-1)
            currentsong=14;
        Display(currentsong);

        updateTitle();

    }


    private void setController(){
        mc = new android.widget.MediaController(this);

        mc.setPrevNextListeners(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNext();
            }
        }, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPrevious();
            }
        });


        mc.setMediaPlayer(this);
        mc.setAnchorView(iv);
        mc.setEnabled(true);
    }


    public void ListenToCompletion(MediaPlayer mp){
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                if(continuous){
                    currentsong++;
                    if (currentsong==15){
                        currentsong=0;
                    }
                    updateTitle();
                    Display(currentsong);
                }
            }
        });
    }
}