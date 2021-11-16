package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHook {

  def apply(
    internalResourceId: String,
    `type`: String,
    properties: Option[Map[String, _]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnHook =
    software.amazon.awscdk.CfnHook.Builder
      .create(stackCtx, internalResourceId)
      .`type`(`type`)
      .properties(properties.map(_.asJava).orNull)
      .build()
}
