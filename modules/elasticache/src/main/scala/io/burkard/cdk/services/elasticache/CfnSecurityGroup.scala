package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityGroup {

  def apply(
    internalResourceId: String,
    description: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnSecurityGroup =
    software.amazon.awscdk.services.elasticache.CfnSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
