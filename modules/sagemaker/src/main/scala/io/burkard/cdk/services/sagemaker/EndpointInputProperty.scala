package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointInputProperty {

  def apply(
    endpointName: String,
    localPath: String,
    s3InputMode: Option[String] = None,
    startTimeOffset: Option[String] = None,
    s3DataDistributionType: Option[String] = None,
    endTimeOffset: Option[String] = None,
    probabilityThresholdAttribute: Option[Number] = None,
    probabilityAttribute: Option[String] = None,
    inferenceAttribute: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.EndpointInputProperty.Builder)
      .endpointName(endpointName)
      .localPath(localPath)
      .s3InputMode(s3InputMode.orNull)
      .startTimeOffset(startTimeOffset.orNull)
      .s3DataDistributionType(s3DataDistributionType.orNull)
      .endTimeOffset(endTimeOffset.orNull)
      .probabilityThresholdAttribute(probabilityThresholdAttribute.orNull)
      .probabilityAttribute(probabilityAttribute.orNull)
      .inferenceAttribute(inferenceAttribute.orNull)
      .build()
}
