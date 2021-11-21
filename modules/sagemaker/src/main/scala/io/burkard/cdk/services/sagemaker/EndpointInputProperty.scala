package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointInputProperty {

  def apply(
    endpointName: String,
    localPath: String,
    s3InputMode: Option[String] = None,
    s3DataDistributionType: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.EndpointInputProperty.Builder)
      .endpointName(endpointName)
      .localPath(localPath)
      .s3InputMode(s3InputMode.orNull)
      .s3DataDistributionType(s3DataDistributionType.orNull)
      .build()
}
