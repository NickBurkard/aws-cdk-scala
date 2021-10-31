package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkingProperty {

  def apply(
    monthlyTransfer: Option[Number] = None,
    ports: Option[List[_]] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty.Builder)
      .monthlyTransfer(monthlyTransfer.orNull)
      .ports(ports.map(_.asJava).orNull)
      .build()
}
