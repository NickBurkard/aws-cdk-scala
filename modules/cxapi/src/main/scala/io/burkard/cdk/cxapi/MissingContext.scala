package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MissingContext {

  def apply(
    provider: String,
    key: String,
    props: Map[String, _]
  ): software.amazon.awscdk.cxapi.MissingContext =
    (new software.amazon.awscdk.cxapi.MissingContext.Builder)
      .provider(provider)
      .key(key)
      .props(props.asJava)
      .build()
}
