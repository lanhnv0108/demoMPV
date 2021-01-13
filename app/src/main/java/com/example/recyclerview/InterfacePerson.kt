package com.example.recyclerview

import com.example.recyclerview.model.Person

interface InterfacePerson {
    // Interface for View
    interface View{
        fun setData(person : Person)
    }
    // Interface for Presenter
    interface Presenter{
        fun getData()
    }
}