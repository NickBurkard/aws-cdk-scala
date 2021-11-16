package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelBiasJobInputProperty {

  def apply(
    groundTruthS3Input: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty,
    endpointInput: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.EndpointInputProperty
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder)
      .groundTruthS3Input(groundTruthS3Input)
      .endpointInput(endpointInput)
      .build()
}
