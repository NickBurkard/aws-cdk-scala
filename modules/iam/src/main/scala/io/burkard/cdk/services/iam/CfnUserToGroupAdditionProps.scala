package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
