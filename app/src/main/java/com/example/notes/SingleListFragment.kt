package com.example.notes

import android.R
import android.os.Bundle
import android.support.v4.app.ListFragment
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment


class SingleListFragment : ListFragment() {
    // определяем массив типа String
    val catNames = arrayOf<String?>(
        "Рыжик", "Барсик", "Мурзик",
        "Мурка", "Васька", "Томасина", "Кристина", "Пушок", "Дымка",
        "Кузя", "Китти", "Масяня", "Симба"
    )

    fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter: ListAdapter = ArrayAdapter<Any?>(
            getActivity(),
            R.layout.simple_list_item_1, catNames
        )
        setListAdapter(adapter)
    }
}