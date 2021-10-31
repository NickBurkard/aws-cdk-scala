package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object User {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    permissionsBoundary: Option[software.amazon.awscdk.services.iam.IManagedPolicy] = None,
    groups: Option[List[_ <: software.amazon.awscdk.services.iam.IGroup]] = None,
    passwordResetRequired: Option[Boolean] = None,
    managedPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.IManagedPolicy]] = None,
    userName: Option[String] = None,
    password: Option[software.amazon.awscdk.SecretValue] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.User =
    software.amazon.awscdk.services.iam.User.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .permissionsBoundary(permissionsBoundary.orNull)
      .groups(groups.map(_.asJava).orNull)
      .passwordResetRequired(passwordResetRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .managedPolicies(managedPolicies.map(_.asJava).orNull)
      .userName(userName.orNull)
      .password(password.orNull)
      .build()
}
