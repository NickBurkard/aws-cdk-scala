package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrafficRoutingConfigProperty {

  def apply(
    canarySize: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty] = None,
    linearStepSize: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.CapacitySizeProperty] = None,
    waitIntervalInSeconds: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty.Builder)
      .canarySize(canarySize.orNull)
      .linearStepSize(linearStepSize.orNull)
      .waitIntervalInSeconds(waitIntervalInSeconds.orNull)
      .`type`(`type`.orNull)
      .build()
}
