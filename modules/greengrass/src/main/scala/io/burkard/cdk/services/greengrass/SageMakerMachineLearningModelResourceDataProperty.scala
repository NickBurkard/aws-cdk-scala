package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SageMakerMachineLearningModelResourceDataProperty {

  def apply(
    sageMakerJobArn: String,
    destinationPath: String,
    ownerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.Builder)
      .sageMakerJobArn(sageMakerJobArn)
      .destinationPath(destinationPath)
      .ownerSetting(ownerSetting.orNull)
      .build()
}
