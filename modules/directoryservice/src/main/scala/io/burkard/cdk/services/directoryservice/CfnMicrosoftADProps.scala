package io.burkard.cdk.services.directoryservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMicrosoftADProps {

  def apply(
    name: String,
    vpcSettings: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty,
    password: String,
    createAlias: Option[Boolean] = None,
    edition: Option[String] = None,
    enableSso: Option[Boolean] = None,
    shortName: Option[String] = None
  ): software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps =
    (new software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps.Builder)
      .name(name)
      .vpcSettings(vpcSettings)
      .password(password)
      .createAlias(createAlias.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .edition(edition.orNull)
      .enableSso(enableSso.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .shortName(shortName.orNull)
      .build()
}
