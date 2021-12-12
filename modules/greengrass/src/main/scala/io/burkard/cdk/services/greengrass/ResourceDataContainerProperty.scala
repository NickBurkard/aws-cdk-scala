package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceDataContainerProperty {

  def apply(
    localDeviceResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty] = None,
    localVolumeResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty] = None,
    sageMakerMachineLearningModelResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty] = None,
    secretsManagerSecretResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty] = None,
    s3MachineLearningModelResourceData: Option[software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty.Builder)
      .localDeviceResourceData(localDeviceResourceData.orNull)
      .localVolumeResourceData(localVolumeResourceData.orNull)
      .sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData.orNull)
      .secretsManagerSecretResourceData(secretsManagerSecretResourceData.orNull)
      .s3MachineLearningModelResourceData(s3MachineLearningModelResourceData.orNull)
      .build()
}
