package com.example.videoviewapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    private VideoView walkThroughVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //動画をVideoViewにセット
        walkThroughVideoView = (VideoView) findViewById(R.id.walkThroughVideo);
        walkThroughVideoView.setVideoURI(Uri.parse("android.resource://" + this.getPackageName()
        + "/" + R.raw.sample));
        walkThroughVideoView.start();
//        walkThroughVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                finish();
//                Intent intent = new Intent(getApplication(), AfterSkipActivity.class);
//                startActivity(intent);
//            }
//        });
        walkThroughVideoView.setOnCompletionListener(this);
    }

    public void skipVideo(View view){
        finish();
        Intent intent = new Intent(getApplication(), AfterSkipActivity.class);
        startActivity(intent);
    }
    @Override
    public void onCompletion(MediaPlayer mp) {
        finish();
        Intent intent = new Intent(getApplication(), AfterSkipActivity.class);
        startActivity(intent);
    }
}
