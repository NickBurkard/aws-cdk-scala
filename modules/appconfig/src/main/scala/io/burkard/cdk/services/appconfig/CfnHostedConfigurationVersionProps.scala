package io.burkard.cdk.services.appconfig

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHostedConfigurationVersionProps {

  def apply(
    description: Option[String] = None,
    applicationId: Option[String] = None,
    contentType: Option[String] = None,
    latestVersionNumber: Option[Number] = None,
    content: Option[String] = None,
    configurationProfileId: Option[String] = None
  ): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps =
    (new software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps.Builder)
      .description(description.orNull)
      .applicationId(applicationId.orNull)
      .contentType(contentType.orNull)
      .latestVersionNumber(latestVersionNumber.orNull)
      .content(content.orNull)
      .configurationProfileId(configurationProfileId.orNull)
      .build()
}
