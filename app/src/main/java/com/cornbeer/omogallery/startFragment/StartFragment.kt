package com.cornbeer.omogallery.startFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cornbeer.omogallery.R

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val headspaceButton = view.findViewById<Button>(R.id.headspace)
        headspaceButton.setOnClickListener {
             val navhost = findNavController()
            navhost.navigate(R.id.action_startFragment_to_headchoiceFragment)
        }
    }
}