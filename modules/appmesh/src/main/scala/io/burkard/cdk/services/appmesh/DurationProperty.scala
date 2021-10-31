package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
