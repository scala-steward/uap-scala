package org.uaparser.scala

import java.io.InputStream

class CachingParserSpec extends ParserSpecBase {
  val parser: CachingParser = CachingParser.default()
  def createFromStream(stream: InputStream): UserAgentStringParser = CachingParser.fromInputStream(stream).get
}
