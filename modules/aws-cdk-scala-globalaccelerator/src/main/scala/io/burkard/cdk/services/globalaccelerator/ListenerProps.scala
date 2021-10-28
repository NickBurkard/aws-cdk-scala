package io.burkard.cdk.services.globalaccelerator

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
