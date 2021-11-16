package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnListenerProps {

  def apply(
    acceleratorArn: String,
    portRanges: List[_],
    protocol: String,
    clientAffinity: Option[String] = None
  ): software.amazon.awscdk.services.globalaccelerator.CfnListenerProps =
    (new software.amazon.awscdk.services.globalaccelerator.CfnListenerProps.Builder)
      .acceleratorArn(acceleratorArn)
      .portRanges(portRanges.asJava)
      .protocol(protocol)
      .clientAffinity(clientAffinity.orNull)
      .build()
}
