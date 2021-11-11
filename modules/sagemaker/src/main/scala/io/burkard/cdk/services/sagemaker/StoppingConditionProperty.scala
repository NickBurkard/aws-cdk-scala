package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StoppingConditionProperty {

  def apply(
    maxRuntimeInSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty.Builder)
      .maxRuntimeInSeconds(maxRuntimeInSeconds.orNull)
      .build()
}
