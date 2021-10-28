package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNetworkInterfacePermissionProps {

  def apply(
    awsAccountId: Option[String] = None,
    permission: Option[String] = None,
    networkInterfaceId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps.Builder)
      .awsAccountId(awsAccountId.orNull)
      .permission(permission.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .build()
}
