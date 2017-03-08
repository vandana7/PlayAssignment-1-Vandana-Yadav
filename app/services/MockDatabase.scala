package services

import model.{LoginAccounts, Users}

import scala.collection.mutable.ListBuffer


object MockDatabase {

  val listOfUsers = ListBuffer[Users]()+=Users(
    "vandana","","Yadav","vandy","vandy123","vandy123","9891272119","female",24,"reading")


  val listOfAccountHolders = ListBuffer[LoginAccounts]() += LoginAccounts(
    "vandy","vandy123")
}

