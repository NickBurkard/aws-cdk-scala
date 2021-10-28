package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MachineImageConfig {

  def apply(
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    imageId: Option[String] = None,
    osType: Option[software.amazon.awscdk.services.ec2.OperatingSystemType] = None
  ): software.amazon.awscdk.services.ec2.MachineImageConfig =
    (new software.amazon.awscdk.services.ec2.MachineImageConfig.Builder)
      .userData(userData.orNull)
      .imageId(imageId.orNull)
      .osType(osType.orNull)
      .build()
}
