package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnManagedPolicyProps {

  def apply(
    path: Option[String] = None,
    description: Option[String] = None,
    users: Option[List[String]] = None,
    groups: Option[List[String]] = None,
    managedPolicyName: Option[String] = None,
    policyDocument: Option[AnyRef] = None,
    roles: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.CfnManagedPolicyProps =
    (new software.amazon.awscdk.services.iam.CfnManagedPolicyProps.Builder)
      .path(path.orNull)
      .description(description.orNull)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .managedPolicyName(managedPolicyName.orNull)
      .policyDocument(policyDocument.orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
