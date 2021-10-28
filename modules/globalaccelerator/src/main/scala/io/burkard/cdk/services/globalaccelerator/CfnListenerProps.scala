package io.burkard.cdk.services.globalaccelerator

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnListenerProps {

  def apply(
    acceleratorArn: Option[String] = None,
    clientAffinity: Option[String] = None,
    portRanges: Option[List[_]] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnListenerProps =
    (new software.amazon.awscdk.services.globalaccelerator.CfnListenerProps.Builder)
      .acceleratorArn(acceleratorArn.orNull)
      .clientAffinity(clientAffinity.orNull)
      .portRanges(portRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
