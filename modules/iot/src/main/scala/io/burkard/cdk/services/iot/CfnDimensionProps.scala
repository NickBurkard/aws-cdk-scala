package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDimensionProps {

  def apply(
    stringValues: List[String],
    `type`: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iot.CfnDimensionProps =
    (new software.amazon.awscdk.services.iot.CfnDimensionProps.Builder)
      .stringValues(stringValues.asJava)
      .`type`(`type`)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
