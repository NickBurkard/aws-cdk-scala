package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlueGreenUpdatePolicyProperty {

  def apply(
    maximumExecutionTimeoutInSeconds: Option[Number] = None,
    terminationWaitInSeconds: Option[Number] = None,
    trafficRoutingConfiguration: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty.Builder)
      .maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds.orNull)
      .terminationWaitInSeconds(terminationWaitInSeconds.orNull)
      .trafficRoutingConfiguration(trafficRoutingConfiguration.orNull)
      .build()
}
