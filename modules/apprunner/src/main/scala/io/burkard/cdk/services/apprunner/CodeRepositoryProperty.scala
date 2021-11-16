package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeRepositoryProperty {

  def apply(
    sourceCodeVersion: software.amazon.awscdk.services.apprunner.CfnService.SourceCodeVersionProperty,
    repositoryUrl: String,
    codeConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.CodeConfigurationProperty] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.CodeRepositoryProperty.Builder)
      .sourceCodeVersion(sourceCodeVersion)
      .repositoryUrl(repositoryUrl)
      .codeConfiguration(codeConfiguration.orNull)
      .build()
}
