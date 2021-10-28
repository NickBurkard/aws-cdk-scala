package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SageMakerMachineLearningModelResourceDataProperty {

  def apply(
    sageMakerJobArn: Option[String] = None,
    ownerSetting: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty] = None,
    destinationPath: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty.Builder)
      .sageMakerJobArn(sageMakerJobArn.orNull)
      .ownerSetting(ownerSetting.orNull)
      .destinationPath(destinationPath.orNull)
      .build()
}
