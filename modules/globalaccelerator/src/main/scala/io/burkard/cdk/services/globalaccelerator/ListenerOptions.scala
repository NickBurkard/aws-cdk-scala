package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ListenerOptions {

  def apply(
    listenerName: Option[String] = None,
    clientAffinity: Option[software.amazon.awscdk.services.globalaccelerator.ClientAffinity] = None,
    portRanges: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.PortRange]] = None,
    protocol: Option[software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol] = None
  ): software.amazon.awscdk.services.globalaccelerator.ListenerOptions =
    (new software.amazon.awscdk.services.globalaccelerator.ListenerOptions.Builder)
      .listenerName(listenerName.orNull)
      .clientAffinity(clientAffinity.orNull)
      .portRanges(portRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
