package com.muna.bottom_sheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

internal class SliderFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.modal_bottom_sheet_content, container, false)

    override fun getTheme(): Int {
        return R.style.BottomSheetDialogTheme
    }

    internal companion object {
        const val TAG = "ModalBottomSheet"
    }
}

