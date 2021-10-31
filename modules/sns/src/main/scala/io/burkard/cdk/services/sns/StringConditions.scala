package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StringConditions {

  def apply(
    allowlist: Option[List[String]] = None,
    matchPrefixes: Option[List[String]] = None,
    denylist: Option[List[String]] = None
  ): software.amazon.awscdk.services.sns.StringConditions =
    (new software.amazon.awscdk.services.sns.StringConditions.Builder)
      .allowlist(allowlist.map(_.asJava).orNull)
      .matchPrefixes(matchPrefixes.map(_.asJava).orNull)
      .denylist(denylist.map(_.asJava).orNull)
      .build()
}
