package io.burkard.cdk.services.directoryservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSimpleADProps {

  def apply(
    name: Option[String] = None,
    size: Option[String] = None,
    vpcSettings: Option[software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty] = None,
    enableSso: Option[Boolean] = None,
    shortName: Option[String] = None,
    password: Option[String] = None,
    description: Option[String] = None,
    createAlias: Option[Boolean] = None
  ): software.amazon.awscdk.services.directoryservice.CfnSimpleADProps =
    (new software.amazon.awscdk.services.directoryservice.CfnSimpleADProps.Builder)
      .name(name.orNull)
      .size(size.orNull)
      .vpcSettings(vpcSettings.orNull)
      .enableSso(enableSso.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .shortName(shortName.orNull)
      .password(password.orNull)
      .description(description.orNull)
      .createAlias(createAlias.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
