package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GenericLinuxImageProps {

  def apply(
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None
  ): software.amazon.awscdk.services.ec2.GenericLinuxImageProps =
    (new software.amazon.awscdk.services.ec2.GenericLinuxImageProps.Builder)
      .userData(userData.orNull)
      .build()
}
