package com.metehanbolat.mirroreffectimagecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.mirroreffectimagecompose.ui.theme.MirrorEffectImageComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MirrorEffectImageComposeTheme {

            }
        }
    }
}
