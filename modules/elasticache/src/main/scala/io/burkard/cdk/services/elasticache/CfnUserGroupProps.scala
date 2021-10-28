package io.burkard.cdk.services.elasticache

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserGroupProps {

  def apply(
    userGroupId: Option[String] = None,
    userIds: Option[List[String]] = None,
    engine: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnUserGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnUserGroupProps.Builder)
      .userGroupId(userGroupId.orNull)
      .userIds(userIds.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}
