package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnManagedPolicy {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    description: Option[String] = None,
    users: Option[List[String]] = None,
    groups: Option[List[String]] = None,
    managedPolicyName: Option[String] = None,
    policyDocument: Option[AnyRef] = None,
    roles: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnManagedPolicy =
    software.amazon.awscdk.services.iam.CfnManagedPolicy.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .description(description.orNull)
      .users(users.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .managedPolicyName(managedPolicyName.orNull)
      .policyDocument(policyDocument.orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
