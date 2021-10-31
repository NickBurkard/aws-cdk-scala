package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResource {

  def apply(
    internalResourceId: String,
    properties: Option[Map[String, _]] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnResource =
    software.amazon.awscdk.CfnResource.Builder
      .create(stackCtx, internalResourceId)
      .properties(properties.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
