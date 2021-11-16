package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVpcLinkProps {

  def apply(
    subnetIds: List[String],
    name: String,
    tags: Option[AnyRef] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps.Builder)
      .subnetIds(subnetIds.asJava)
      .name(name)
      .tags(tags.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
