package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPNGateway {

  def apply(
    internalResourceId: String,
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    amazonSideAsn: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPNGateway =
    software.amazon.awscdk.services.ec2.CfnVPNGateway.Builder
      .create(stackCtx, internalResourceId)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .amazonSideAsn(amazonSideAsn.orNull)
      .build()
}
