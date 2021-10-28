package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InitFileOptions {

  def apply(
    serviceRestartHandles: Option[List[_ <: software.amazon.awscdk.services.ec2.InitServiceRestartHandle]] = None,
    mode: Option[String] = None,
    owner: Option[String] = None,
    base64Encoded: Option[Boolean] = None,
    group: Option[String] = None
  ): software.amazon.awscdk.services.ec2.InitFileOptions =
    (new software.amazon.awscdk.services.ec2.InitFileOptions.Builder)
      .serviceRestartHandles(serviceRestartHandles.map(_.asJava).orNull)
      .mode(mode.orNull)
      .owner(owner.orNull)
      .base64Encoded(base64Encoded.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .group(group.orNull)
      .build()
}
