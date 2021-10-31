package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3MachineLearningModelResourceDataProperty {

  def apply(
    s3Uri: Option[String] = None,
    ownerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty] = None,
    destinationPath: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.Builder)
      .s3Uri(s3Uri.orNull)
      .ownerSetting(ownerSetting.orNull)
      .destinationPath(destinationPath.orNull)
      .build()
}
