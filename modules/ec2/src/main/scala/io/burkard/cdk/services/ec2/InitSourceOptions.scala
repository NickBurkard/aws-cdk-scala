package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InitSourceOptions {

  def apply(
    serviceRestartHandles: Option[List[_ <: software.amazon.awscdk.services.ec2.InitServiceRestartHandle]] = None
  ): software.amazon.awscdk.services.ec2.InitSourceOptions =
    (new software.amazon.awscdk.services.ec2.InitSourceOptions.Builder)
      .serviceRestartHandles(serviceRestartHandles.map(_.asJava).orNull)
      .build()
}
