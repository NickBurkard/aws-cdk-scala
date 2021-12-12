package io.burkard.cdk.core.assertions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MatchFailure {

  def apply(
    path: List[String],
    matcher: software.amazon.awscdk.assertions.Matcher,
    message: String
  ): software.amazon.awscdk.assertions.MatchFailure =
    (new software.amazon.awscdk.assertions.MatchFailure.Builder)
      .path(path.asJava)
      .matcher(matcher)
      .message(message)
      .build()
}
