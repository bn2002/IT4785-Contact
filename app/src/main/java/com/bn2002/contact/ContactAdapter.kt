package com.bn2002.contact

import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent

class ContactAdapter(private val mails: ArrayList<ContactModel>): RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {

    class MyViewHolder(val row: View): RecyclerView.ViewHolder(row), View.OnCreateContextMenuListener {
        val tvName = row.findViewById(R.id.text_from) as TextView
        val subSection = row.findViewById(R.id.extendSection) as View
        val tvId = row.findViewById(R.id.tvID) as TextView
        val tvPhone = row.findViewById(R.id.tvPhone) as TextView
        val tvEmail = row.findViewById(R.id.tvEmail) as TextView
        val constraintLayoutName = row.findViewById(R.id.constraintLayoutName) as View
        init {
           row.setOnCreateContextMenuListener(this)
        }
        override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
           menu?.add(0, 1, 1, "SMS")
           menu?.add(0, 2, 2, "Phone")
           menu?.add(0, 3, 3, "Email")
        }

        fun onContextItemSelected(item: MenuItem): Boolean {
            return when (item.itemId) {
                R.id.call ->{

                    return true
                }
                R.id.sms ->{

                    return true
                }
                R.id.mail ->{

                    return true
                }
                else -> return true
            }
        }


    }


    override fun getItemCount(): Int {
        return mails.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.mail_list_item, parent, false)

        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val mail = mails[position]
        holder.tvName.text = mail.name
        if(mail.isExpand) {
            holder.itemView.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
            holder.subSection.visibility = View.VISIBLE
        } else {
            holder.itemView.layoutParams.height = 150
            holder.subSection.visibility = View.INVISIBLE
        }
        holder.itemView.forceLayout()
        holder.tvEmail.text = mail.email
        holder.tvPhone.text = mail.phoneNumber
        holder.tvId.text = mail.id.toString()

        holder.itemView.setOnClickListener {
            mail.isExpand = !mail.isExpand
            notifyItemChanged(position)
        }

    }
}