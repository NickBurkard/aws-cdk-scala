package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRole {

  def apply(
    internalResourceId: String,
    maxSessionDuration: Option[Number] = None,
    path: Option[String] = None,
    roleName: Option[String] = None,
    assumeRolePolicyDocument: Option[AnyRef] = None,
    managedPolicyArns: Option[List[String]] = None,
    policies: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissionsBoundary: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnRole =
    software.amazon.awscdk.services.iam.CfnRole.Builder
      .create(stackCtx, internalResourceId)
      .maxSessionDuration(maxSessionDuration.orNull)
      .path(path.orNull)
      .roleName(roleName.orNull)
      .assumeRolePolicyDocument(assumeRolePolicyDocument.orNull)
      .managedPolicyArns(managedPolicyArns.map(_.asJava).orNull)
      .policies(policies.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissionsBoundary(permissionsBoundary.orNull)
      .description(description.orNull)
      .build()
}
