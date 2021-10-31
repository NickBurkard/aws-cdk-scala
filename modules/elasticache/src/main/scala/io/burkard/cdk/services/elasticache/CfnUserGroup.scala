package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserGroup {

  def apply(
    internalResourceId: String,
    userGroupId: Option[String] = None,
    userIds: Option[List[String]] = None,
    engine: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnUserGroup =
    software.amazon.awscdk.services.elasticache.CfnUserGroup.Builder
      .create(stackCtx, internalResourceId)
      .userGroupId(userGroupId.orNull)
      .userIds(userIds.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}
