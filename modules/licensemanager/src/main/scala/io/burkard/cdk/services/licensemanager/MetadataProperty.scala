package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetadataProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
