package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInterfacePermissionProps {

  def apply(
    awsAccountId: String,
    permission: String,
    networkInterfaceId: String
  ): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps.Builder)
      .awsAccountId(awsAccountId)
      .permission(permission)
      .networkInterfaceId(networkInterfaceId)
      .build()
}
