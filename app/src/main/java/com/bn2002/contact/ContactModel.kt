package com.bn2002.contact

data class ContactModel(var id: Int, var name: String, var phoneNumber: String, var email: String, var isExpand: Boolean = false) {
}