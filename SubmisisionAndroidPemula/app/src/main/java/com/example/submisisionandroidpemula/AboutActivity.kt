package com.example.submisisionandroidpemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.squareup.picasso.Picasso

class AboutActivity : AppCompatActivity() {

    /*private lateinit var myPhoto: ImageView

    companion object{
        const val EXTRA_IMAGE = "extra_images"
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme)
        supportActionBar?.title = "About Me"


        /*myPhoto = findViewById(R.id.img_item_photo)
        val photo = intent.getStringExtra(EXTRA_IMAGE)

        //Picasso.get().load(intent.getStringExtra(AboutActivity.EXTRA_IMAGE)).into(myPhoto)
        Glide.with(this@AboutActivity)
            .load(photo)
            .apply(RequestOptions.overrideOf(100, 100))
            .into(myPhoto)*/
    }
}