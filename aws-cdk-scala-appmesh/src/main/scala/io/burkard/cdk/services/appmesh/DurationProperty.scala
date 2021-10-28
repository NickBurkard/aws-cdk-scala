package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DurationProperty {

  def apply(
    unit: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty.Builder)
      .unit(unit.orNull)
      .value(value.orNull)
      .build()
}
