package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ModelExplainabilityJobInputProperty {

  def apply(
    endpointInput: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty.Builder)
      .endpointInput(endpointInput.orNull)
      .build()
}
