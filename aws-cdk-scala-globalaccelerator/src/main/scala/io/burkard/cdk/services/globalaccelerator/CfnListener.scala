package io.burkard.cdk.services.globalaccelerator

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnListener {

  def apply(
    internalResourceId: String,
    acceleratorArn: Option[String] = None,
    clientAffinity: Option[String] = None,
    portRanges: Option[List[_]] = None,
    protocol: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.CfnListener =
    software.amazon.awscdk.services.globalaccelerator.CfnListener.Builder
      .create(stackCtx, internalResourceId)
      .acceleratorArn(acceleratorArn.orNull)
      .clientAffinity(clientAffinity.orNull)
      .portRanges(portRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
