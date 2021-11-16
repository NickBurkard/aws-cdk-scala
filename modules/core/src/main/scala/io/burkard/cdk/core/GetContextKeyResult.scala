package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GetContextKeyResult {

  def apply(
    key: String,
    props: Map[String, _]
  ): software.amazon.awscdk.GetContextKeyResult =
    (new software.amazon.awscdk.GetContextKeyResult.Builder)
      .key(key)
      .props(props.asJava)
      .build()
}
