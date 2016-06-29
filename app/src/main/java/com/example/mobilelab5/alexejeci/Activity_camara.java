package com.example.mobilelab5.alexejeci;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_camara extends AppCompatActivity {
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_camara);

        photo =(ImageView)findViewById(R.id.camara);
        Button button =(Button)findViewById(R.id.botoncamara);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 0)
        {
            if(data.getExtras() != null){
               Bitmap bitmap =(Bitmap) data.getExtras().get("data");
                photo.setImageBitmap(bitmap);

                Animation photo_animation = AnimationUtils.loadAnimation(Activity_camara.this,R.anim.foto_animation);

                photo.startAnimation(photo_animation);
            }

        }
    }
}
