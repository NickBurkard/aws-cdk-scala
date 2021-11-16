package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortOverride {

  def apply(
    endpointPort: Number,
    listenerPort: Number
  ): software.amazon.awscdk.services.globalaccelerator.PortOverride =
    (new software.amazon.awscdk.services.globalaccelerator.PortOverride.Builder)
      .endpointPort(endpointPort)
      .listenerPort(listenerPort)
      .build()
}
