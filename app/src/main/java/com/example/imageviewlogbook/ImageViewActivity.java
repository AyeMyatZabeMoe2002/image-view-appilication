package com.example.imageviewlogbook;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class ImageViewActivity extends AppCompatActivity {
    ImageView imgView;
    Button btnForward,btnBackward;
    int[] images ={R.drawable.ic_launcher_background,
                   R.drawable.ic_launcher_foreground,
                   android.R.drawable.arrow_down_float,
                   android.R.drawable.arrow_up_float,
                   android.R.drawable.btn_plus,
                   android.R.drawable.ic_lock_lock,
                   R.drawable.cat,
                   R.drawable.cat2,
                   R.drawable.cat3,
                   R.drawable.cat4,
                   R.drawable.cat5};

    int index =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imgView     = findViewById(R.id.imgView);
        btnForward  = findViewById(R.id.btnForward);
        btnBackward = findViewById(R.id.btnBackward);
        imgView.setImageResource(images[index]);

        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index ++;//index --;
                if(index== images.length) index=0;
                imgView.setImageResource(images[index]);
            }
        });

        btnBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index--;
                if(index==-1)index = images.length-1;
                imgView.setImageResource(images[index]);

            }
        });

    }
}