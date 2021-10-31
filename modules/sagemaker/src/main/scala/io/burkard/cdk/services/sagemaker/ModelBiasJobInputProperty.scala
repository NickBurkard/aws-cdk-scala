package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelBiasJobInputProperty {

  def apply(
    groundTruthS3Input: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty] = None,
    endpointInput: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder)
      .groundTruthS3Input(groundTruthS3Input.orNull)
      .endpointInput(endpointInput.orNull)
      .build()
}
