package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EndpointInputProperty {

  def apply(
    endpointName: String,
    localPath: String,
    s3DataDistributionType: Option[String] = None,
    s3InputMode: Option[String] = None,
    featuresAttribute: Option[String] = None,
    probabilityAttribute: Option[String] = None,
    inferenceAttribute: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.EndpointInputProperty.Builder)
      .endpointName(endpointName)
      .localPath(localPath)
      .s3DataDistributionType(s3DataDistributionType.orNull)
      .s3InputMode(s3InputMode.orNull)
      .featuresAttribute(featuresAttribute.orNull)
      .probabilityAttribute(probabilityAttribute.orNull)
      .inferenceAttribute(inferenceAttribute.orNull)
      .build()
}
