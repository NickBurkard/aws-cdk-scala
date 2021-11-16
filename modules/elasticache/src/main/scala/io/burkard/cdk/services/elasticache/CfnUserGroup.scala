package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserGroup {

  def apply(
    internalResourceId: String,
    userGroupId: String,
    engine: String,
    userIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticache.CfnUserGroup =
    software.amazon.awscdk.services.elasticache.CfnUserGroup.Builder
      .create(stackCtx, internalResourceId)
      .userGroupId(userGroupId)
      .engine(engine)
      .userIds(userIds.map(_.asJava).orNull)
      .build()
}
