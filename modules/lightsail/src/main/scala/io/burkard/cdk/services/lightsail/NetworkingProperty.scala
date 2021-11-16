package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkingProperty {

  def apply(
    ports: List[_],
    monthlyTransfer: Option[Number] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty.Builder)
      .ports(ports.asJava)
      .monthlyTransfer(monthlyTransfer.orNull)
      .build()
}
