package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NamedPackageOptions {

  def apply(
    serviceRestartHandles: Option[List[_ <: software.amazon.awscdk.services.ec2.InitServiceRestartHandle]] = None,
    version: Option[List[String]] = None
  ): software.amazon.awscdk.services.ec2.NamedPackageOptions =
    (new software.amazon.awscdk.services.ec2.NamedPackageOptions.Builder)
      .serviceRestartHandles(serviceRestartHandles.map(_.asJava).orNull)
      .version(version.map(_.asJava).orNull)
      .build()
}
