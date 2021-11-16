package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHostedConfigurationVersionProps {

  def apply(
    applicationId: String,
    contentType: String,
    content: String,
    configurationProfileId: String,
    description: Option[String] = None,
    latestVersionNumber: Option[Number] = None
  ): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps =
    (new software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps.Builder)
      .applicationId(applicationId)
      .contentType(contentType)
      .content(content)
      .configurationProfileId(configurationProfileId)
      .description(description.orNull)
      .latestVersionNumber(latestVersionNumber.orNull)
      .build()
}
