package com.bn2002.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var contacts: ArrayList<ContactModel>
    private lateinit var listView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.mail_list_view)
        title = "Contact"
        initData()
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ContactAdapter(contacts)
        listView.setHasFixedSize(true)
    }



    private fun initData() {
        contacts = ArrayList<ContactModel>()
        contacts += ContactModel(id = 1, name = "Nguyễn Duy Doanh", email = "admin@bn2002.com", phoneNumber = "0123456789")
        contacts += ContactModel(id = 2, name = "Phan Thế Anh", email = "theanh@bn2002.com", phoneNumber = "0124956789")
        contacts += ContactModel(id = 3, name = "Lê Thế Anh", email = "letheanh@bn2002.com", phoneNumber = "0933456789")
        contacts += ContactModel(id = 4, name = "Nguyễn Văn Chung", email = "vanchung@bn2002.com", phoneNumber = "0853456789")
        contacts += ContactModel(id = 5, name = "Phan Trung Dũng", email = "trungdung@bn2002.com", phoneNumber = "0633765781")
        contacts += ContactModel(id = 6, name = "Hoàng Minh Dũng", email = "minhdung@bn2002.com", phoneNumber = "0346456289")
        contacts += ContactModel(id = 1, name = "Nguyễn Duy Doanh", email = "admin@bn2002.com", phoneNumber = "0123456789")
        contacts += ContactModel(id = 2, name = "Phan Thế Anh", email = "theanh@bn2002.com", phoneNumber = "0124956789")
        contacts += ContactModel(id = 3, name = "Lê Thế Anh", email = "letheanh@bn2002.com", phoneNumber = "0933456789")
        contacts += ContactModel(id = 4, name = "Nguyễn Văn Chung", email = "vanchung@bn2002.com", phoneNumber = "0853456789")
        contacts += ContactModel(id = 5, name = "Phan Trung Dũng", email = "trungdung@bn2002.com", phoneNumber = "0633765781")
        contacts += ContactModel(id = 6, name = "Hoàng Minh Dũng", email = "minhdung@bn2002.com", phoneNumber = "0346456289")
        contacts += ContactModel(id = 1, name = "Nguyễn Duy Doanh", email = "admin@bn2002.com", phoneNumber = "0123456789")
        contacts += ContactModel(id = 2, name = "Phan Thế Anh", email = "theanh@bn2002.com", phoneNumber = "0124956789")
        contacts += ContactModel(id = 3, name = "Lê Thế Anh", email = "letheanh@bn2002.com", phoneNumber = "0933456789")
        contacts += ContactModel(id = 4, name = "Nguyễn Văn Chung", email = "vanchung@bn2002.com", phoneNumber = "0853456789")
        contacts += ContactModel(id = 5, name = "Phan Trung Dũng", email = "trungdung@bn2002.com", phoneNumber = "0633765781")
        contacts += ContactModel(id = 6, name = "Hoàng Minh Dũng", email = "minhdung@bn2002.com", phoneNumber = "0346456289")
    }
}