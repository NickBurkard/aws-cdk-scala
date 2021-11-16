package io.burkard.cdk.services.globalaccelerator

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnListener {

  def apply(
    internalResourceId: String,
    acceleratorArn: String,
    portRanges: List[_],
    protocol: String,
    clientAffinity: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.CfnListener =
    software.amazon.awscdk.services.globalaccelerator.CfnListener.Builder
      .create(stackCtx, internalResourceId)
      .acceleratorArn(acceleratorArn)
      .portRanges(portRanges.asJava)
      .protocol(protocol)
      .clientAffinity(clientAffinity.orNull)
      .build()
}
