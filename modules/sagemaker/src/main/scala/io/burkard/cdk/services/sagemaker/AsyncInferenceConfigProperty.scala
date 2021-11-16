package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AsyncInferenceConfigProperty {

  def apply(
    outputConfig: software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceOutputConfigProperty,
    clientConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceClientConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty.Builder)
      .outputConfig(outputConfig)
      .clientConfig(clientConfig.orNull)
      .build()
}
