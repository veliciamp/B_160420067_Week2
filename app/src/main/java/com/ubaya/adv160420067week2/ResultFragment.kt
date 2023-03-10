package com.ubaya.adv160420067week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.ubaya.adv160420067week2.ResultFragmentDirections.Companion.actionMainFragment2
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_result.*


class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(arguments != null) {
            val nilai =ResultFragmentArgs.fromBundle(requireArguments()).nilaiAkhir
            txtScore.text = "Your score is $nilai"
        }
        btnBalik.setOnClickListener {
            val action = ResultFragmentDirections.actionMainFragment2()
            Navigation.findNavController(it).navigate(action)
        }
    }

}