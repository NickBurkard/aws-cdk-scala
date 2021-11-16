package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserToGroupAddition {

  def apply(
    internalResourceId: String,
    users: List[String],
    groupName: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnUserToGroupAddition =
    software.amazon.awscdk.services.iam.CfnUserToGroupAddition.Builder
      .create(stackCtx, internalResourceId)
      .users(users.asJava)
      .groupName(groupName)
      .build()
}
