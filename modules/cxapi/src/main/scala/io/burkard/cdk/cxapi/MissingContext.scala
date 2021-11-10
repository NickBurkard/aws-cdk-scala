package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MissingContext {

  def apply(
    provider: Option[String] = None,
    key: Option[String] = None,
    props: Option[Map[String, _]] = None
  ): software.amazon.awscdk.cxapi.MissingContext =
    (new software.amazon.awscdk.cxapi.MissingContext.Builder)
      .provider(provider.orNull)
      .key(key.orNull)
      .props(props.map(_.asJava).orNull)
      .build()
}
