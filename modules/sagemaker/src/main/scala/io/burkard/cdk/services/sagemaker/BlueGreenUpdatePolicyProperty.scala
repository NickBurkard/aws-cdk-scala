package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BlueGreenUpdatePolicyProperty {

  def apply(
    trafficRoutingConfiguration: software.amazon.awscdk.services.sagemaker.CfnEndpoint.TrafficRoutingConfigProperty,
    maximumExecutionTimeoutInSeconds: Option[Number] = None,
    terminationWaitInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpoint.BlueGreenUpdatePolicyProperty.Builder)
      .trafficRoutingConfiguration(trafficRoutingConfiguration)
      .maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds.orNull)
      .terminationWaitInSeconds(terminationWaitInSeconds.orNull)
      .build()
}
