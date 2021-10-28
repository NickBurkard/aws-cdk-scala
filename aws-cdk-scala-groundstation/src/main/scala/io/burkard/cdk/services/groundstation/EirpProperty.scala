package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EirpProperty {

  def apply(
    units: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty.Builder)
      .units(units.orNull)
      .value(value.orNull)
      .build()
}
