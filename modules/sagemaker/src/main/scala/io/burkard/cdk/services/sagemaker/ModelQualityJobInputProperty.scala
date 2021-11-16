package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelQualityJobInputProperty {

  def apply(
    groundTruthS3Input: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty,
    endpointInput: software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty.Builder)
      .groundTruthS3Input(groundTruthS3Input)
      .endpointInput(endpointInput)
      .build()
}
