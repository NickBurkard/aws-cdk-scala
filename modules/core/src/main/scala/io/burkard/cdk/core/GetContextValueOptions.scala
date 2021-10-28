package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GetContextValueOptions {

  def apply(
    provider: Option[String] = None,
    dummyValue: Option[AnyRef] = None,
    props: Option[Map[String, _]] = None
  ): software.amazon.awscdk.GetContextValueOptions =
    (new software.amazon.awscdk.GetContextValueOptions.Builder)
      .provider(provider.orNull)
      .dummyValue(dummyValue.orNull)
      .props(props.map(_.asJava).orNull)
      .build()
}
