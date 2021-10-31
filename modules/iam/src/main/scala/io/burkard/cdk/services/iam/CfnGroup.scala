package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGroup {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    groupName: Option[String] = None,
    managedPolicyArns: Option[List[String]] = None,
    policies: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnGroup =
    software.amazon.awscdk.services.iam.CfnGroup.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .groupName(groupName.orNull)
      .managedPolicyArns(managedPolicyArns.map(_.asJava).orNull)
      .policies(policies.map(_.asJava).orNull)
      .build()
}
