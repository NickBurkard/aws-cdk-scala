package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GetContextKeyOptions {

  def apply(
    provider: Option[String] = None,
    props: Option[Map[String, _]] = None
  ): software.amazon.awscdk.GetContextKeyOptions =
    (new software.amazon.awscdk.GetContextKeyOptions.Builder)
      .provider(provider.orNull)
      .props(props.map(_.asJava).orNull)
      .build()
}
