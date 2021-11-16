package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHostedConfigurationVersion {

  def apply(
    internalResourceId: String,
    applicationId: String,
    contentType: String,
    content: String,
    configurationProfileId: String,
    description: Option[String] = None,
    latestVersionNumber: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion =
    software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.Builder
      .create(stackCtx, internalResourceId)
      .applicationId(applicationId)
      .contentType(contentType)
      .content(content)
      .configurationProfileId(configurationProfileId)
      .description(description.orNull)
      .latestVersionNumber(latestVersionNumber.orNull)
      .build()
}
