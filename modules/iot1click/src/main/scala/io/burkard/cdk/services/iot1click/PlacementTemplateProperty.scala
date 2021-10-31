package io.burkard.cdk.services.iot1click

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PlacementTemplateProperty {

  def apply(
    deviceTemplates: Option[Map[String, _]] = None,
    defaultAttributes: Option[AnyRef] = None
  ): software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty =
    (new software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty.Builder)
      .deviceTemplates(deviceTemplates.map(_.asJava).orNull)
      .defaultAttributes(defaultAttributes.orNull)
      .build()
}
