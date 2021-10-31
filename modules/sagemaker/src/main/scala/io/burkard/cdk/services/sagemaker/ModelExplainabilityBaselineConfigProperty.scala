package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelExplainabilityBaselineConfigProperty {

  def apply(
    baseliningJobName: Option[String] = None,
    constraintsResource: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ConstraintsResourceProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty.Builder)
      .baseliningJobName(baseliningJobName.orNull)
      .constraintsResource(constraintsResource.orNull)
      .build()
}
