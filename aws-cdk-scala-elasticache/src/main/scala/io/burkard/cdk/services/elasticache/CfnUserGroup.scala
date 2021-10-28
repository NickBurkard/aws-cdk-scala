package io.burkard.cdk.services.elasticache

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
