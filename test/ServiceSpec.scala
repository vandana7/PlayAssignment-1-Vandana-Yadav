import model.Users
import play.api.cache.CacheApi
import services.CacheHandling
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatestplus.play._

class ServiceSpec extends PlaySpec with OneAppPerTest with MockitoSugar {
  "UserService" should {
    "set data " in {
      val mockcache = mock[CacheApi]
      val customCache = mock[CacheHandling]
      val user = Users("vandana", "", "yadav", "vandy", "vandy123", "vandy123", "9891272119", "female", 11, "reading", true, true)
      val service = new CacheHandling(mockcache)
      customCache.setValueInCache("vandy", user)
      when(mockcache.get[Users]("vandy")) thenReturn Some(user)

    }

    "remove data " in {
      val mockcache = mock[CacheApi]
      val customCache = mock[CacheHandling]
      val user = Users("vandana", "", "yadav", "vandy", "vandy123", "vandy123", "9891272119", "female", 11, "reading", true, true)
      val service = new CacheHandling(mockcache)
      customCache.removeFromCache("vandy")
      when(mockcache.get[Users]("aa")) thenReturn None
    }


//    "fetch data " in {
//      val mockcache = mock[CacheApi]
//      val customCache = mock[CacheHandling]
//      val user = Users("vandana", "", "yadav", "vandy", "vandy123", "vandy123", "9891272119", "female", 11, "reading", true, true)
//      mockcache.set("vandy", user)
//      when(customCache.fetchDataFromCache("vandy")) thenReturn Some(user)
//    }

  }
}
