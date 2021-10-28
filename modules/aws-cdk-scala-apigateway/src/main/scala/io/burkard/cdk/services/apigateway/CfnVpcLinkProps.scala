package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVpcLinkProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    targetArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.apigateway.CfnVpcLinkProps =
    (new software.amazon.awscdk.services.apigateway.CfnVpcLinkProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .targetArns(targetArns.map(_.asJava).orNull)
      .build()
}
