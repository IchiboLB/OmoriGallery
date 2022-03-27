package com.cornbeer.omogallery.headchoiceFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cornbeer.omogallery.R

class HeadchoiceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_firsthead, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aubreyButton = view.findViewById<Button>(R.id.aubrey)
        aubreyButton.setOnClickListener {
            val navhost = findNavController()
            navhost.navigate(R.id.action_headchoiceFragment_to_aubreyFragment)
        }
    }
}