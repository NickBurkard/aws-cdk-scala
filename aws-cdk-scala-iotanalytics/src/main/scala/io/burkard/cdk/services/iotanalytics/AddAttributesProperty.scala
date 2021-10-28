package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddAttributesProperty {

  def apply(
    name: Option[String] = None,
    attributes: Option[AnyRef] = None,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder)
      .name(name.orNull)
      .attributes(attributes.orNull)
      .next(next.orNull)
      .build()
}
