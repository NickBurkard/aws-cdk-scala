package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DestinationConfigurationProperty {

  def apply(
    key: Option[String] = None,
    bucket: Option[String] = None,
    roleArn: Option[String] = None,
    glueConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty.Builder)
      .key(key.orNull)
      .bucket(bucket.orNull)
      .roleArn(roleArn.orNull)
      .glueConfiguration(glueConfiguration.orNull)
      .build()
}
