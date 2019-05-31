package example

import org.bitcoins.rpc.serializers.JsonSerializers

object Hello extends App {
  println(JsonSerializers)
  println(JsonSerializers.addressInfoResultReads)
}
