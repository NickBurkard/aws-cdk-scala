package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RemoveAttributesProperty {

  def apply(
    name: Option[String] = None,
    attributes: Option[List[String]] = None,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder)
      .name(name.orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .next(next.orNull)
      .build()
}
