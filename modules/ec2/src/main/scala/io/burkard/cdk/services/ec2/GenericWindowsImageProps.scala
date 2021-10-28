package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GenericWindowsImageProps {

  def apply(
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None
  ): software.amazon.awscdk.services.ec2.GenericWindowsImageProps =
    (new software.amazon.awscdk.services.ec2.GenericWindowsImageProps.Builder)
      .userData(userData.orNull)
      .build()
}
