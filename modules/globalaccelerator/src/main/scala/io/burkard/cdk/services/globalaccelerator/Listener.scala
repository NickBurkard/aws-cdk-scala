package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Listener {

  def apply(
    internalResourceId: String,
    accelerator: software.amazon.awscdk.services.globalaccelerator.IAccelerator,
    listenerName: Option[String] = None,
    clientAffinity: Option[software.amazon.awscdk.services.globalaccelerator.ClientAffinity] = None,
    portRanges: Option[List[_ <: software.amazon.awscdk.services.globalaccelerator.PortRange]] = None,
    protocol: Option[software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.Listener =
    software.amazon.awscdk.services.globalaccelerator.Listener.Builder
      .create(stackCtx, internalResourceId)
      .accelerator(accelerator)
      .listenerName(listenerName.orNull)
      .clientAffinity(clientAffinity.orNull)
      .portRanges(portRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
