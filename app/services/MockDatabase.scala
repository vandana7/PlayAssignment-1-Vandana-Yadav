package services

import model.Users

import scala.collection.mutable.ListBuffer


object MockDatabase {

  val listOfUsers=ListBuffer[Users]()+=Users(
    "vandana","","Yadav","vandy","vandy123","vandy123","9891272119","female",24,"reading")

}
