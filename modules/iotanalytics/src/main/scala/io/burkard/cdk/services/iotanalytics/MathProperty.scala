package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MathProperty {

  def apply(
    name: String,
    math: String,
    attribute: String,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder)
      .name(name)
      .math(math)
      .attribute(attribute)
      .next(next.orNull)
      .build()
}
