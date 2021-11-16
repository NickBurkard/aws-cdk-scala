package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortRange {

  def apply(
    fromPort: Number,
    toPort: Option[Number] = None
  ): software.amazon.awscdk.services.globalaccelerator.PortRange =
    (new software.amazon.awscdk.services.globalaccelerator.PortRange.Builder)
      .fromPort(fromPort)
      .toPort(toPort.orNull)
      .build()
}
