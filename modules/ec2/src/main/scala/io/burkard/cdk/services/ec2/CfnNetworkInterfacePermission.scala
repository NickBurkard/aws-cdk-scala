package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInterfacePermission {

  def apply(
    internalResourceId: String,
    awsAccountId: String,
    permission: String,
    networkInterfaceId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission =
    software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission.Builder
      .create(stackCtx, internalResourceId)
      .awsAccountId(awsAccountId)
      .permission(permission)
      .networkInterfaceId(networkInterfaceId)
      .build()
}
