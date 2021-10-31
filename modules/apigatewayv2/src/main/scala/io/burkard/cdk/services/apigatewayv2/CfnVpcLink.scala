package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVpcLink {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    securityGroupIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnVpcLink =
    software.amazon.awscdk.services.apigatewayv2.CfnVpcLink.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .name(name.orNull)
      .tags(tags.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
