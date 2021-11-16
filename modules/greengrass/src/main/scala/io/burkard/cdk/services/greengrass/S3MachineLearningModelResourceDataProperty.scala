package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3MachineLearningModelResourceDataProperty {

  def apply(
    s3Uri: String,
    destinationPath: String,
    ownerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.Builder)
      .s3Uri(s3Uri)
      .destinationPath(destinationPath)
      .ownerSetting(ownerSetting.orNull)
      .build()
}
