package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceProps {

  def apply(
    properties: Option[Map[String, _]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.CfnResourceProps =
    (new software.amazon.awscdk.CfnResourceProps.Builder)
      .properties(properties.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
