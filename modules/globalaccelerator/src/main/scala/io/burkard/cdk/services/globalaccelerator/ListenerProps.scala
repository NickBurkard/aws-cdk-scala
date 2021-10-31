package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerProps {

  def apply(
    listenerName: Option[String] = None,
    clientAffinity: Option[software.amazon.awscdk.services.globalaccelerator.ClientAffinity] = None,
    accelerator: Option[software.amazon.awscdk.services.globalaccelerator.IAccelerator] = None,
    portRanges: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.PortRange]] = None,
    protocol: Option[software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol] = None
  ): software.amazon.awscdk.services.globalaccelerator.ListenerProps =
    (new software.amazon.awscdk.services.globalaccelerator.ListenerProps.Builder)
      .listenerName(listenerName.orNull)
      .clientAffinity(clientAffinity.orNull)
      .accelerator(accelerator.orNull)
      .portRanges(portRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
