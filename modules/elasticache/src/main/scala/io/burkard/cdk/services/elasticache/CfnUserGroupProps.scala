package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserGroupProps {

  def apply(
    userGroupId: String,
    engine: String,
    userIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticache.CfnUserGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnUserGroupProps.Builder)
      .userGroupId(userGroupId)
      .engine(engine)
      .userIds(userIds.map(_.asJava).orNull)
      .build()
}
