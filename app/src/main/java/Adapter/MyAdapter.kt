package Adapter

import Models.User
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.adaptertakrorlash.R
import kotlinx.android.synthetic.main.item_list.view.*

class MyAdapter(context: Context,var list: List<User>):ArrayAdapter<User>(context, R.layout.item_list,list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View
        if (convertView==null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        }else{
            itemView = convertView
        }
        itemView.txt_name.text = list[position].name
        itemView.txt_password.text = list[position].password
        return itemView
    }
}