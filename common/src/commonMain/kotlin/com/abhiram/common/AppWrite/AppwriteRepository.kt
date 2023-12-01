package com.abhiram.common.AppWrite

import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.services.Databases
import io.appwrite.services.Users

class AppwriteRepository {
    var client : Client
    lateinit var id : String

    init {
        var creds = AppwriteCreds()
        client = Client(creds.getEndpoint())
            .setKey(creds.getKey())
            .setProject(creds.getProject())
            .setSelfSigned(true)

    }
    suspend fun signIn(mail : String){
        val users = Users(this.client)
        id = ID.unique()
        val user = users.create(
            userId = id,
            email = mail,
            password = "qwerty123"
        )
    }

    suspend fun get(){
        val db = Databases(this.client)
        val response = db.create(id,id)
    }


}