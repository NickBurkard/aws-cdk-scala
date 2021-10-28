package io.burkard.cdk.services.frauddetector

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ModelProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty =
    (new software.amazon.awscdk.services.frauddetector.CfnDetector.ModelProperty.Builder)
      .arn(arn.orNull)
      .build()
}
