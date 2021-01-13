package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.AdapterRecyclerView
import com.example.recyclerview.model.Model
import com.example.recyclerview.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), InterfacePerson.View {
    // Declaration for Presenter
    private lateinit var mAdapter: AdapterRecyclerView
    private lateinit var mPresenter: PresenterPerson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = PresenterPerson(this)
        setAdapter()
        button.setOnClickListener {
            mPresenter.getData()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun setData(person: Person) {
        txt.text = person.lastName + person.firstName
    }

    private fun setAdapter() {
        val mList = arrayListOf<Person>()
        with(mList) {
            add(Person("1", "2"))
            add(Person("1", "2"))
            add(Person("1", "2"))
            add(Person("1", "2"))
            add(Person("1", "2"))
            add(Person("1", "2"))
        }
        val mList2 = arrayListOf<Model>()
        with(mList2) {
            add(Model("1" , "2" , R.drawable.ic_launcher_background))
            add(Model("3" , "2" , R.drawable.ic_launcher_background))
            add(Model("1" , "2" , R.drawable.ic_launcher_background))
            add(Model("4" , "2" , R.drawable.ic_launcher_background))
            add(Model("1" , "2" , R.drawable.ic_launcher_background))
            add(Model("6" , "2" , R.drawable.ic_launcher_background))
        }
//        mAdapter = AdapterRecyclerView(mList)
        mAdapter = AdapterRecyclerView(mList2 , this)
        rcv.adapter = mAdapter
        rcv.layoutManager = LinearLayoutManager(this)
    }
}
