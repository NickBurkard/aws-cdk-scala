package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataQualityJobInputProperty {

  def apply(
    endpointInput: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty.Builder)
      .endpointInput(endpointInput.orNull)
      .build()
}
