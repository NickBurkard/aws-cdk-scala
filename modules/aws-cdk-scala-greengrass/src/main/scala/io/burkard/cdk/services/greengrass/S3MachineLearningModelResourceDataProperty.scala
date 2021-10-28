package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3MachineLearningModelResourceDataProperty {

  def apply(
    s3Uri: Option[String] = None,
    ownerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty] = None,
    destinationPath: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.Builder)
      .s3Uri(s3Uri.orNull)
      .ownerSetting(ownerSetting.orNull)
      .destinationPath(destinationPath.orNull)
      .build()
}
