package com.ubaya.adv160420067week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.ubaya.adv160420067week2.GameFragmentDirections.Companion.actionMainFragment
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_main.*

class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnName.setOnClickListener {
            val playerName = txtName.text.toString()
            val action = GameFragmentDirections.actionMainFragment(playerName)
            Navigation.findNavController(it).navigate(action)
        }
        btnOption.setOnClickListener {
            val action = GameFragmentDirections.actionOptionFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }
}