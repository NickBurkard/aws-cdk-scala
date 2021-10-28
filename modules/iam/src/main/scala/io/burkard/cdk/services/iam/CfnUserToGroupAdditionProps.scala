package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserToGroupAdditionProps {

  def apply(
    users: Option[List[String]] = None,
    groupName: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps =
    (new software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps.Builder)
      .users(users.map(_.asJava).orNull)
      .groupName(groupName.orNull)
      .build()
}
