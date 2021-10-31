package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeRepositoryProperty {

  def apply(
    sourceCodeVersion: Option[software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty] = None,
    codeConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty] = None,
    repositoryUrl: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty.Builder)
      .sourceCodeVersion(sourceCodeVersion.orNull)
      .codeConfiguration(codeConfiguration.orNull)
      .repositoryUrl(repositoryUrl.orNull)
      .build()
}
