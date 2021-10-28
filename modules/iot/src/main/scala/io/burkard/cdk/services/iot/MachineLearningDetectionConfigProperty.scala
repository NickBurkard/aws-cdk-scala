package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MachineLearningDetectionConfigProperty {

  def apply(
    confidenceLevel: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.MachineLearningDetectionConfigProperty.Builder)
      .confidenceLevel(confidenceLevel.orNull)
      .build()
}
