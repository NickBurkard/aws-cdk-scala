package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3OutputFormatConfigProperty {

  def apply(
    prefixConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty] = None,
    fileType: Option[String] = None,
    aggregationConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty.Builder)
      .prefixConfig(prefixConfig.orNull)
      .fileType(fileType.orNull)
      .aggregationConfig(aggregationConfig.orNull)
      .build()
}
