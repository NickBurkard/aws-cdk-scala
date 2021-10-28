package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

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
