package services

import model.Users

import scala.collection.mutable.ListBuffer


trait BackendServices {

  def addUser(user:Users):Unit
  def fetchData(uname:String):Users


}
 class Service extends BackendServices{
   def addUser(user:Users) = MockDatabase. listOfUsers+=user

   def fetchData(uname:String):Users = {
     val userData =MockDatabase.listOfUsers.filter(_.username==uname)
     userData.head
   }
 }