package io.burkard.cdk.services.directoryservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMicrosoftAD {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    createAlias: Option[Boolean] = None,
    vpcSettings: Option[software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty] = None,
    edition: Option[String] = None,
    enableSso: Option[Boolean] = None,
    shortName: Option[String] = None,
    password: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD =
    software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .createAlias(createAlias.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcSettings(vpcSettings.orNull)
      .edition(edition.orNull)
      .enableSso(enableSso.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .shortName(shortName.orNull)
      .password(password.orNull)
      .build()
}
