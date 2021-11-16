package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHookProps {

  def apply(
    `type`: String,
    properties: Option[Map[String, _]] = None
  ): software.amazon.awscdk.CfnHookProps =
    (new software.amazon.awscdk.CfnHookProps.Builder)
      .`type`(`type`)
      .properties(properties.map(_.asJava).orNull)
      .build()
}
