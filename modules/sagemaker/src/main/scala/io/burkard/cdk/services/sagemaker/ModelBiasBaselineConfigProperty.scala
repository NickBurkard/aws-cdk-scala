package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelBiasBaselineConfigProperty {

  def apply(
    baseliningJobName: Option[String] = None,
    constraintsResource: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ConstraintsResourceProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder)
      .baseliningJobName(baseliningJobName.orNull)
      .constraintsResource(constraintsResource.orNull)
      .build()
}
