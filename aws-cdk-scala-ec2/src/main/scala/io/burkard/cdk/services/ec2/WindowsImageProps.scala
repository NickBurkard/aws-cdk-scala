package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WindowsImageProps {

  def apply(
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None
  ): software.amazon.awscdk.services.ec2.WindowsImageProps =
    (new software.amazon.awscdk.services.ec2.WindowsImageProps.Builder)
      .userData(userData.orNull)
      .build()
}
