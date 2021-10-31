package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPolicy {

  def apply(
    internalResourceId: String,
    accessPolicyResource: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty] = None,
    accessPolicyIdentity: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty] = None,
    accessPolicyPermission: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy =
    software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.Builder
      .create(stackCtx, internalResourceId)
      .accessPolicyResource(accessPolicyResource.orNull)
      .accessPolicyIdentity(accessPolicyIdentity.orNull)
      .accessPolicyPermission(accessPolicyPermission.orNull)
      .build()
}
