package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDimensionProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    stringValues: Option[List[String]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnDimensionProps =
    (new software.amazon.awscdk.services.iot.CfnDimensionProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .stringValues(stringValues.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
