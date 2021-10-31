package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserToGroupAddition {

  def apply(
    internalResourceId: String,
    users: Option[List[String]] = None,
    groupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnUserToGroupAddition =
    software.amazon.awscdk.services.iam.CfnUserToGroupAddition.Builder
      .create(stackCtx, internalResourceId)
      .users(users.map(_.asJava).orNull)
      .groupName(groupName.orNull)
      .build()
}
