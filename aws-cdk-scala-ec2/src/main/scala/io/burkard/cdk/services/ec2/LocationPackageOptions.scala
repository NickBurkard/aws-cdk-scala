package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LocationPackageOptions {

  def apply(
    serviceRestartHandles: Option[List[_ <: software.amazon.awscdk.services.ec2.InitServiceRestartHandle]] = None,
    key: Option[String] = None
  ): software.amazon.awscdk.services.ec2.LocationPackageOptions =
    (new software.amazon.awscdk.services.ec2.LocationPackageOptions.Builder)
      .serviceRestartHandles(serviceRestartHandles.map(_.asJava).orNull)
      .key(key.orNull)
      .build()
}
