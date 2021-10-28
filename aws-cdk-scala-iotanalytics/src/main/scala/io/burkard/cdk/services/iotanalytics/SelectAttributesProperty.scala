package io.burkard.cdk.services.iotanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SelectAttributesProperty {

  def apply(
    name: Option[String] = None,
    attributes: Option[List[String]] = None,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder)
      .name(name.orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .next(next.orNull)
      .build()
}
