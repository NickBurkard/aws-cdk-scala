package io.burkard.cdk.services.directoryservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMicrosoftAD {

  def apply(
    internalResourceId: String,
    name: String,
    vpcSettings: software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.VpcSettingsProperty,
    password: String,
    createAlias: Option[Boolean] = None,
    edition: Option[String] = None,
    enableSso: Option[Boolean] = None,
    shortName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD =
    software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .vpcSettings(vpcSettings)
      .password(password)
      .createAlias(createAlias.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .edition(edition.orNull)
      .enableSso(enableSso.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .shortName(shortName.orNull)
      .build()
}
