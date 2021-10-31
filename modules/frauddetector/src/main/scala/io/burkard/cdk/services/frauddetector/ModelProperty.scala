package io.burkard.cdk.services.frauddetector

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty =
    (new software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.Builder)
      .arn(arn.orNull)
      .build()
}
