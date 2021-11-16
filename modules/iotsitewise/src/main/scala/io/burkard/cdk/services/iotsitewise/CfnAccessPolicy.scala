package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPolicy {

  def apply(
    internalResourceId: String,
    accessPolicyResource: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty,
    accessPolicyIdentity: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty,
    accessPolicyPermission: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy =
    software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.Builder
      .create(stackCtx, internalResourceId)
      .accessPolicyResource(accessPolicyResource)
      .accessPolicyIdentity(accessPolicyIdentity)
      .accessPolicyPermission(accessPolicyPermission)
      .build()
}
