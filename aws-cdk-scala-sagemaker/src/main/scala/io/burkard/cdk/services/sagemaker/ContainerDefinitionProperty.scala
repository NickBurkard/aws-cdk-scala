package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerDefinitionProperty {

  def apply(
    image: Option[String] = None,
    modelDataUrl: Option[String] = None,
    modelPackageName: Option[String] = None,
    multiModelConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.MultiModelConfigProperty] = None,
    environment: Option[AnyRef] = None,
    imageConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.ImageConfigProperty] = None,
    mode: Option[String] = None,
    containerHostname: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty.Builder)
      .image(image.orNull)
      .modelDataUrl(modelDataUrl.orNull)
      .modelPackageName(modelPackageName.orNull)
      .multiModelConfig(multiModelConfig.orNull)
      .environment(environment.orNull)
      .imageConfig(imageConfig.orNull)
      .mode(mode.orNull)
      .containerHostname(containerHostname.orNull)
      .build()
}
