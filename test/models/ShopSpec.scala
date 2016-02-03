import org.specs2.mutable.Specification
import models._

class ShopSpec extends Specification{
  "A Shop" should {
    "add items" in {
      Shop.create("Play ", 42) must
        beSome[Item].which{
          item => item.name == "Play " && item.price == 42
        }
    }
  }
}
