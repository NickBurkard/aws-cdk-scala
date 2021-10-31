package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPolicyProps {

  def apply(
    users: Option[List[String]] = None,
    groups: Option[List[String]] = None,
    policyName: Option[String] = None,
    policyDocument: Option[AnyRef] = None,
    roles: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.CfnPolicyProps =
    (new software.amazon.awscdk.services.iam.CfnPolicyProps.Builder)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .policyName(policyName.orNull)
      .policyDocument(policyDocument.orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
