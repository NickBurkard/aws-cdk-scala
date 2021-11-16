package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RemoveAttributesProperty {

  def apply(
    name: String,
    attributes: List[String],
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder)
      .name(name)
      .attributes(attributes.asJava)
      .next(next.orNull)
      .build()
}
