package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Listener {

  def apply(
    internalResourceId: String,
    listenerName: Option[String] = None,
    clientAffinity: Option[software.amazon.awscdk.services.globalaccelerator.ClientAffinity] = None,
    accelerator: Option[software.amazon.awscdk.services.globalaccelerator.IAccelerator] = None,
    portRanges: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.PortRange]] = None,
    protocol: Option[software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.Listener =
    software.amazon.awscdk.services.globalaccelerator.Listener.Builder
      .create(stackCtx, internalResourceId)
      .listenerName(listenerName.orNull)
      .clientAffinity(clientAffinity.orNull)
      .accelerator(accelerator.orNull)
      .portRanges(portRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
