package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GroupIdentifierProperty {

  def apply(
    groupId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty.Builder)
      .groupId(groupId.orNull)
      .build()
}
