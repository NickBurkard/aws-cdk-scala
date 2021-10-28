package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MathProperty {

  def apply(
    name: Option[String] = None,
    math: Option[String] = None,
    next: Option[String] = None,
    attribute: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder)
      .name(name.orNull)
      .math(math.orNull)
      .next(next.orNull)
      .attribute(attribute.orNull)
      .build()
}
