package com.muna.bottom_sheet

import androidx.appcompat.app.AppCompatActivity
import com.muna.bottom_sheet.SliderFragment.Companion.TAG

public object Slider {

    private val slider: SliderFragment by lazy { SliderFragment() }

    public fun show(activity: AppCompatActivity) {
        slider.show(activity.supportFragmentManager, TAG)
    }
}