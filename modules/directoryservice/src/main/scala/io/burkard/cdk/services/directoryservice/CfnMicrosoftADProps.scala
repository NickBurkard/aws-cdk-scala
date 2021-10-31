package io.burkard.cdk.services.directoryservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMicrosoftADProps {

  def apply(
    name: Option[String] = None,
    createAlias: Option[Boolean] = None,
    vpcSettings: Option[software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty] = None,
    edition: Option[String] = None,
    enableSso: Option[Boolean] = None,
    shortName: Option[String] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps =
    (new software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder)
      .name(name.orNull)
      .createAlias(createAlias.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcSettings(vpcSettings.orNull)
      .edition(edition.orNull)
      .enableSso(enableSso.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .shortName(shortName.orNull)
      .password(password.orNull)
      .build()
}
