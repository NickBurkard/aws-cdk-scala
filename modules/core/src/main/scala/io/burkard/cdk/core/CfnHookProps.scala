package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnHookProps {

  def apply(
    properties: Option[Map[String, _]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.CfnHookProps =
    (new software.amazon.awscdk.CfnHookProps.Builder)
      .properties(properties.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
