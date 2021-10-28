package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IssuerDataProperty {

  def apply(
    name: Option[String] = None,
    signKey: Option[String] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty.Builder)
      .name(name.orNull)
      .signKey(signKey.orNull)
      .build()
}
