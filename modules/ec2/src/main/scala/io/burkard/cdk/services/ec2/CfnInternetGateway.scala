package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInternetGateway {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnInternetGateway =
    software.amazon.awscdk.services.ec2.CfnInternetGateway.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
