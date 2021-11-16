package io.burkard.cdk.services.directoryservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSimpleADProps {

  def apply(
    name: String,
    size: String,
    vpcSettings: software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty,
    password: String,
    enableSso: Option[Boolean] = None,
    shortName: Option[String] = None,
    description: Option[String] = None,
    createAlias: Option[Boolean] = None
  ): software.amazon.awscdk.services.directoryservice.CfnSimpleADProps =
    (new software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder)
      .name(name)
      .size(size)
      .vpcSettings(vpcSettings)
      .password(password)
      .enableSso(enableSso.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .shortName(shortName.orNull)
      .description(description.orNull)
      .createAlias(createAlias.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
