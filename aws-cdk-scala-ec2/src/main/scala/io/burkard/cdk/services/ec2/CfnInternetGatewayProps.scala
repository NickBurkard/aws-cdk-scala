package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInternetGatewayProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnInternetGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnInternetGatewayProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
