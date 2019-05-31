package example

import org.bitcoins.rpc.serializers.JsonSerializers
import org.bitcoins.rpc.serializers.JsonSerializers._
import play.api.libs.json._
import org.bitcoins.core.protocol.BitcoinAddress

object Hello extends App {
  println(JsonSerializers)
  println(JsonSerializers.addressInfoResultReads)
  println(
    JsString("3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy").validate[BitcoinAddress]
  )
}
