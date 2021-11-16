package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EntitlementProperty {

  def apply(
    name: String,
    unit: String,
    overage: Option[Boolean] = None,
    maxCount: Option[Number] = None,
    allowCheckIn: Option[Boolean] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty.Builder)
      .name(name)
      .unit(unit)
      .overage(overage.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxCount(maxCount.orNull)
      .allowCheckIn(allowCheckIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .value(value.orNull)
      .build()
}
