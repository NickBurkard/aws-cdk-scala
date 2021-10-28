package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AsyncInferenceClientConfigProperty {

  def apply(
    maxConcurrentInvocationsPerInstance: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder)
      .maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance.orNull)
      .build()
}
