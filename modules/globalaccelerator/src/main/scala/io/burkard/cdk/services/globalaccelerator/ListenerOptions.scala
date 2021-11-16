package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerOptions {

  def apply(
    portRanges: List[_ <: software.amazon.awscdk.services.globalaccelerator.PortRange],
    listenerName: Option[String] = None,
    clientAffinity: Option[software.amazon.awscdk.services.globalaccelerator.ClientAffinity] = None,
    protocol: Option[software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol] = None
  ): software.amazon.awscdk.services.globalaccelerator.ListenerOptions =
    (new software.amazon.awscdk.services.globalaccelerator.ListenerOptions.Builder)
      .portRanges(portRanges.asJava)
      .listenerName(listenerName.orNull)
      .clientAffinity(clientAffinity.orNull)
      .protocol(protocol.orNull)
      .build()
}
