package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceDataContainerProperty {

  def apply(
    localDeviceResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty] = None,
    localVolumeResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty] = None,
    sageMakerMachineLearningModelResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty] = None,
    secretsManagerSecretResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty] = None,
    s3MachineLearningModelResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty.Builder)
      .localDeviceResourceData(localDeviceResourceData.orNull)
      .localVolumeResourceData(localVolumeResourceData.orNull)
      .sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData.orNull)
      .secretsManagerSecretResourceData(secretsManagerSecretResourceData.orNull)
      .s3MachineLearningModelResourceData(s3MachineLearningModelResourceData.orNull)
      .build()
}
