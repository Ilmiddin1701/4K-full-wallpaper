package com.example.a4kfullwallpaper.Fragments

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.example.a4kfullwallpaper.databinding.FragmentPhotoViewBinding
import com.example.a4kfullwallpaper.utils.obj

class PhotoViewFragment : Fragment() {
    private val binding by lazy { FragmentPhotoViewBinding.inflate(layoutInflater) }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val p = arguments?.getInt("keyPosition")
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().popBackStack()
            }
            when (obj.c) {
                1 -> {
                    imgView.setImageResource(obj.rvList1[p!!].image)
                }
                2 -> {
                    imgView.setImageResource(obj.rvList2[p!!].image)
                }
                3 -> {
                    imgView.setImageResource(obj.rvList3[p!!].image)
                }
                4 -> {
                    imgView.setImageResource(obj.rvList4[p!!].image)
                }
            }
        }

        return binding.root
    }
}