package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
