package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EntitlementProperty {

  def apply(
    name: Option[String] = None,
    overage: Option[Boolean] = None,
    maxCount: Option[Number] = None,
    allowCheckIn: Option[Boolean] = None,
    unit: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty.Builder)
      .name(name.orNull)
      .overage(overage.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxCount(maxCount.orNull)
      .allowCheckIn(allowCheckIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .unit(unit.orNull)
      .value(value.orNull)
      .build()
}
