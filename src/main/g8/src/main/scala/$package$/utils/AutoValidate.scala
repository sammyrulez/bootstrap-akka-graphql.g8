package $package$.utils
import java.util

import scala.collection.JavaConverters._

class AutoValidate extends Authentication {
  override  def validateToken(token:String):Map[String,AnyRef] = Map("token" -> token, "autoValidation" -> "true")

}
