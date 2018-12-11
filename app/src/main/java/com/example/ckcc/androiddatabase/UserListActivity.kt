package com.example.ckcc.androiddatabase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.ckcc.androiddatabase.adapter.UserListAdapter
import com.example.ckcc.androiddatabase.model.User
import kotlinx.android.synthetic.main.activity_user_list.*

class UserListActivity : AppCompatActivity() {

    var adapter : UserListAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)


        var userList = ArrayList<User>()

        for (i in 1..15){
            var user = User()
            user.Email = "thavath"+ i +"@gmail.com"
            user.firstName = "thavath" + i
            user.lastName = "rath" + i

            userList?.add(user)
        }
        recyclerUserList.layoutManager = LinearLayoutManager(this)
        adapter = UserListAdapter(userList, this)

        recyclerUserList.adapter = adapter
    }
}
