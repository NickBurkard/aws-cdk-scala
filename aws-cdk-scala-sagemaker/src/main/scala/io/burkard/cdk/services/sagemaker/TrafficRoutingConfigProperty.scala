package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TrafficRoutingConfigProperty {

  def apply(
    canarySize: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty] = None,
    waitIntervalInSeconds: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty.Builder)
      .canarySize(canarySize.orNull)
      .waitIntervalInSeconds(waitIntervalInSeconds.orNull)
      .`type`(`type`.orNull)
      .build()
}
