package services

import model.Users


object AddUser {

  def addUser(user:Users) = MockDatabase. listOfUsers+=user


}
