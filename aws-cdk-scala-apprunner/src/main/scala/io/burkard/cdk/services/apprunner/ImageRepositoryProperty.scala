package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ImageRepositoryProperty {

  def apply(
    imageIdentifier: Option[String] = None,
    imageConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty] = None,
    imageRepositoryType: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty.Builder)
      .imageIdentifier(imageIdentifier.orNull)
      .imageConfiguration(imageConfiguration.orNull)
      .imageRepositoryType(imageRepositoryType.orNull)
      .build()
}
