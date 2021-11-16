package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UpsolverS3OutputFormatConfigProperty {

  def apply(
    prefixConfig: software.amazon.awscdk.services.appflow.CfnFlow.PrefixConfigProperty,
    fileType: Option[String] = None,
    aggregationConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.AggregationConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty.Builder)
      .prefixConfig(prefixConfig)
      .fileType(fileType.orNull)
      .aggregationConfig(aggregationConfig.orNull)
      .build()
}
