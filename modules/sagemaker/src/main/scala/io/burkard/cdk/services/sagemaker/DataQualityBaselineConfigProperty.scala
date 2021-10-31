package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataQualityBaselineConfigProperty {

  def apply(
    baseliningJobName: Option[String] = None,
    constraintsResource: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ConstraintsResourceProperty] = None,
    statisticsResource: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StatisticsResourceProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty.Builder)
      .baseliningJobName(baseliningJobName.orNull)
      .constraintsResource(constraintsResource.orNull)
      .statisticsResource(statisticsResource.orNull)
      .build()
}
