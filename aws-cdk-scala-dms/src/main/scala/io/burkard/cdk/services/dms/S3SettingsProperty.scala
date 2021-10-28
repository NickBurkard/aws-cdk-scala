package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3SettingsProperty {

  def apply(
    externalTableDefinition: Option[String] = None,
    csvDelimiter: Option[String] = None,
    serviceAccessRoleArn: Option[String] = None,
    compressionType: Option[String] = None,
    csvRowDelimiter: Option[String] = None,
    bucketName: Option[String] = None,
    bucketFolder: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.S3SettingsProperty.Builder)
      .externalTableDefinition(externalTableDefinition.orNull)
      .csvDelimiter(csvDelimiter.orNull)
      .serviceAccessRoleArn(serviceAccessRoleArn.orNull)
      .compressionType(compressionType.orNull)
      .csvRowDelimiter(csvRowDelimiter.orNull)
      .bucketName(bucketName.orNull)
      .bucketFolder(bucketFolder.orNull)
      .build()
}
