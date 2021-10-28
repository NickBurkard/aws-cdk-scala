package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNetworkInterfacePermission {

  def apply(
    internalResourceId: String,
    awsAccountId: Option[String] = None,
    permission: Option[String] = None,
    networkInterfaceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission =
    software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission.Builder
      .create(stackCtx, internalResourceId)
      .awsAccountId(awsAccountId.orNull)
      .permission(permission.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
