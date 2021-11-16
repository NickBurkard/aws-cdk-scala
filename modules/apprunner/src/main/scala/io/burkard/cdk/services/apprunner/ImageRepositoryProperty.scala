package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ImageRepositoryProperty {

  def apply(
    imageIdentifier: String,
    imageRepositoryType: String,
    imageConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.ImageConfigurationProperty] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty.Builder)
      .imageIdentifier(imageIdentifier)
      .imageRepositoryType(imageRepositoryType)
      .imageConfiguration(imageConfiguration.orNull)
      .build()
}
