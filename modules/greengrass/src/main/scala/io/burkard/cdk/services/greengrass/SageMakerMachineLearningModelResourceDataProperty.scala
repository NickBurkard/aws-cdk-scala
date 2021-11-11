package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SageMakerMachineLearningModelResourceDataProperty {

  def apply(
    sageMakerJobArn: Option[String] = None,
    ownerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty] = None,
    destinationPath: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.Builder)
      .sageMakerJobArn(sageMakerJobArn.orNull)
      .ownerSetting(ownerSetting.orNull)
      .destinationPath(destinationPath.orNull)
      .build()
}
