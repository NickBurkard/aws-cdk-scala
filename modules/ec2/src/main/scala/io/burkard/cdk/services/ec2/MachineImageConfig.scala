package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MachineImageConfig {

  def apply(
    userData: software.amazon.awscdk.services.ec2.UserData,
    imageId: String,
    osType: software.amazon.awscdk.services.ec2.OperatingSystemType
  ): software.amazon.awscdk.services.ec2.MachineImageConfig =
    (new software.amazon.awscdk.services.ec2.MachineImageConfig.Builder)
      .userData(userData)
      .imageId(imageId)
      .osType(osType)
      .build()
}
