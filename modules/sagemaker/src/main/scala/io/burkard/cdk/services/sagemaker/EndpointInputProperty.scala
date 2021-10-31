package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointInputProperty {

  def apply(
    s3InputMode: Option[String] = None,
    s3DataDistributionType: Option[String] = None,
    endpointName: Option[String] = None,
    localPath: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty.Builder)
      .s3InputMode(s3InputMode.orNull)
      .s3DataDistributionType(s3DataDistributionType.orNull)
      .endpointName(endpointName.orNull)
      .localPath(localPath.orNull)
      .build()
}
