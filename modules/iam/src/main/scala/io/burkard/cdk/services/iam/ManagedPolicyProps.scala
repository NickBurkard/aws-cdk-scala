package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ManagedPolicyProps {

  def apply(
    path: Option[String] = None,
    users: Option[List[_ <: software.amazon.awscdk.services.iam.IUser]] = None,
    groups: Option[List[_ <: software.amazon.awscdk.services.iam.IGroup]] = None,
    roles: Option[List[_ <: software.amazon.awscdk.services.iam.IRole]] = None,
    statements: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    managedPolicyName: Option[String] = None,
    description: Option[String] = None,
    document: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  ): software.amazon.awscdk.services.iam.ManagedPolicyProps =
    (new software.amazon.awscdk.services.iam.ManagedPolicyProps.Builder)
      .path(path.orNull)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .roles(roles.map(_.asJava).orNull)
      .statements(statements.map(_.asJava).orNull)
      .managedPolicyName(managedPolicyName.orNull)
      .description(description.orNull)
      .document(document.orNull)
      .build()
}
