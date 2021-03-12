package com.example.submisisionandroidpemula

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class OnClickActivity: AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    //private lateinit var textView2: TextView
    //private lateinit var textView3 : TextView
    private lateinit var textView4 : TextView

    companion object{
        const val EXTRA_IMAGES = "extra_images"
        const val EXTRA_NAMA = "extra_nama"
        //const val EXTRA_GENRE = "extra_genre"
        //const val EXTRA_ACTIVE = "extra_active"
        const val EXTRA_DESC = "extra_desc"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onclick)

        imageView = findViewById(R.id.img_singer)
        textView = findViewById(R.id.tv_singer)
        //textView2 = findViewById(R.id.tv_genre)
        //textView3 = findViewById(R.id.tv_active)
        textView4 = findViewById(R.id.tv_description)

        Picasso.get().load(intent.getStringExtra(EXTRA_IMAGES)).into(imageView)
        textView.setText(intent.getStringExtra(EXTRA_NAMA))
        //textView2.setText(intent.getStringExtra(EXTRA_GENRE))
        //textView3.setText(intent.getStringExtra(EXTRA_ACTIVE))
        textView4.setText(intent.getStringExtra(EXTRA_DESC))
    }
}