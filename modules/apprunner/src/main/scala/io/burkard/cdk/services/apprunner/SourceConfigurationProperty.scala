package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfigurationProperty {

  def apply(
    codeRepository: Option[software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty] = None,
    imageRepository: Option[software.amazon.awscdk.services.apprunner.CfnService.ImageRepositoryProperty] = None,
    authenticationConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.AuthenticationConfigurationProperty] = None,
    autoDeploymentsEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty.Builder)
      .codeRepository(codeRepository.orNull)
      .imageRepository(imageRepository.orNull)
      .authenticationConfiguration(authenticationConfiguration.orNull)
      .autoDeploymentsEnabled(autoDeploymentsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
