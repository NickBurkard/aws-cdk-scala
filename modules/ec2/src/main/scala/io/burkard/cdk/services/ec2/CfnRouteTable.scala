package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteTable {

  def apply(
    internalResourceId: String,
    vpcId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnRouteTable =
    software.amazon.awscdk.services.ec2.CfnRouteTable.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
