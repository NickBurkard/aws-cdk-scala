package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MachineLearningDetectionConfigProperty {

  def apply(
    confidenceLevel: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty.Builder)
      .confidenceLevel(confidenceLevel.orNull)
      .build()
}
