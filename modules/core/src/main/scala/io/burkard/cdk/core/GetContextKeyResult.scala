package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GetContextKeyResult {

  def apply(
    key: Option[String] = None,
    props: Option[Map[String, _]] = None
  ): software.amazon.awscdk.GetContextKeyResult =
    (new software.amazon.awscdk.GetContextKeyResult.Builder)
      .key(key.orNull)
      .props(props.map(_.asJava).orNull)
      .build()
}
