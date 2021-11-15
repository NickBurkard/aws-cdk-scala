package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StoppingConditionProperty {

  def apply(
    maxRuntimeInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty.Builder)
      .maxRuntimeInSeconds(maxRuntimeInSeconds.orNull)
      .build()
}
