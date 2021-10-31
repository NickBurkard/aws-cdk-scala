package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AsyncInferenceConfigProperty {

  def apply(
    outputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty] = None,
    clientConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty.Builder)
      .outputConfig(outputConfig.orNull)
      .clientConfig(clientConfig.orNull)
      .build()
}
