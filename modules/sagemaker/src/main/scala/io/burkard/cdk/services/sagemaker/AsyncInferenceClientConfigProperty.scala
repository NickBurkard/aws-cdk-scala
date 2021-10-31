package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AsyncInferenceClientConfigProperty {

  def apply(
    maxConcurrentInvocationsPerInstance: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder)
      .maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance.orNull)
      .build()
}
