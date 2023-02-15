package com.example.counterapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.counterapp.databinding.ItemListBinding
import com.example.counterapp.model.CounterModel

class HistoryAdapter :
    ListAdapter<CounterModel, HistoryAdapter.HistoryViewHolder>(CountDiffCallBack()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }


    class HistoryViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(countModel: CounterModel) {
            binding.tvHistory.text = countModel.count
        }

    }

    private class CountDiffCallBack : DiffUtil.ItemCallback<CounterModel>() {
        override fun areItemsTheSame(oldItem: CounterModel, newItem: CounterModel): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: CounterModel, newItem: CounterModel): Boolean =
            oldItem == newItem
    }

}