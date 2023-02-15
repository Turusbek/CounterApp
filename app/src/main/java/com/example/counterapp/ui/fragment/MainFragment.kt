package com.example.counterapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.counterapp.App
import com.example.counterapp.databinding.FragmentMainBinding
import com.example.counterapp.model.CounterModel
import com.example.counterapp.viewmodel.CounterViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var num = 0
    private val viewModel: CounterViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPlus.setOnClickListener {
            num++
            viewModel.increment(num)
            App.db.historyDao().insertToHistory(CounterModel(count = "[$num] : +"))
        }
        binding.btnMinus.setOnClickListener {
            num--
            viewModel.increment(num)
            App.db.historyDao().insertToHistory(CounterModel(count = "[$num] : -"))
        }

    }

}

