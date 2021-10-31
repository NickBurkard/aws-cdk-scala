package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortRangeProperty {

  def apply(
    toPort: Option[Number] = None,
    fromPort: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty =
    (new software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty.Builder)
      .toPort(toPort.orNull)
      .fromPort(fromPort.orNull)
      .build()
}
