package services

import model.Users

class FetchUserData {

  def fetchData(uname:String):Users = {
    val userData =MockDatabase.listOfUsers.filter(_.username==uname)
    userData.head
  }

}
