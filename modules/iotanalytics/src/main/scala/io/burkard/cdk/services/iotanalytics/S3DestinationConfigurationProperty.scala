package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DestinationConfigurationProperty {

  def apply(
    key: String,
    bucket: String,
    roleArn: String,
    glueConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty.Builder)
      .key(key)
      .bucket(bucket)
      .roleArn(roleArn)
      .glueConfiguration(glueConfiguration.orNull)
      .build()
}
