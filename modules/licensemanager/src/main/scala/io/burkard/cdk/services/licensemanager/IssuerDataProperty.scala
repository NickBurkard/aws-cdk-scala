package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IssuerDataProperty {

  def apply(
    name: String,
    signKey: Option[String] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty.Builder)
      .name(name)
      .signKey(signKey.orNull)
      .build()
}
