package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetadataProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
