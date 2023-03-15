package com.ubaya.adv160420067week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(arguments != null) {
            val playerName =
                MainFragmentArgs.fromBundle(requireArguments()).playerName
            txtTurn.text = "$playerName's Turn"
        }

        var nilai=0

        txtPertama.text=(0..20).random().toString()
        txtKedua.text=(0..20).random().toString()


        btnStart.setOnClickListener {
            var hasil= txtPertama.text.toString().toInt()+txtKedua.text.toString().toInt()
            val jawaban = textInput.text.toString()

            if(hasil.toString()==jawaban.toString()){
                nilai+=1
                txtPertama.text=(0..20).random().toString()
                txtKedua.text=(0..20).random().toString()
                textInput.text!!.clear()
            }else{
                val action = MainFragmentDirections.actionResultFragment(nilai)
                Navigation.findNavController(it).navigate(action)
            }




        }

    }


}