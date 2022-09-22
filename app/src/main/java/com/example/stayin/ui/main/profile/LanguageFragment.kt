package com.example.stayin.ui.main.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stayin.R
import com.example.stayin.data.models.Language
import com.example.stayin.data.models.Notification
import com.example.stayin.databinding.FragmentLanguageBinding
import com.example.stayin.databinding.FragmentNotificationsBinding
import com.example.stayin.ui.main.adapters.LanguageAdapter
import com.example.stayin.ui.main.adapters.NotificationAdapter


class LanguageFragment : Fragment(R.layout.fragment_language) {
    private lateinit var binding: FragmentLanguageBinding
    private val languageList =
        listOf(
            Language(R.color.darkOrangeLang,"English"),
            Language(R.color.mediumBlueLang,"French"),
            Language(R.color.blueLang,"Hindi"),
            Language(R.color.orangeLang,"German"),
            Language(R.color.greenLang,"Spanish"),
            Language(R.color.redLang,"Arabic"),
            Language(R.color.purpleLang,"Italian"),
            Language(R.color.darkBlueLang,"Chinese")
        )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLanguageBinding.bind(view)

        setLanguage()

    }

    private fun setLanguage() {
        binding.rvLanguage.adapter = LanguageAdapter(languageList)
        binding.rvLanguage.layoutManager = GridLayoutManager(requireContext(),2)
    }

}