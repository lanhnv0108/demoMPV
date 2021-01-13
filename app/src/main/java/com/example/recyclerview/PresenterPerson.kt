package com.example.recyclerview

import com.example.recyclerview.model.Person

class PresenterPerson constructor(private var view: InterfacePerson.View?) :
    InterfacePerson.Presenter {
    override fun getData() {
        val person = Person("Nguyễn Văn", "Lành")
        view?.setData(person)
    }
}