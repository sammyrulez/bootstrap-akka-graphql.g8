package $package$.utils;

import java.util.Map;

trait Authentication {
    Map[String, AnyRef] validateToken(String token);
}
