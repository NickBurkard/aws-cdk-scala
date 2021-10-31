package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessPolicyIdentityProperty {

  def apply(
    iamRole: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty] = None,
    iamUser: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty] = None,
    user: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty.Builder)
      .iamRole(iamRole.orNull)
      .iamUser(iamUser.orNull)
      .user(user.orNull)
      .build()
}
