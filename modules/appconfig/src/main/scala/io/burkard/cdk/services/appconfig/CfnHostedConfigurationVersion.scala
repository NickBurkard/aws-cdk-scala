package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHostedConfigurationVersion {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    applicationId: Option[String] = None,
    contentType: Option[String] = None,
    latestVersionNumber: Option[Number] = None,
    content: Option[String] = None,
    configurationProfileId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion =
    software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .applicationId(applicationId.orNull)
      .contentType(contentType.orNull)
      .latestVersionNumber(latestVersionNumber.orNull)
      .content(content.orNull)
      .configurationProfileId(configurationProfileId.orNull)
      .build()
}
