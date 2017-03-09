package services


import javax.inject.Inject

import model.Users
import play.api.cache.CacheApi

import scala.collection.mutable.ListBuffer

trait WorkingWithCache {

  def setValueInCache(key: String, value: Users): Boolean

  def fetchDataFromCache(key: String): Option[Users]

  def removeFromCache(key: String): Boolean

  def fetchedData(data: Option[Users]): Users

  def dataToManage(): List[Users]

  //def userAlreadyExist():Boolean
}


class CacheHandling @Inject()(cache: CacheApi) extends WorkingWithCache {

  override def setValueInCache(key: String, value: Users) = {
    MockDatabase.listOfKeys += key
    cache.set(value.username, value)
    true
  }

  override def fetchDataFromCache(key: String) = {
    cache.get(key)
  }

  override def removeFromCache(key: String) = {
    cache.remove(key)
    true
  }

  override def fetchedData(data: Option[Users]) = {
    val finalData = data match {
      case Some(data) => data
      case _ => throw new Exception("go to home page and register yourself first")
    }
    finalData
  }

  override def dataToManage() = {

    val data: ListBuffer[Option[Users]] = for {element <- MockDatabase.listOfKeys.distinct} yield cache.get(element)
    val finalData = data.toList.map(each => each match {
      case Some(data) => data
      case _ => throw new Exception("not register yet go to home page")
    })
    finalData
  }

//  override def userAlreadyExist() = {
//
//  }
}
