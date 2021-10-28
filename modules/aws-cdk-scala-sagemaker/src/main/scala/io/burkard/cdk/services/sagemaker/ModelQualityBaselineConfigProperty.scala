package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ModelQualityBaselineConfigProperty {

  def apply(
    baseliningJobName: Option[String] = None,
    constraintsResource: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ConstraintsResourceProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty.Builder)
      .baseliningJobName(baseliningJobName.orNull)
      .constraintsResource(constraintsResource.orNull)
      .build()
}
