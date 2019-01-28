package $package$.utils;



trait Authentication {
    def validateToken(token:String): Map[String, AnyRef] ;
  }
